package com.ycb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.service.UniversitService;
import com.ycb.service.UniversityDetailsService;

import cn.kanmars.entity.TblUniversityDetails;

@Controller
@RequestMapping("universityDetails")
public class UniversityDetailsController extends BaseController{
	//大学详情表
	@Autowired
	private UniversityDetailsService universityDetailsService;
	//大学表
	@Autowired
	private UniversitService universitService;
	/**
	 * 查询大学详细信息
	 * @param jsonStr
	 * @return
	 */
	@RequestMapping(value="seleUniversityDetails",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String seleUniversityDetails(String jsonStr){
		try {
			JSONObject json = JSON.parseObject(jsonStr);
			String id = json.getString("id");
			List<TblUniversityDetails> und = universityDetailsService.seleUniversityDetails(id);
			return this.toJSONString(und);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.toJSONString("success","出现错误写正确的信息");
	}
	/**
	 * 查询大学详情表
	 */
	@RequestMapping(value="seleXQUniversityDetails",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String seleXQUniversityDetails(String jsonStr){
		
		try {
		JSONObject json = JSON.parseObject(jsonStr);
		String code = json.getString("code");
			//String code = jsonStr;
		   //通过传过来的ocde查询大学的id
			String un = universitService.idUnXinXi(code);
			if(un==null){
				return this.toJSONString("success","code错误");
			}
			//根据得到的id去查大学的详情
			String id = un;
			List<TblUniversityDetails> und = universityDetailsService.seleUniversityDetails(id);
			return this.toJSONString(und);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.toJSONString("success","出现错误写正确的信息");
	}
	
}
