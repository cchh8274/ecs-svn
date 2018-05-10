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
//	我的钱包展示总金额
	@Override
	public TblAmountInfo seleSumamountInfo(String openid) {
		
		return tblAmountInfoMapper.seleSumamountInfo(openid);
	}
	//根据id查询修改的值
	@Override
	public TblAmountInfo updateAmountInfo(String id) {
		return tblAmountInfoMapper.updateAmountInfo(id);
	}
//	 新增方法
	@Override
	public void addAmountInfo(TblAmountInfo taf) {
		
		tblAmountInfoMapper.addAmountInfo(taf);
	}
//	新增数据
	@Override
	public void insetAmountInfo(TblAmountInfo taf) {
		tblAmountInfoMapper.insetAmountInfo(taf);
		
	}
	
}
