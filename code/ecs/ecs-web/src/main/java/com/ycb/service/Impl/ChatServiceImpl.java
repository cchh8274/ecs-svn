package com.ycb.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kanmars.dao.TblMessageInfoMapper;
import cn.kanmars.dao.TblSeesionInfoMapper;
import cn.kanmars.entity.IDGeneratorTools;
import cn.kanmars.entity.TblMessageInfo;
import cn.kanmars.entity.TblSeesionInfo;

import com.ycb.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService {


	@Autowired
	private TblSeesionInfoMapper tblSeesionInfoMapper;
	@Autowired
	private TblMessageInfoMapper tblMessageInfoMapper;

	@Override
	public void sendMessage(String openid, String message) throws Exception {
		TblSeesionInfo	tblSeesionInfo=new TblSeesionInfo();
		tblSeesionInfo.setOpenId(openid);
		TblSeesionInfo session = tblSeesionInfoMapper.select(tblSeesionInfo);
		String  sessionID=null;
		if(session == null){
			sessionID=IDGeneratorTools.createId();
			TblSeesionInfo	tblSeesioninsertInfo=new TblSeesionInfo();
			tblSeesioninsertInfo.setOpenId(openid);
			tblSeesioninsertInfo.setSessionId(sessionID);
			tblSeesioninsertInfo.setStatus("020");
			tblSeesioninsertInfo.setSessionStatus("init");
			tblSeesionInfoMapper.insert(tblSeesioninsertInfo);
		}else{
			sessionID=session.getSessionId();
		}
		TblMessageInfo ms = new TblMessageInfo();
		ms.setOpendId(openid);
		ms.setMessage(message);
		ms.setSessionId(sessionID);
		ms.setStateZt("010"); //010 用户端
		SimpleDateFormat fmd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String da = fmd.format(new Date());
		ms.setMessageTime(da);
		tblMessageInfoMapper.insert(ms);
	}

	@Override
	public List<HashMap<String,String>> queryMessage(String id) {
		return tblMessageInfoMapper.queryMessagebyOpenid(id);
	}


//	/*
//	 * 定时扫描长时间没有聊天的会话不展示
//	 * 
//	 * @see com.ycb.service.ChatService#myTest()
//	 */
//	// @Scheduled(cron="0/5 * *  * * ? ") //每5秒执行一次
//	@Override
//	public void myTest() {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date now = new Date();
//		Date afterDate = new Date(now.getTime() - 600000);// 十分钟以前的时间
//		String date = sdf.format(afterDate).toString();
//		HashMap map = new HashMap();
//		// 查询十分钟没有聊天的id
//		List<TabMessage> list = messageMapper.querDateUser(date);
//
//		// 修改没有聊天的状态不在会话框展示
//		if (list != null) {
//			tabChatMapper.updateChat(list);
//		}
//
//	}


}
