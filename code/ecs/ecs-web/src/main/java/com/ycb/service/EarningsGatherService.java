package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblEarningsGather;

public interface EarningsGatherService {

	List<TblEarningsGather> selectList(TblEarningsGather tblEarningsGather);

	List<TblEarningsGather> selectpage(Integer page, Integer rows, TblEarningsGather tblEarningsGather);

	void insetEarningsGather(TblEarningsGather teg);

	TblEarningsGather queryEarningsGather(String id);

	void updEarningsGather(TblEarningsGather teg);

	void delEarningsGather(String ids);
//	收益明细
	List<TblEarningsGather> shouyimingxi(String openid);

}
