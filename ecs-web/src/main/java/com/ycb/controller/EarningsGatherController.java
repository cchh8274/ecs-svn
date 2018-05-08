package com.ycb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.EarningsGatherService;

import cn.kanmars.entity.TblEarningsGather;

/**
 * 赵浩
 * 收益汇总表
 * @author xzkp
 *
 */
@Controller
@RequestMapping(value = "earningsGather")
public class EarningsGatherController {

	@Autowired
	private EarningsGatherService earningsGatherService;
	/*
	 *收益汇总表查询
	 */
	@RequestMapping("selectList")
    @ResponseBody
    public Map<String,Object> selectList(Integer page,Integer rows,TblEarningsGather tblEarningsGather){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", earningsGatherService.selectList(tblEarningsGather).size());
        map.put("rows", earningsGatherService.selectpage(page,rows,tblEarningsGather));
        return map;
    }
}
