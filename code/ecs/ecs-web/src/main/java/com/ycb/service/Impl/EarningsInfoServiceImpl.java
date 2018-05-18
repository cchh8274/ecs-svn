package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.EarningsInfoService;

import cn.kanmars.dao.TblEarningsInfoMapper;
import cn.kanmars.entity.TblEarningsGather;
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
//	收益明细
	@Override
	public List<TblEarningsInfo> detailEdearningsInfo(String openid) {
		
		return tblEarningsGatherMapper.detailEdearningsInfo(openid);
	}

	@Override
	public void delEarningsInfo(String ids) {
		tblEarningsGatherMapper.delEarningsInfo(ids);
	}

	@Override
	public void insetEarningsInfo(TblEarningsInfo tei) {
		tblEarningsGatherMapper.insetEarningsInfo(tei);
	}

	@Override
	public TblEarningsInfo queryEarningsInfo(String id) {
		return tblEarningsGatherMapper.queryEarningsInfo(id);
	}

	@Override
	public void updEarningsInfo(TblEarningsInfo tei) {
		tblEarningsGatherMapper.updEarningsInfo(tei);
	}
//	收益明细
	@Override
	public List<TblEarningsInfo> shouyimingxi(String openid) {
		return tblEarningsGatherMapper.shouyimingxi(openid);
	}
		//月
	@Override
	public List<TblEarningsInfo> shouyimingxiyue(String openid, String yuekai, String yuejie) {
		
		return tblEarningsGatherMapper.shouyimingxiyue(openid, yuekai,yuejie);
	}
	//日
	@Override
	public List<TblEarningsInfo> shouyimingxiyueri(String openid, String rikai, String rijie) {
		return tblEarningsGatherMapper.shouyimingxiyueri(openid,rikai,rijie);
	}

}
