package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblEarningsGather;
import cn.kanmars.entity.TblEarningsInfo;

public interface EarningsInfoService {

	List<TblEarningsInfo> selectpage(Integer page, Integer rows, TblEarningsInfo tblEarningsInfo);

	List<TblEarningsInfo> selectList(TblEarningsInfo tblEarningsInfo);
//	������ϸ
	List<TblEarningsInfo> detailEdearningsInfo(String openid);

	TblEarningsInfo queryEarningsInfo(String id);

	void updEarningsInfo(TblEarningsInfo tei);

	void delEarningsInfo(String ids);

	void insetEarningsInfo(TblEarningsInfo tei);
//	收益明细
	List<TblEarningsInfo> shouyimingxi(String openid);
//月收益
	List<TblEarningsInfo> shouyimingxiyue(String openid, String yuekai, String yuejie);
//日收益
	List<TblEarningsInfo> shouyimingxiyueri(String openid, String rikai, String rijie);
	

}
