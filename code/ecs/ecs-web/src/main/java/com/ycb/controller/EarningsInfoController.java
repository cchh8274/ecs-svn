package com.ycb.controller;

import java.text.SimpleDateFormat;
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
import com.ycb.service.EarningsInfoService;
import com.ycb.util.DateUtils;

import cn.kanmars.entity.TblEarningsInfo;
import cn.kanmars.entity.TblLogin;
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
			JSONObject json = JSON.parseObject(jsonStr);
			String openid = json.getString("openid");
	//String openid=jsonStr;
	List<TblEarningsInfo>  zong=earningsInfoService.shouyimingxi(openid);
	String yuekai = DateUtils.getBeforeDayaavvv();
	String yuejie = DateUtils.getBeforeDayaa();
	List<TblEarningsInfo>  yue=earningsInfoService.shouyimingxiyue(openid,yuekai,yuejie);
	 String rikai = DateUtils.getBeforeDaybb()+" 00:00:00"; 
     String rijie = DateUtils.getBeforeDaybb()+" 23:59:59";
	List<TblEarningsInfo>  ri=earningsInfoService.shouyimingxiyueri(openid,rikai,rijie);
	for (int i = 0; i < zong.size(); i++) {
		for (int j = 0; j < yue.size(); j++) {
			for (int j2 = 0; j2 < ri.size(); j2++) {
				if(zong.get(i).getUnversityId().equals(yue.get(j).getUnversityId())){
					zong.get(i).setYueshouyi(yue.get(j).getPrice());
				}
				if(zong.get(i).getUnversityId().equals(ri.get(j2).getUnversityId())){
					zong.get(i).setRishouyi(ri.get(j2).getPrice());
				}
			}
		}
	}
	return this.toJSONString(zong);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return this.toJSONString("error","错误");
	}
}
