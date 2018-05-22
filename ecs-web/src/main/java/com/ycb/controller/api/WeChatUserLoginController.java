package com.ycb.controller.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.base.BaseController;
import com.ycb.util.Constants;
import com.ycb.util.HttpUtils;

/**
 * 微信用户登录
 * 
 * @author chenghui
 *
 */
@Controller
@RequestMapping("/wxlogin")
public class WeChatUserLoginController extends BaseController{

	private final Log logger = LogFactory.getLog(this.getClass());
	private static HashMap<String,String> params=new HashMap<String,String>(); //请求微信的参数

	/**
	 * 获取用户的openID
	 * 由于公众号是静默授权，因此通过前端获取到的微信的code 同一个接口即可以获取token信息， 也可以获取用户的openid
	 * 不需要在往下请求用户的信息
	 * 不涉及到用户表的操作 
	 * jsonStr={'code':}
	 * @return
	 */
	@RequestMapping(value="/login",produces="text/html; charset=UTF-8",method=RequestMethod.POST)
	@ResponseBody
	public String wxUserLogin(String jsonStr) {
		System.out.println("WeChatUserLoginController.wxUserLogin --微信用户授权开始 ");
		logger.info("WeChatUserLoginController.wxUserLogin --微信用户授权成功 ,code为" + jsonStr);
		try {
			if(StringUtils.isEmpty(jsonStr)){
			return this.toJSONString("error","不能为空");
			}
			JSONObject json = JSON.parseObject(jsonStr);
			String code = json.getString("code");
			if(StringUtils.isEmpty(code)){
				return this.toErroJSONString("code为空!");
			}
			String url = requestOpenid(code);
			logger.info("WeChatUserLoginController.wxUserLogin--用户授权成功,通过code获取access_token,URL为=》" + url);
			String result = HttpUtils.submitGet(url);
			if(StringUtils.isEmpty(result)){
				return this.toErroJSONString("获取微信用户openid为空!");
			}
			logger.info("WeChatUserLoginController.wxUserLogin--请求微信=》返回的结果为=》" + result);
			JSONObject info = JSON.parseObject(result);
			Map<String, String> map = new HashMap<String, String>();
			logger.info("WeChatUserLoginController.wxUserLogin--微信接口响应格式化" + info);
			map.put("openid", (String) info.get("openid"));
			return this.toJSONString(map);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			return this.toErroJSONString("系统异常!");
		}
	}
	
	/**
	 * 拼装 openid 参数
	 * 
	 * @param code
	 * @return
	 */
	public static String requestOpenid(String code) {
		final String openid_url = "https://api.weixin.qq.com/sns/oauth2/access_token";
		StringBuffer url = new StringBuffer();
		url.append(openid_url).append("?appid=").append(Constants.APPID)
				.append("&secret=").append(Constants.SECRET).append("&code=")
				.append(code).append("&grant_type=authorization_code");
		return url.toString();
	}


	

}
