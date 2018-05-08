package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.MachineGatherInfoService;
/**
 * zjj
 * 用户咖啡机表
 * @author Administrator
 *
 */
@Controller
@RequestMapping("MachineGatherInfo")
public class MachineGatherInfoController {
	@Autowired
	private MachineGatherInfoService machineGatherInfoService;
	/*
	 * zjj
	 * 分页查询
	 */
	@RequestMapping(value="queryMachineGatherInfo")
	@ResponseBody
	public Map<String,Object> queryMachineGatherInfo(@RequestParam int page,int rows){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", machineGatherInfoService.queryMachineGatherInfo().size());
		map.put("rows", machineGatherInfoService.selectMachineGatherInfo(page,rows));
		return map;
	}

}
