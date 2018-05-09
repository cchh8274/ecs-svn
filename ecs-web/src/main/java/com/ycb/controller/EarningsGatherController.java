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

import com.ycb.service.EarningsGatherService;

import cn.kanmars.entity.TblEarningsGather;
import cn.kanmars.entity.TblEarningsInfo;
import cn.kanmars.entity.TblLogin;

/**
 * 赵浩
 * 收益汇总表
 * @author xzkp
 *
 */
@Controller
@RequestMapping(value = "earningsGather")
public class EarningsGatherController {

	@Autowired
	private EarningsGatherService earningsGatherService;
	/*
	 *收益汇总表查询
	 */
	@RequestMapping("selectList")
    @ResponseBody
    public Map<String,Object> selectList(Integer page,Integer rows,TblEarningsGather tblEarningsGather){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", earningsGatherService.selectList(tblEarningsGather).size());
        map.put("rows", earningsGatherService.selectpage(page,rows,tblEarningsGather));
        return map;
    }
	
	//跳转新增页面
		@RequestMapping(value="addEarningsGather")
		public String addEarningsGather() {
			return "addEarningsGathere";
		}
		//添加信息
		@RequestMapping(value="insetEarningsGather")
		@ResponseBody
		public void insetEarningsGather(TblEarningsGather teg,HttpServletRequest request){
			String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
			TblLogin attribute = (TblLogin) request.getSession().getAttribute("user");
			    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			      Date date = new Date();
			      String da = df.format(date);
			      teg.setId(replaceAll);
			      teg.setCreatetime(da);
			      teg.setCreateUser(attribute.getAdminName());
			      earningsGatherService.insetEarningsGather(teg);
		}
		
		//修改回显
				@RequestMapping(value="queryEarningsGather")
				public String queryEarningsGather(String id,Model model){
					TblEarningsGather teg  = earningsGatherService.queryEarningsGather(id);
					model.addAttribute("teg", teg);
					return "updEarningsGather";
				}
				//修改
				@RequestMapping(value="updEarningsGather")
				@ResponseBody
				public void updEarningsGather(TblEarningsGather teg){
					earningsGatherService.updEarningsGather(teg);
				}
				
			//删除
				@RequestMapping("delEarningsGather")
				@ResponseBody
				public Map<String,Object> delEarningsGather(String ids){
					Map<String,Object> map = new HashMap<String, Object>();
					try {
						earningsGatherService.delEarningsGather(ids);
						map.put("success", true);
					} catch (Exception e) {
						e.printStackTrace();
						map.put("success", false);
					}
					return map;
				}
}
