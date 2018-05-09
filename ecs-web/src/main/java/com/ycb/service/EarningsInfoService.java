package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblEarningsInfo;

public interface EarningsInfoService {

	List<TblEarningsInfo> selectpage(Integer page, Integer rows, TblEarningsInfo tblEarningsInfo);

	List<TblEarningsInfo> selectList(TblEarningsInfo tblEarningsInfo);

	void insetEarningsInfo(TblEarningsInfo tei);

	TblEarningsInfo queryEarningsInfo(String id);

	void updEarningsInfo(TblEarningsInfo tei);

	void delEarningsInfo(String ids);

}
