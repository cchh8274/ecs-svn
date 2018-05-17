package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblWxUserIntention;

public interface WxUserIntentionService {

	List<TblWxUserIntention> queryWxUserIntention();

	List<TblWxUserIntention> selectWxUserIntention(int page, int rows);

}
