package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblAmountInfo;

public interface AmountInfoService {

	List<TblAmountInfo> selectList(TblAmountInfo tblAmountInfo);

	List<TblAmountInfo> selectpage(Integer page, Integer rows, TblAmountInfo tblAmountInfo);
//	�ҵ�Ǯ��չʾ�ܽ��
	TblAmountInfo seleSumamountInfo(String openid);
	//����id��ѯ�޸ĵ�ֵ
	TblAmountInfo updateAmountInfo(String id);
//	 ��������
	void addAmountInfo(TblAmountInfo taf);
//	��������
	void insetAmountInfo(TblAmountInfo taf);
//	提现修改总金额
	void pudateTotalAmount(String rfmy,String openid);

}
