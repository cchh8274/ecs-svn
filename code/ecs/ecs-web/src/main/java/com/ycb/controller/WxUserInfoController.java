package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.WxUserInfoService;

/**
 * zjj
 * 微信用户表
 * @author Administrator
 *
 */
@Controller
@RequestMapping("WxUserInfo")
public class WxUserInfoController {
	/*
	 * 张见军 分页查询 
	 */
	@Autowired
	private WxUserInfoService wxUserInfoService;
	@RequestMapping("queryWxUserInfo")
	@ResponseBody
	public Map<String,Object> queryWxUserInfo(@RequestParam int page,int rows){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", wxUserInfoService.queryWxUserInfo().size());
		map.put("rows", wxUserInfoService.selectqueryWxUserInfo(page,rows));
		return map;
	}

}
