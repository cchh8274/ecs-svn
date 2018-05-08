package cn.kanmars.dao;

import java.util.HashMap;
import java.util.List;

import cn.kanmars.entity.TabMessage;
import cn.kanmars.entity.TabSurface;

/*
 * 聊天接口
 */
public interface TabChatMapper {

	/*TabSurface chaunJianHuiHua(String userId);
	//添加会话
	void addchaunJianHuiHua(TabSurface af);*/
	
	TabSurface querySeesionInfo(String openid);

	void addSession(HashMap map);
	//修改为正在会话
	void updSession(String openid);

	void updateChat(List<TabMessage> list);

	void updateChat(HashMap map);

	String seleid(String openid);

}
