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

import cn.kanmars.entity.TblAreaInfo;
import cn.kanmars.entity.TblLogin;

import com.ycb.service.AreaInfoService;

/**
 * zjj 区域表
 * @author Administrator
 *
 */
@Controller
@RequestMapping("AreaInfo")
public class AreaInfoController {
	@Autowired
	private AreaInfoService areaInfoService;
	/*
	 * zjj
	 * 分页查询
	 */
	@RequestMapping(value="queryAreaInfo")
	@ResponseBody
	public Map<String,Object> queryAreaInfo(@RequestParam int page,int rows){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", areaInfoService.queryAreaInfo().size());
		map.put("rows", areaInfoService.selectAreaInfo(page,rows));
		
		return map;
	}
	//查询修改
	@RequestMapping(value="updAreaInfoa")
	public String updAreaInfoa(String id,Model model){
		TblAreaInfo aif = areaInfoService.updAreaInfoa(id);
		model.addAttribute("aif", aif);
		return "updAreaInfo";
	}
	//修改新增
	@RequestMapping(value="updAreaInfob")
	@ResponseBody
	public void updAreaInfob(TblAreaInfo tai,HttpServletRequest request){
		TblLogin taif = (TblLogin) request.getSession().getAttribute("user");
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	        Date date = new Date();
	        String da = df.format(date);
		tai.setUpdateTime(da);
		tai.setUpUser(taif.getAdminName());
		areaInfoService.updAreaInfob(tai);
	}
	//跳转新增页面
	@RequestMapping(value="addaerainfoz")
	public String addaerainfoz(){
		return "addAreaInfo";
	}
	//新增信息
	@RequestMapping(value="insetAerainfoz")
	@ResponseBody
	public void insetAerainfoz(TblAreaInfo tif,HttpServletRequest request){
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		TblLogin taif = (TblLogin) request.getSession().getAttribute("user");
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	        Date date = new Date();
	        String da = df.format(date);
	    tif.setId(uuid);
		tif.setCreateUser(taif.getAdminName());
		tif.setCreateTime(da);
		areaInfoService.insetAerainfoz(tif);
	}
	
	

}
