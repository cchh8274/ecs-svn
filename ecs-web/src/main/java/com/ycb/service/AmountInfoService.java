package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblAmountInfo;

public interface AmountInfoService {

	List<TblAmountInfo> selectList(TblAmountInfo tblAmountInfo);

	List<TblAmountInfo> selectpage(Integer page, Integer rows, TblAmountInfo tblAmountInfo);
//	我的钱包展示总金额
	TblAmountInfo seleSumamountInfo(String openid);
	//根据id查询修改的值
	TblAmountInfo updateAmountInfo(String id);
//	 新增方法
	void addAmountInfo(TblAmountInfo taf);
//	新增数据
	void insetAmountInfo(TblAmountInfo taf);

}
