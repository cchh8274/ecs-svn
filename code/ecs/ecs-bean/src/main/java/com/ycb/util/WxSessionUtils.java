package com.ycb.util;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.cache.ApplicationCache;

@Service
public class WxSessionUtils implements ApplicationContextAware {

	protected static Log logger = LogFactory.getLog(WxSessionUtils.class);

	private ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	@PostConstruct
	public synchronized void init() {
		try {
			logger.info("WxSessionUtils.init--初始化微信token信息开始");
			fillApplicationCache();
			new Thread(new Runnable() {
				public void run() {
					while (true) {
						fillApplicationCache();
						try {						
							Thread.sleep(30000 * 240);// 每7200秒刷新一次缓存
						} catch (InterruptedException e) {
							logger.error("刷新数据token异常", e);
						}
					}
				}
			}).start();
		} catch (Exception e) {
			logger.debug("WxSessionUtils.init在初始化时发生异常", e);
			fillApplicationCache();
		}

	}

	private static void fillApplicationCache() {
		String params = Constants.ACCESS_TOKEN_URL
				+ "?grant_type=client_credential&" + "appid=" + Constants.APPID
				+ "&secret=" + Constants.SECRET;
		String response = HttpUtils.submitGet(params);
		JSONObject info = JSON.parseObject(response);
		String token = info.getString("access_token");
		if (StringUtils.isEmpty(token)) {
			logger.info("WxSessionUtils.fillApplicationCache同步微信用户列表,获取token信息为空");
			return;
		}
		ApplicationCache.getInstance().put("WX_SESSION_TOKEN", token);
	}

	public static String getToken() {
		String token = (String) ApplicationCache.getInstance().get(
				"WX_SESSION_TOKEN");
		if (StringUtils.isEmpty(token)) {
			fillApplicationCache();
			return getToken();
		}
		return token;
	}
}
