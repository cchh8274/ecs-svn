package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.EarningsInfoService;

import cn.kanmars.entity.TblEarningsInfo;

/**
 * 赵浩
 * 收益表
 * @author xzkp
 */
@Controller
@RequestMapping(value = "earningsInfo")
public class EarningsInfoController {

	@Autowired
	private EarningsInfoService earningsInfoService;
	/*
	 *收益表查询
	 */
	@RequestMapping("selectList")
    @ResponseBody
    public Map<String,Object> selectList(Integer page,Integer rows,TblEarningsInfo tblEarningsInfo){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", earningsInfoService.selectList(tblEarningsInfo).size());
        map.put("rows", earningsInfoService.selectpage(page,rows,tblEarningsInfo));
        return map;
    }
}
