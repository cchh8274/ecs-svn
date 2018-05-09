package com.ycb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.jms.TopicRequestor;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.service.UniversitService;

import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblUniversityInfo;

/**
 * 张见军
 * 大学表查询
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="Universit",produces="text/html; charset=UTF-8")
public class UniversitController extends BaseController{
	@Autowired
	private UniversitService universitService;
	@RequestMapping("queryUniversit")
    @ResponseBody
    public Map<String,Object> queryUniversit(Integer page,Integer rows){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", universitService.queryTiaoSu().size());
        map.put("rows", universitService.selectAreaInfoa(page,rows));
        return map;
    }
	//修改大学信息
	@RequestMapping(value="updateUniversit")
	public String updateUniversit(String id,Model model){
		TblUniversityInfo tuif  = universitService.updateUniversit(id);
		model.addAttribute("tuif", tuif);
		return "updUniversit";
	}
	//修改新增
	@RequestMapping(value="addUniversit")
	@ResponseBody
	public void addUniversit(TblUniversityInfo tui,HttpServletRequest request){
    	TblLogin attribute = (TblLogin) request.getSession().getAttribute("user");
    	  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date date = new Date();
        String da = df.format(date);
        tui.setUpTime(da);
        tui.setUpUser(attribute.getAdminName());
		universitService.addUniversit(tui);
	}
	//跳转新增页面
		@RequestMapping(value="addUniversita")
		public String addUniversita() {
			return "addUniversit";
		}
	//添加信息
		@RequestMapping(value="insetUniversita")
		@ResponseBody
		public void insetUniversita(TblUniversityInfo tui,HttpServletRequest request){
			String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
			TblLogin attribute = (TblLogin) request.getSession().getAttribute("user");
	    	  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	        Date date = new Date();
	        String da = df.format(date);
	        tui.setId(replaceAll);
	        tui.setCreateTime(da);
	        tui.setCreateUser(attribute.getAdminName());
	        universitService.insetUniversita(tui);
		}
		//大学信息
		@RequestMapping(value="daxuediqubiao")
		@ResponseBody
		public String queryAddUniversita(String jsonStr) throws Exception{
		
			if(StringUtils.isEmpty(jsonStr)){
					return this.toJSONString("error","参数为空");
			}
			JSONObject json = JSON.parseObject(jsonStr);
			//json.getString()
			String ocad = "0"+ json.getString("areaId");
			
			//这个ocad就是数据的area_id字段
			List<TblUniversityInfo> unv = universitService.queryAddUniversita(ocad);
			return this.toJSONString(unv);
		}
		//大学详细信息
		@RequestMapping(value="daXuXinXiXangQing")
		@ResponseBody
		public String daXuXinXiXangQing(String jsonStr) throws Exception{
			if(StringUtils.isEmpty(jsonStr)){
				return this.toJSONString("error","参数为空");
			}
			JSONObject json = JSON.parseObject(jsonStr);
			String code = json.getString("code");//大学信息的code唯一的不能为空
			List<TblUniversityInfo> cd = universitService.daXuXinXiXangQing(code);
			return this.toJSONString(cd);
		}

}
