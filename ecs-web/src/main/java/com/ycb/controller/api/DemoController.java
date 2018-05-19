package com.ycb.controller.api;

import java.util.HashMap;
import java.util.Map;

import com.ycb.base.BaseController;

/**
 * 所有的API 接口 都要继承 BaseContoller
 * 所有的接口返回都是字符串
 * 接收 参数是字符串  参数名 为 jsonStr
 * @author xzkp
 *
 */
public class DemoController  extends BaseController {
		
	
	public String  apiA(String  jsonStr){
		Map<String,String>  map=new HashMap();
		//1. DATA  =  LIST   toJSONString(LIST);查询类的 直接数据
		//2. DATA String  ==> message:'新增成功'; 操作类的  返回 Key Value
		map.put("messager", "新增");
		return this.toJSONString(map);
		
	}
}
