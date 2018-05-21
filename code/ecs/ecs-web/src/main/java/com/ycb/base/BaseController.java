package com.ycb.base;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 每次都返回前端JSON字符串
 * 
 * @author chenghui
 *
 */
public class BaseController  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected  String  SUCCESS="success";
	protected  String  ERROR="error";
	
	/**
	 *  
	 * @param obj
	 * @return
	 */
	public String toJSONString(Object obj) {
		String json=JSON.toJSONString(obj);
		JSONObject  jsonObj=new JSONObject();
		jsonObj.put("code",this.SUCCESS);
		jsonObj.put("info",json);
		return jsonObj.toJSONString();
	}
	/**
	 * json字符串
	 * @param str
	 * @return
	 */
	public String toJSONString(String str) {
		JSONObject  jsonObj=new JSONObject();
		jsonObj.put("code",this.SUCCESS);
		jsonObj.put("info",str);
		return jsonObj.toJSONString();
	}
	/**
	 * 错误json字符串
	 * @param code
	 * @param str
	 * @return
	 */
	public String toJSONString(String code,String str) {
		JSONObject  jsonObj=new JSONObject();
		jsonObj.put("code",this.ERROR);
		jsonObj.put("info",str);
		return jsonObj.toJSONString();
	}
	
	/**
	 * 返回错误的字符串
	 * @param code
	 * @param str
	 * @return
	 */
	public String toErroJSONString(String errorMessage) {
		JSONObject  jsonObj=new JSONObject();
		jsonObj.put("code",this.ERROR);
		jsonObj.put("info","{\"message\":"+errorMessage+"}");
		return jsonObj.toJSONString();
	}

	


}
