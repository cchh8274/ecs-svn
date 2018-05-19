package com.ycb.controller;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kanmars.entity.TblMessageInfo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.base.BaseController;
import com.ycb.service.ChatService;

/*
 * 聊天表
 */
@Controller
@RequestMapping("chat")
public class ChatController extends BaseController {

	/*
	 * 用户创建会话
	 */
	@Autowired
	private ChatService chatService;
	/**
	 * 发送消息
	 * @param jsonStr
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value = "sendMessage",method=RequestMethod.POST)
	@ResponseBody
	public String addMessage(String jsonStr){
		try {
			if (StringUtils.isEmpty(jsonStr)) {
				return this.toJSONString("error", "参数为空!");
			}
			JSONObject json = JSON.parseObject(jsonStr);
			String openid = json.getString("openid");
			String message = json.getString("message");
			if (StringUtils.isEmpty(openid)) {
				return this.toJSONString("error", "openid不能为空!");
			}
			if (StringUtils.isEmpty(message)) {
				return this.toJSONString("error", "消息不能为空!");
			}
			chatService.sendMessage(openid,message);
			return this.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return this.toJSONString("error", "系统异常!");
		}
	}
	/*
	 * 查询消息
	 */
	@RequestMapping(value = "queryMessage",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	@ResponseBody
	public String queryMessage(String jsonStr)  {
		try {
			if (StringUtils.isEmpty(jsonStr)) {
				return this.toJSONString("error", "参数为空!");
			}
			JSONObject json = JSON.parseObject(jsonStr);
			String openid = json.getString("openid");
			if (StringUtils.isEmpty(openid)) {
				return this.toJSONString("error", "openid不能为空!");
			}
			List<HashMap<String,String>> list=chatService.queryMessage(openid);
			list.sort(new Comparator<HashMap<String,String>>() {
				@Override
				public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {
					if (o1.get("time").compareTo(o2.get("time"))<0)
						return -1;
					return 1;
				}
			});
			return this.toJSONString(list);
		} catch (Exception e) {
			e.printStackTrace();
			return this.toJSONString("error", "系统异常!");
		}
	}
}
