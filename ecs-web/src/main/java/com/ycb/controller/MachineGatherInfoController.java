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

import com.ycb.service.MachineGatherInfoService;

import cn.kanmars.entity.TblEarningsGather;
import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblMachineGatherInfo;
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

	//跳转新增页面
		@RequestMapping(value="addMachineGatherInfo")
		public String addMachineGatherInfo() {
			return "addMachineGatherInfo";
		}
	//添加信息
		@RequestMapping(value="insetMachineGatherInfo")
		@ResponseBody
		public void insetMachineGatherInfo(TblMachineGatherInfo tmgi,HttpServletRequest request){
			String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
			TblLogin attribute = (TblLogin) request.getSession().getAttribute("user");
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
				Date date = new Date();
				String da = df.format(date);
				tmgi.setId(replaceAll);
				tmgi.setCreateTime(da);
				tmgi.setCreateUser(attribute.getAdminName());
				machineGatherInfoService.insetMachineGatherInfo(tmgi);
			}
			
	//修改回显
		@RequestMapping(value="upQueryMachineGatherInfo")
			public String upQueryMachineGatherInfo(String id,Model model){
			TblMachineGatherInfo tmgi  = machineGatherInfoService.upQueryMachineGatherInfo(id);
				model.addAttribute("tmgi", tmgi);
				return "updMachineGatherInfo";
		}
	//修改
		@RequestMapping(value="updMachineGatherInfo")
		@ResponseBody
		public void updMachineGatherInfo(TblMachineGatherInfo tmgi,HttpServletRequest request){
			TblLogin attribute = (TblLogin) request.getSession().getAttribute("user");
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			Date date = new Date();
			String da = df.format(date);
			tmgi.setUpdateTime(da);
			tmgi.setUpdateUser(attribute.getAdminName());
			machineGatherInfoService.updMachineGatherInfo(tmgi);
		}
					
	//删除
		@RequestMapping("delMachineGatherInfo")
		@ResponseBody
		public Map<String,Object> delMachineGatherInfo(String ids){
			Map<String,Object> map = new HashMap<String, Object>();
			try {
				machineGatherInfoService.delMachineGatherInfo(ids);
				map.put("success", true);
			} catch (Exception e) {
				e.printStackTrace();
				map.put("success", false);
			}
			return map;
		}
}
