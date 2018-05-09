package com.ycb.service;

import java.util.HashMap;
import java.util.List;

import cn.kanmars.entity.TblMessageInfo;

/*
 * 聊天表
 */
public interface ChatService {


	void sendMessage(String openid, String message) throws Exception;

	List<HashMap<String,String>> queryMessage(String id);
	


}
