package cn.kanmars.dao;

import java.util.HashMap;

import java.util.List;

import cn.kanmars.entity.TblWxUserIntention;

public interface TblWxUserIntentionMapper {
  /* int deleteByPrimaryKey(String id);*/

	List<TblWxUserIntention> queryWxUserIntention();

	List<TblWxUserIntention> selectWxUserIntention(TblWxUserIntention twui);
    
	//查询用户存在不存在
	TblWxUserIntention panDuanwxUserIntention(String openid);
	//如果存在就直接添加
	void insetwxUserIntention(HashMap<String, String> map);
}