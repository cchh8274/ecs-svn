package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.OrderInfService;

/**
 * zjj
 * 点单表
 * @author Administrator
 *
 */
@Controller
@RequestMapping("OrderInf")
public class OrderInfController {
	/*
	 * zjj 
	 * 查询分页
	 */
	@Autowired
	private OrderInfService orderInfService;
	@RequestMapping(value="queryOrderInf")
	@ResponseBody
	private Map<String,Object> queryOrderInf(@RequestParam int page,int rows){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", orderInfService.queryOrderInf().size());
		map.put("rows", orderInfService.selectOrderInf(page,rows));
		return map;
	}

}
