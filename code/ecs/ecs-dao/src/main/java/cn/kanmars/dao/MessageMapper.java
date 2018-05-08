package cn.kanmars.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import cn.kanmars.entity.TabMessage;
import cn.kanmars.entity.TabSurface;

public interface MessageMapper {

	

	List<TabMessage> queryMessage(String id);

	void insechaunJianHuiHua(TabMessage ms);
	//查询十分钟没有聊天的人
	List<TabMessage> querDateUser(String date);




}
