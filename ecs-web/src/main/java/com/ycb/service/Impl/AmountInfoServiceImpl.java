package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.AmountInfoService;

import cn.kanmars.dao.TblAmountInfoMapper;
import cn.kanmars.dao.TblEarningsInfoMapper;
import cn.kanmars.entity.TblAmountInfo;
import cn.kanmars.entity.TblBankamountInfo;

@Service
public class AmountInfoServiceImpl implements AmountInfoService{

	@Autowired
	private TblAmountInfoMapper tblAmountInfoMapper;

	@Override
	public List<TblAmountInfo> selectList(TblAmountInfo tblAmountInfo) {
		return tblAmountInfoMapper.selectList(tblAmountInfo);
	}

	@Override
	public List<TblAmountInfo> selectpage(Integer page, Integer rows, TblAmountInfo tblAmountInfo) {
		TblAmountInfo tai = new TblAmountInfo(); 
		page = (page-1)*rows;
		tai.setLimitSize(rows);
		tai.setLimitStart(page);
	    return tblAmountInfoMapper.selectpage(tai);
	}
	@Override
	public TblAmountInfo seleSumamountInfo(String openid) {
		
		return tblAmountInfoMapper.seleSumamountInfo(openid);
	}
	@Override
	public TblAmountInfo updateAmountInfo(String id) {
		return tblAmountInfoMapper.updateAmountInfo(id);
	}
	@Override
	public void addAmountInfo(TblAmountInfo taf) {
		
		tblAmountInfoMapper.addAmountInfo(taf);
	}
	@Override
	public void insetAmountInfo(TblAmountInfo taf) {
		tblAmountInfoMapper.insetAmountInfo(taf);
		
	}
//	提现修改总金额
	@Override
	public void pudateTotalAmount(String rfmy,String openid) {
		tblAmountInfoMapper.pudateTotalAmount(rfmy,openid);
		
	}
	
}
