package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.AmountInfoService;

import cn.kanmars.entity.TblAmountInfo;
import cn.kanmars.entity.TblEarningsInfo;

/**
 * 赵浩
 * 用户账户表
 * @author xzkp
 */
@Controller
@RequestMapping(value = "amountInfo")
public class AmountInfoController {
	
	@Autowired
	private AmountInfoService amountInfoService;

	/*
	 *户账户表
	 */
	@RequestMapping("selectList")
    @ResponseBody
    public Map<String,Object> selectList(Integer page,Integer rows,TblAmountInfo tblAmountInfo){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", amountInfoService.selectList(tblAmountInfo).size());
        map.put("rows", amountInfoService.selectpage(page,rows,tblAmountInfo));
        return map;
    }
}
