package com.ycb.service;

import java.util.List;
import java.util.Map;

import cn.kanmars.entity.TblOrderInfo;

public interface OrderInfService {

	List<TblOrderInfo> queryOrderInf();

	List<TblOrderInfo> selectOrderInf(int page, int rows);

}
