package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.WxUserInfoService;

import cn.kanmars.dao.TblWxUserInfoMapper;
import cn.kanmars.entity.TblWxUserInfo;
@Service
public class WxUserInfoServiceImpl implements WxUserInfoService {
	@Autowired
	private TblWxUserInfoMapper tblWxUserInfoMapper;
	/*
	 * zjj 分页查询
	 * @see com.ycb.service.WxUserInfoService#queryWxUserInfo()
	 */
	@Override
	public List<TblWxUserInfo> queryWxUserInfo() {
		
		return tblWxUserInfoMapper.queryWxUserInfo();
	}

	@Override
	public List<TblWxUserInfo> selectqueryWxUserInfo(int page, int rows) {
		TblWxUserInfo twu = new TblWxUserInfo();
		page =(page-1)*rows;
		twu.setLimitSize(rows);
		twu.setLimitStart(page);
		return tblWxUserInfoMapper.selectqueryWxUserInfo(twu);
	}

}
