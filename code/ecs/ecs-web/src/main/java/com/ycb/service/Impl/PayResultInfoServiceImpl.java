package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.PayResultInfoService;

import cn.kanmars.dao.TblPayResultInfoMapper;
import cn.kanmars.entity.TblAmountInfo;
import cn.kanmars.entity.TblPayResultInfo;

@Service
public class PayResultInfoServiceImpl implements PayResultInfoService{

	@Autowired
	private TblPayResultInfoMapper tblPayResultInfoMapper;

	@Override
	public List<TblPayResultInfo> selectList(TblPayResultInfo tblPayResultInfo) {
		return tblPayResultInfoMapper.selectList(tblPayResultInfo);
	}

	@Override
	public List<TblPayResultInfo> selectpage(Integer page, Integer rows, TblPayResultInfo tblPayResultInfo) {
		TblPayResultInfo tpi = new TblPayResultInfo(); 
		page = (page-1)*rows;
		tpi.setLimitSize(rows);
		tpi.setLimitStart(page);
	    return tblPayResultInfoMapper.selectpage(tpi);
	}
}
