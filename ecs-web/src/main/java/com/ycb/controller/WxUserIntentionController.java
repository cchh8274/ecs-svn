package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.WxUserIntentionService;

@Controller
@RequestMapping(value="wxUserIntention")
public class WxUserIntentionController {
	@Autowired
	private WxUserIntentionService wxUserIntentionService;
	
	@RequestMapping(value="queryWxUserIntention")
	@ResponseBody
	public Map<String,Object> queryWxUserIntention(@RequestParam int page,int rows){
	 Map<String,Object> map = new HashMap<String, Object>();
     map.put("total", wxUserIntentionService.queryWxUserIntention().size());
     map.put("rows", wxUserIntentionService.selectWxUserIntention(page,rows));
     return map;
    }
}
