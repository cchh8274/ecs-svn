package com.ycb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.OrderPaymentService;

import cn.kanmars.entity.PagerEntity;
import cn.kanmars.entity.TblOrderDeal;

/**
 * 张见军
 * 订单支付表
 * @author Administrator
 *
 */
@Controller
@RequestMapping("orderpay")
public class OrderPaymentCotroller {
	
	/*
	 *订单支付表查询
	 */
	@Autowired
	private OrderPaymentService orderPaymentService;
	
	@RequestMapping(value="orderPayment")
	@ResponseBody
	public Map<String,Object> selectOrderPayment(@RequestParam int page,int rows){
	 Map<String,Object> map = new HashMap<String, Object>();
     map.put("total", orderPaymentService.queryorderPayment().size());
     map.put("rows", orderPaymentService.selectorderPayment(page,rows));
     return map;
    }
}
