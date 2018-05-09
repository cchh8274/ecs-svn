package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblAmountInfo;

public interface AmountInfoService {

	List<TblAmountInfo> selectList(TblAmountInfo tblAmountInfo);

	List<TblAmountInfo> selectpage(Integer page, Integer rows, TblAmountInfo tblAmountInfo);

}
