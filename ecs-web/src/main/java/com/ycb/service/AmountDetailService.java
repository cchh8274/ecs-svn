package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblAmountDetail;

public interface AmountDetailService {

	List<TblAmountDetail> selectList(TblAmountDetail ablAmountDetail);

	List<TblAmountDetail> selectpage(Integer page, Integer rows, TblAmountDetail ablAmountDetail);

}
