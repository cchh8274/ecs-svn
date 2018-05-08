package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblEarningsGather;

public interface EarningsGatherService {

	List<TblEarningsGather> selectList(TblEarningsGather tblEarningsGather);

	List<TblEarningsGather> selectpage(Integer page, Integer rows, TblEarningsGather tblEarningsGather);

}
