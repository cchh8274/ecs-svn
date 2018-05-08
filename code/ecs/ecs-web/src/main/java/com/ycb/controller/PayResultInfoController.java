package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.PayResultInfoService;

import cn.kanmars.entity.TblAmountInfo;
import cn.kanmars.entity.TblPayResultInfo;

/**
 * 赵浩
 * 支付结果通知表
 * @author xzkp
 */
@Controller
@RequestMapping(value = "payResultInfo")
public class PayResultInfoController {

	@Autowired
	private PayResultInfoService payResultInfoService;
	
	/*
	 *支付结果通知表查询
	 */
	@RequestMapping("selectList")
    @ResponseBody
    public Map<String,Object> selectList(Integer page,Integer rows,TblPayResultInfo tblPayResultInfo){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", payResultInfoService.selectList(tblPayResultInfo).size());
        map.put("rows", payResultInfoService.selectpage(page,rows,tblPayResultInfo));
        return map;
    }
}
