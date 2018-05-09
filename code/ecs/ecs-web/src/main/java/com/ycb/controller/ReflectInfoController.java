package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.ReflectInfoService;

import cn.kanmars.entity.TblPayResultInfo;
import cn.kanmars.entity.TblReflectInfo;

/**
 * 赵浩
 * 体现记录表
 * @author xzkp
 */
@Controller
@RequestMapping(value = "reflectInfo")
public class ReflectInfoController {
	
	@Autowired
	private ReflectInfoService reflectInfoService;

	/*
	 *体现记录表查询
	 */
	@RequestMapping("selectList")
    @ResponseBody
    public Map<String,Object> selectList(Integer page,Integer rows,TblReflectInfo tblReflectInfo){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", reflectInfoService.selectList(tblReflectInfo).size());
        map.put("rows", reflectInfoService.selectpage(page,rows,tblReflectInfo));
        return map;
    }
}
