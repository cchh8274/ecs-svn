package com.ycb.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.base.BaseController;
import com.ycb.service.AmountInfoService;
import com.ycb.service.EarningsGatherService;
import com.ycb.service.EarningsInfoService;
import com.ycb.service.MachineGatherInfoService;
import com.ycb.util.DateUtils;

import cn.kanmars.entity.TblAmountInfo;
import cn.kanmars.entity.TblEarningsGather;
import cn.kanmars.entity.TblEarningsInfo;
import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblMachineGatherInfo;
/**
 * 赵浩
 * 收益表
 * @author xzkp
 */
@Controller
@RequestMapping(value = "earningsInfo")
public class EarningsInfoController extends BaseController{

	@Autowired
	private EarningsInfoService earningsInfoService;
	@Autowired
	private EarningsGatherService earningsGatherService;
	//总收益
	@Autowired
	private AmountInfoService amountInfoService;
	//我的咖啡机
	@Autowired
	private MachineGatherInfoService machineGatherInfoService;
	/*
	 *收益表查询
	 */
	@RequestMapping("selectList")
    @ResponseBody
    public Map<String,Object> selectList(Integer page,Integer rows,TblEarningsInfo tblEarningsInfo){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", earningsInfoService.selectList(tblEarningsInfo).size());
        map.put("rows", earningsInfoService.selectpage(page,rows,tblEarningsInfo));
        return map;
    }
	
	//跳转新增页面
	@RequestMapping(value="addEarningsInfo")
	public String addEarningsInfo() {
		return "addEarningsInfo";
	}
	//添加信息
	@RequestMapping(value="insetEarningsInfo")
	@ResponseBody
	public void insetEarningsInfo(TblEarningsInfo tei,HttpServletRequest request){
		String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
		TblLogin attribute = (TblLogin) request.getSession().getAttribute("user");
		    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		      Date date = new Date();
		      String da = df.format(date);
		      tei.setId(replaceAll);
		      tei.setCreateTime(da);
		      tei.setCreateUser(attribute.getAdminName());
		      earningsInfoService.insetEarningsInfo(tei);
	}
	
	//修改回显
		@RequestMapping(value="queryEarningsInfo")
		public String queryEarningsInfo(String id,Model model){
			TblEarningsInfo teif  = earningsInfoService.queryEarningsInfo(id);
			model.addAttribute("teif", teif);
			return "updEarningsInfo";
		}
		//修改
		@RequestMapping(value="updEarningsInfo")
		@ResponseBody
		public void updEarningsInfo(TblEarningsInfo tei,HttpServletRequest request){
	    	TblLogin attribute = (TblLogin) request.getSession().getAttribute("user");
	    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	        Date date = new Date();
	        String da = df.format(date);
	        tei.setUpdateTime(da);
	        tei.setUpdateUser(attribute.getAdminName());
	        earningsInfoService.updEarningsInfo(tei);
		}
		
	//删除
		@RequestMapping("delEarningsInfo")
		@ResponseBody
		public Map<String,Object> delEarningsInfo(String ids){
			Map<String,Object> map = new HashMap<String, Object>();
			try {
				earningsInfoService.delEarningsInfo(ids);
				map.put("success", true);
			} catch (Exception e) {
				e.printStackTrace();
				map.put("success", false);
			}
			return map;
		}
		/**
		 * 收益明细
		 */
     @RequestMapping(value="shouyimingxi",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String shouyimingxi(String jsonStr){
		try {
			//JSONObject json = JSON.parseObject(jsonStr);
			//String openid = json.getString("openid");
			String openid = jsonStr;
			TblMachineGatherInfo kfj =machineGatherInfoService.selemachineGatherInfKFJ(openid);
			if(kfj==null){
				HashMap<String, String> mmp = new HashMap<String, String>();
				mmp.put("success", "当前没有咖啡机");
				return this.toJSONString(mmp);
			}
	 String rikai = DateUtils.getBeforeDaybb(); 
     String rijie = DateUtils.getBeforeDaybb();
	List<TblEarningsInfo>  ri=earningsInfoService.shouyimingxiyueri(openid,rikai,rijie);
	List<Map<String,String>> list = new  ArrayList<Map<String,String>>();
	for (TblEarningsInfo tblEarningsInfo : ri) {
		HashMap<String, String> hp = new HashMap<String, String>();
		hp.put("dayProfit", tblEarningsInfo.getPrice());//日收益
		String unversityId = tblEarningsInfo.getUnversityId();//明天用
		TblEarningsGather yue=earningsGatherService.shouyimingxiyue(unversityId,DateUtils.getStringAllDate());
		TblEarningsGather  zong=earningsGatherService.shouyimingxizong(unversityId);
			hp.put("unversityName", zong.getUnversityName());
			hp.put("unversityId", zong.getUnversityId());
			hp.put("openid", zong.getOpenid());
		    hp.put("profitTime", yue.getStartEarningTime());//收益时间
			hp.put("monthProfit", yue.getNumber());//月收益
			hp.put("establishTime", zong.getCreatetime());//创建时间
			hp.put("totalProfit", zong.getNumber());//总收益
		list.add(hp);
	}
	HashMap<String, Object> hmp = new HashMap<String, Object>();
	TblAmountInfo atf= amountInfoService.seleSumamountInfo(openid);
	hmp.put("totalCash", atf);//提现总额
	hmp.put("detailed", list);//明细
	return this.toJSONString(hmp);

	} catch (Exception e) {
		e.printStackTrace();
	}
	return this.toJSONString("error","错误");
	}

}
