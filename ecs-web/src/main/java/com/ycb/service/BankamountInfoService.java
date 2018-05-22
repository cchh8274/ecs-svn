package com.ycb.service;

import java.util.HashMap;
import java.util.List;

import cn.kanmars.entity.TblBankamountInfo;

public interface BankamountInfoService {

	List<TblBankamountInfo> selectList(TblBankamountInfo tblBankamountInfo);

	List<TblBankamountInfo> selectpage(Integer page, Integer rows, TblBankamountInfo tblBankamountInfo);
	//查询用户当前有没有这张银行卡
	String seleBankamountInfo(String bankAmountNo);
	//添加银行卡
	void addBankamountInfo(HashMap<String, String> hmap);
	//查询该用户有几张银行卡
	List<TblBankamountInfo> seleAllBankamountInfo(String openid);
	 //查询选中的银行卡
	TblBankamountInfo dangeBankamountInfo(String bankAmountNo);
	//回显银行卡
	TblBankamountInfo dangeBankamountInfohui(String openid);
	
	TblBankamountInfo panduPwd(String openid);

}
