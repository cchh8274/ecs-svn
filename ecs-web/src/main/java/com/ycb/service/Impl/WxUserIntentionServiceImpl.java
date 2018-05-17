package com.ycb.service.Impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.WxUserIntentionService;

import cn.kanmars.dao.TblWxUserIntentionMapper;
import cn.kanmars.entity.TblWxUserIntention;

@Service
public class WxUserIntentionServiceImpl implements WxUserIntentionService {

	@Autowired
	private TblWxUserIntentionMapper tblWxUserIntentionMapper;
	//根据用户的openid去查询当前用户有没有 
	@Override
	public TblWxUserIntention panDuanwxUserIntention(String openid) {
		
		return tblWxUserIntentionMapper.panDuanwxUserIntention(openid);
	}
	//如果存在就直接添加
	@Override
	public void insetwxUserIntention(HashMap<String, String> map) {
		tblWxUserIntentionMapper.insetwxUserIntention(map);
	}

	@Override
	public List<TblWxUserIntention> queryWxUserIntention() {
		return tblWxUserIntentionMapper.queryWxUserIntention();
	}

	@Override
	public List<TblWxUserIntention> selectWxUserIntention(int page, int rows) {
		TblWxUserIntention twui = new TblWxUserIntention();
		  page = (page-1)*rows;
		  twui.setLimitSize(rows);
		  twui.setLimitStart(page);
	      return tblWxUserIntentionMapper.selectWxUserIntention(twui);
	}
}
