package com.ycb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.MachineIfmService;

import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblMachineInfo;
/**
 * zjj
 * 机器信息表
 * @author Administrator
 *
 */
@Controller
@RequestMapping("MachineIfm")
public class MachineIfmController {
	/*
	 * 分页查询
	 */
	@Autowired
	private MachineIfmService machineIfmService;
	@RequestMapping(value="queryMachineIfm")
	@ResponseBody
	public Map<String,Object> queryMachineIfm(@RequestParam int page,int rows){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", machineIfmService.queryMachineIfm().size());
		map.put("rows", machineIfmService.selectMachineIfm(page,rows));
		return map;
	}
	//修改查询
	@RequestMapping(value="selectaMachineIfm")
	public String selectMachineIfm(String id,Model model){
		TblMachineInfo tmif = machineIfmService.selectaMachineIfm(id);
		model.addAttribute("tmif", tmif);
		return "updMachineInfo";
	}
	//修改新增
	@RequestMapping(value="addMachineIfm")
	@ResponseBody
	public void addMachineIfm(TblMachineInfo mif,HttpServletRequest request){
		//String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
		TblLogin attribute = (TblLogin) request.getSession().getAttribute("user");
    	  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date date = new Date();
        String da = df.format(date);
		mif.setUpdateTime(da);
		mif.setUpdateUser(attribute.getAdminName());
		machineIfmService.addMachineIfm(mif);
	}
	//跳转新增 页面
	@RequestMapping(value="tiaozhuanadd")
	public String tiaozhuanadd(){
		return "addMachineInfo";
	}
	//添加信息
		@RequestMapping(value="insetMachineIfm")
		@ResponseBody
		public void insetMachineIfm(TblMachineInfo mif,HttpServletRequest request){
			String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
			TblLogin attribute = (TblLogin) request.getSession().getAttribute("user");
	    	  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	        Date date = new Date();
	        String da = df.format(date);
	        mif.setId(replaceAll);
	        mif.setCreateUser(attribute.getAdminName());
	        mif.setCreateTime(da);
			machineIfmService.insetMachineIfm(mif);
		}

}
