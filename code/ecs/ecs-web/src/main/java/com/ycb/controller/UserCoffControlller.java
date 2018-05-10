package com.ycb.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.service.UserCoffService;

import cn.kanmars.entity.TblUserCoffeemachine;

/**
 * 用户咖啡机明细
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="coff")
public class UserCoffControlller extends BaseController {
	@Autowired
	private UserCoffService userCoffService;
	/*
	 * 查询我的咖啡机明细
	 */
	@RequestMapping(value="seleUserCoff",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String seleUserCoff(String jsonStr)throws Exception{
		//String openid=jsonStr;
		if(StringUtils.isEmpty(jsonStr)){
			return this.toJSONString("error","不能为空");
		}
		JSONObject json = JSON.parseObject(jsonStr);
		String openid = json.getString("openid");
		List<TblUserCoffeemachine> ucf = userCoffService.seleUserCoff(openid);
		if(ucf ==null){
			return this.toJSONString("erroe","当前没有咖啡机");
		}
		return this.toJSONString(ucf);
	}

}
