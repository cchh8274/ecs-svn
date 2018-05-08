package com.ycb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ycb.service.ProvinceService;

import cn.kanmars.entity.TblAreaInfo;

/**
 * 赵浩 区域
 * 
 * @author xzkp
 */
@Controller
@RequestMapping(value = "province",produces="text/html;charset=UTF-8")
public class ProvinceController extends BaseController {

	@Autowired
	private ProvinceService provinceService;

	/**
	 * 区域查询
	 * 
	 * @return
	 */
	@SuppressWarnings("null")
	@RequestMapping(value = "region",method=RequestMethod.POST)
	@ResponseBody
	public String region() {
		try {
			List<TblAreaInfo> list = provinceService.region();
			if (list == null && list.size() < 0) {
				return this.toJSONString("error", "查询数据为空");
			}
			List<HashMap<String,String>>   infos=new ArrayList<>();
			for (TblAreaInfo tblAreaInfo : list) {
				if(tblAreaInfo.getEnableLevl().equals("0")){
					HashMap<String,String> item=new HashMap<>();
					copyProperty(item, tblAreaInfo);
					infos.add(item);
				}
			}
			for (HashMap<String, String> hashMap : infos) {
				List<HashMap<String,String>>   is=new ArrayList<>();
				for (TblAreaInfo tblAreaInfo : list) {
					if(tblAreaInfo.getEnableLevl().equals(hashMap.get("areaCode"))){
						HashMap<String,String> item=new HashMap<>();
						copyProperty(item, tblAreaInfo);
						is.add(item);
					}
				}
				hashMap.put("enableLevl",JSON.toJSONString(is));
			}
			return this.toJSONString(infos);
		} catch (Exception e) {
			e.printStackTrace();
			return this.toJSONString("error", "系统异常!");
		}

	}
	
	
	private  void copyProperty(HashMap<String,String> map,TblAreaInfo info){
		map.put("areaCode",info.getAreaCode());
		map.put("areaName",info.getAreaName());
		map.put("status",info.getStatus());
	}
}
