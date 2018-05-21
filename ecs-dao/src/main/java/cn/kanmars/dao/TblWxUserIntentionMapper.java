package cn.kanmars.dao;

import java.util.HashMap;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kanmars.entity.TblWxUserIntention;

public interface TblWxUserIntentionMapper {
  /* int deleteByPrimaryKey(String id);*/

	List<TblWxUserIntention> queryWxUserIntention();

	List<TblWxUserIntention> selectWxUserIntention(TblWxUserIntention twui);
    
	//查询用户存在不存在
	String panDuanwxUserIntention(String openid);
	//如果存在就直接添加
	void insetwxUserIntention(HashMap<String, String> map);
	//加入过不能重复加入
	TblWxUserIntention panDuanjiawxUserIntention(@Param("universityId")String universityId,@Param("openid") String openid);
}