package com.ycb.service.Impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.BankamountInfoService;

import cn.kanmars.dao.TblBankamountInfoMapper;
import cn.kanmars.entity.TblBankamountInfo;

@Service
public class BankamountInfoServiceImpl implements BankamountInfoService{

	@Autowired
	private TblBankamountInfoMapper tblBankamountInfoMapper;

	@Override
	public List<TblBankamountInfo> selectList(TblBankamountInfo tblBankamountInfo) {
		return tblBankamountInfoMapper.selectList(tblBankamountInfo);
	}

	@Override
	public List<TblBankamountInfo> selectpage(Integer page, Integer rows, TblBankamountInfo tblBankamountInfo) {
		TblBankamountInfo tif = new TblBankamountInfo(); 
		page = (page-1)*rows;
	    tif.setLimitSize(rows);
	  	tif.setLimitStart(page);
	    return tblBankamountInfoMapper.selectpage(tif);
	}
	//查询当前有没有银行卡//添加银行卡
	@Override
	public TblBankamountInfo seleBankamountInfo(String bankAmountNo) {
		
		return tblBankamountInfoMapper.seleBankamountInfo(bankAmountNo);
	}
	//添加银行卡
	@Override
	public void addBankamountInfo(HashMap<String, String> hmap) {
		tblBankamountInfoMapper.addBankamountInfo(hmap);
		
	}
	//查询该用户有几张银行卡
	@Override
	public List<TblBankamountInfo> seleAllBankamountInfo(String openid) {
		
		return tblBankamountInfoMapper.seleAllBankamountInfo(openid);
	}
	 //查询选中的银行卡
	@Override
	public TblBankamountInfo dangeBankamountInfo(String bankAmountNo) {
		
		return tblBankamountInfoMapper.dangeBankamountInfo(bankAmountNo);
	}
}
