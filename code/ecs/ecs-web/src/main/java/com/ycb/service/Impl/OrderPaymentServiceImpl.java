package com.ycb.service.Impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.OrderPaymentService;

import cn.kanmars.dao.TblOrderDealMapper;
import cn.kanmars.entity.TblOrderDeal;
@Service
public class OrderPaymentServiceImpl implements OrderPaymentService{
	
	@Autowired
	private TblOrderDealMapper tblOrderDealMapper;
	/*
     * zjj查询分页
     */
	@Override
	public List<TblOrderDeal> queryorderPayment() {
		
		return tblOrderDealMapper.queryorderPayment();
	}
	/*
     * zjj查询分页
     */
	@Override
	public List<TblOrderDeal> selectorderPayment(int page, int rows) {
		TblOrderDeal tod = new TblOrderDeal();
		  page = (page-1)*rows;
		  tod.setLimitSize(rows);
		  tod.setLimitStart(page);
	      return tblOrderDealMapper.selectorderPayment(tod);
	}

	
	
	

}
