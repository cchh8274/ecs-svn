package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblWxUserInfo;

public interface WxUserInfoService {

	List<TblWxUserInfo> queryWxUserInfo();

	List<TblWxUserInfo> selectqueryWxUserInfo(int page, int rows);

}
