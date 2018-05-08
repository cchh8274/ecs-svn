package com.ycb.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.ServreService;

import cn.kanmars.entity.TblMessageInfo;
import cn.kanmars.entity.TblSeesionInfo;

@Controller
@RequestMapping(value = "servre")
public class ServeController {

	@Autowired
	private ServreService servreService;
	
	/**
	 * 查询会话
	 */
	@RequestMapping("querySurface")
	@ResponseBody
	public List<TblSeesionInfo> querySurface(TblSeesionInfo tblSeesionInfo){
		List<TblSeesionInfo> list=servreService.querySurface(tblSeesionInfo);
		return list;
		
	}
	
	/**
	 * 查询消息
	 * 修改状态
	 */
	@RequestMapping("queryMassage")
	@ResponseBody
	public List<TblMessageInfo> queryMassage(String id){
		List<TblMessageInfo> list=servreService.queryMassage(id);
		/*List<HashMap<String,String>>  items=new ArrayList<>();*/
		/*for(TblMessageInfo info:list){
			HashMap<String,String>  meg=new HashMap<>();
			meg.put("stateZt", info.getStateZt());
			if(info.getStateZt().equals("010")){
				meg.put("userMessage", "用户："+info.getMessage());
				meg.put("serviceMessage", "");
			}
			if(info.getStateZt().equals("020")){
				meg.put("serviceMessage", info.getMessage()+"：客服");
				meg.put("userMessage", "");
			}
			items.add(meg);
		}*/
		return list;
	}
	
	/**
	 * 新增消息（客服）
	 */
	@RequestMapping("addMassage")
	@ResponseBody
	public String addMassage(TblMessageInfo tblMessageInfo,String id,String opid){
		SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = date.format(new Date());
		TblMessageInfo Message = new TblMessageInfo();
		Message.setOpendId(opid);
		Message.setServerId("666");
		Message.setMessage(tblMessageInfo.getMessage());
		Message.setMessageTime(time);
		Message.setSessionId(id);
		Message.setStateZt("020");
		
		servreService.addMassage(Message);
		return "";
	}
	
	/**
	 * 删除当前会话下的消息
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="removeMassage")
	@ResponseBody
	public void removeMassage(String id){
		servreService.removeMassage(id);
	}
}
