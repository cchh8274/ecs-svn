package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.base.BaseController;
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
	 * 是否存在
	 * 是否购买当前大学
	 */
	@RequestMapping(value="panDuanwxUserIntention",produces="text/html; charset=UTF-8")
	@ResponseBody
	private String panDuanwxUserIntention(String jsonStr) throws Exception{
			HashMap<String,String> mp = new HashMap<String,String>();
			//根据用户的openid去查询当前用户有没有 
			JSONObject json = JSON.parseObject(jsonStr);
			String openid = json.getString("openid");
			String universityId = json.getString("universityId");
			TblWxUserIntention tblWxUserIntention=wxUserIntentionService.panDuanjiawxUserIntention(universityId,openid);
			if(tblWxUserIntention !=null){
				mp.put("flag","exist");
				mp.put("message","您已经加入过该大学！");
				return this.toJSONString(mp);
			}
			String  userCell=wxUserIntentionService.panDuanwxUserIntention(openid);
			if(StringUtils.isNotEmpty(userCell) ){
				mp.put("flag","noexist");
				mp.put("message","加入成功！");
				HashMap<String, String> map = new HashMap<String,String>();
				map.put("id", IDGeneratorTools.createId());
				map.put("openid", openid);
				map.put("universityId",universityId);
				map.put("creationTime",DateUtils.getStringDate());
				map.put("userCell",userCell);
				wxUserIntentionService.insetwxUserIntention(map);
				return this.toJSONString(mp);
			}
			mp.put("flag","no");
			mp.put("message","第一次咨询");
			return this.toJSONString(mp);
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
		HashMap<String, String> map = new HashMap<String,String>();
		try {
			HashMap<String, String> mp = new HashMap<String,String>();
			JSONObject json = JSON.parseObject(jsonStr);
			String openid = json.getString("openid");
			String universityId = json.getString("universityId");
			String userCell = json.getString("userCell");
			map.put("id", IDGeneratorTools.createId());
			map.put("openid", openid);
			map.put("universityId",universityId);
			map.put("userCell",userCell);
			map.put("creationTime",DateUtils.getStringDate());
			wxUserIntentionService.insetwxUserIntention(map);
			map.clear();
			map.put("message","咨询成功");
			return this.toJSONString(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.clear();
			map.put("message","系统异常!");
			return this.toJSONString(map);
		}
	}
}
