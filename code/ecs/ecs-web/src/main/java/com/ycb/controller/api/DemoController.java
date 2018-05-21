package com.ycb.controller.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.base.BaseController;
import com.ycb.util.WxSessionUtils;

/**
 * 所有的API 接口 都要继承 BaseContoller
 * 所有的接口返回都是字符串
 * 接收 参数是字符串  参数名 为 jsonStr
 * @author xzkp
 *
 */
@Controller
@RequestMapping("/demo")
public class DemoController  extends BaseController {
		
	@RequestMapping("/de")
	@ResponseBody
	public String  apiA(String  jsonStr){
		Map<String,String>  map=new HashMap();
		//1. DATA  =  LIST   toJSONString(LIST);查询类的 直接数据
		//2. DATA String  ==> message:'新增成功'; 操作类的  返回 Key Value
		map.put("messager", WxSessionUtils.getToken());
		return this.toJSONString(map);
		
	}
}
