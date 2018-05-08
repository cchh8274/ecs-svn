package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblOrderDeal;

public interface OrderPaymentService {


	List<TblOrderDeal>  queryorderPayment();

	List<TblOrderDeal>  selectorderPayment(int page, int rows);



	
}
