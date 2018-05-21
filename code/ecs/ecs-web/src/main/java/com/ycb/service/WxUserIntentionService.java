package com.ycb.service;

import java.util.HashMap;

import cn.kanmars.entity.TblWxUserIntention;

import java.util.List;

import cn.kanmars.entity.TblWxUserIntention;

public interface WxUserIntentionService {
	//根据用户的openid去查询当前用户有没有 
	String panDuanwxUserIntention(String openid);
	//如果存在就直接添加
	void insetwxUserIntention(HashMap<String, String> map);
	
	List<TblWxUserIntention> queryWxUserIntention();

	List<TblWxUserIntention> selectWxUserIntention(int page, int rows);
	TblWxUserIntention panDuanjiawxUserIntention(String universityId, String openid);

}
