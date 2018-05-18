package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.service.AmountInfoService;

import cn.kanmars.entity.IDGeneratorTools;
import cn.kanmars.entity.TblAmountInfo;
import cn.kanmars.entity.TblEarningsInfo;

/**
 * 赵浩
 * 用户账户表
 * @author xzkp
 */
@Controller
@RequestMapping(value = "amountInfo")
public class AmountInfoController extends BaseController{
	
	@Autowired
	private AmountInfoService amountInfoService;

	/*
	 *户账户表
	 */
	@RequestMapping("selectList")
    @ResponseBody
    public Map<String,Object> selectList(Integer page,Integer rows,TblAmountInfo tblAmountInfo){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", amountInfoService.selectList(tblAmountInfo).size());
        map.put("rows", amountInfoService.selectpage(page,rows,tblAmountInfo));
        return map;
    }
	/*
	 * 我的钱包展示总金额
	 */
	@RequestMapping(value="seleSumamountInfo",produces="text/html; charset=UTF-8")
    @ResponseBody
    public String seleSumamountInfo(String jsonStr) throws Exception{
		//String openid = jsonStr;
		if(StringUtils.isEmpty(jsonStr)){
			return this.toJSONString("error","不能为空");
		}
		JSONObject json = JSON.parseObject(jsonStr);
		String openid = json.getString("openid");
		
		TblAmountInfo atf= amountInfoService.seleSumamountInfo(openid);
           if(atf == null){
			return this.toJSONString("error","没有余额");
		 }

		return this.toJSONString(atf);
	}
	/*
	 * 跳转修改页面
	 */
	@RequestMapping(value="updateAmountInfo")
	public String updateAmountInfo(String id,Model model) throws Exception{
		TblAmountInfo  taf=amountInfoService.updateAmountInfo(id);
		model.addAttribute("taf", taf);
		return "UpdAmountInfo";
	}
	/*
	 * 修改的新增
	 */
	@RequestMapping(value="addAmountInfo")
    @ResponseBody
    public void addAmountInfo(TblAmountInfo taf) throws Exception{
		amountInfoService.addAmountInfo(taf);
	}
	/*
	 * 跳转新增页面
	 */
	@RequestMapping(value="tiaoAmountInfoa")
	public String tiaoAmountInfoa() throws Exception{
		return "AddAmountInfo";
	}
	/**
	 * 新增数据
	 */
	@RequestMapping(value="insetAmountInfo")
    @ResponseBody
    public void insetAmountInfo(TblAmountInfo taf) throws Exception{
		taf.setId(IDGeneratorTools.createId());
		amountInfoService.insetAmountInfo(taf);
	}
}
