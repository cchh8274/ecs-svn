package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.service.WxUserIntentionService;
import com.ycb.util.DateUtils;

import cn.kanmars.entity.IDGeneratorTools;
import cn.kanmars.entity.TblWxUserIntention;
/*
 * 有意向的微信用户
 */
@Controller
@RequestMapping(value="wxUserIntention")
public class WxUserIntentionController extends BaseController{
	@Autowired
	private WxUserIntentionService wxUserIntentionService;	
	/*
	 * 判断当前用户存在不存在
	 */
	@RequestMapping(value="panDuanwxUserIntention",produces="text/html; charset=UTF-8")
	@ResponseBody
	private String panDuanwxUserIntention(String jsonStr) throws Exception{
		try {
		//String openid = jsonStr;
		//根据用户的openid去查询当前用户有没有 
		JSONObject json = JSON.parseObject(jsonStr);
		String openid = json.getString("openid");
		String universityName = json.getString("universityName");
		TblWxUserIntention wui=wxUserIntentionService.panDuanwxUserIntention(openid);
		if(wui == null){
			return this.toJSONString("error","不存在");
		}
		//如果存在就直接添加
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("id", IDGeneratorTools.createId());
		map.put("openid", wui.getOpenid());
		map.put("nickname", wui.getNickname());
		map.put("userCell",wui.getUserCell() );
		map.put("universityId",wui.getUniversityId());
		map.put("universityName",universityName);
		map.put("creationTime",DateUtils.getStringDate());
		map.put("followRecord", wui.getFollowRecord());
		wxUserIntentionService.insetwxUserIntention(map);
		return this.toJSONString("success","添加成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.toJSONString("error","添加正确信息");
	}
	@RequestMapping(value="queryWxUserIntention")
	@ResponseBody
	public Map<String,Object> queryWxUserIntention(@RequestParam int page,int rows){
	 Map<String,Object> map = new HashMap<String, Object>();
     map.put("total", wxUserIntentionService.queryWxUserIntention().size());
     map.put("rows", wxUserIntentionService.selectWxUserIntention(page,rows));
     return map;
    }
	/**
	 * 用户首次添加信息
	 */
	@RequestMapping(value="addWxUserIntention",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String addWxUserIntention(String jsonStr){
		try {
			HashMap<String, String> map = new HashMap<String,String>();
			JSONObject json = JSON.parseObject(jsonStr);
			String openid = json.getString("openid");
			String nickname = json.getString("nickname");
			String userCell = json.getString("userCell");
			String universityId = json.getString("universityId");
			String universityName = json.getString("universityName");
			String followRecord = json.getString("followRecord");
			map.put("id", IDGeneratorTools.createId());
			map.put("openid", openid);
			map.put("nickname", nickname);
			map.put("userCell",userCell );
			map.put("universityId",universityId);
			map.put("universityName",universityName);
			map.put("creationTime",DateUtils.getStringDate());
			map.put("followRecord", followRecord);
			wxUserIntentionService.insetwxUserIntention(map);
			return this.toJSONString("success","新增成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this.toJSONString("error","信息错误");
	}
}
