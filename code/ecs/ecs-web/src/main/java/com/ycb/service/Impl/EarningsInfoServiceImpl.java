package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.EarningsInfoService;

import cn.kanmars.dao.TblEarningsInfoMapper;
import cn.kanmars.entity.TblEarningsInfo;

@Service
public class EarningsInfoServiceImpl implements EarningsInfoService{
	
	@Autowired
	private TblEarningsInfoMapper tblEarningsGatherMapper;

	@Override
	public List<TblEarningsInfo> selectpage(Integer page, Integer rows, TblEarningsInfo tblEarningsInfo) {
		TblEarningsInfo tei = new TblEarningsInfo(); 
		page = (page-1)*rows;
		tei.setLimitSize(rows);
		tei.setLimitStart(page);
		return tblEarningsGatherMapper.selectpage(tei);
	}

	@Override
	public List<TblEarningsInfo> selectList(TblEarningsInfo tblEarningsInfo) {
		return tblEarningsGatherMapper.selectList(tblEarningsInfo);
	}

}
