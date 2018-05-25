
package com.ycb.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.base.BaseController;
import com.ycb.service.UniversitService;
import com.ycb.service.UniversityDetailsService;

import cn.kanmars.entity.TblUniversityDetails;

@Controller
@RequestMapping("universityDetails")
public class UniversityDetailsController extends BaseController{
	//大学详情表
	@Autowired
	private UniversityDetailsService universityDetailsService;
	/**
	 * 查询大学详情表
	 */
	@RequestMapping(value="seleXQUniversityDetails",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String seleXQUniversityDetails(){
		try {
			List<TblUniversityDetails> und = universityDetailsService.seleUniversityDetailsaaa();
			return this.toJSONString(und);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.toJSONString("error","出现错误写正确的信息");
	}
	
}
