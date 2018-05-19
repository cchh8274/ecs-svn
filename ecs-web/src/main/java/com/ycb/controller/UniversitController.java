
package com.ycb.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.service.UniversitService;
import com.ycb.service.UniversityDetailsService;
import com.ycb.util.ConstantsBean;
import com.ycb.util.FileUtil;

import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblUniversityDetails;
import cn.kanmars.entity.TblUniversityInfo;

/**
 * 张见军
 * 大学表查询
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="Universit")
public class UniversitController extends BaseController{
	@Autowired
	private UniversitService universitService;
	@Autowired
	private UniversityDetailsService universityDetailsService;
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
		@RequestMapping(value="daxuediqubiao",produces="text/html; charset=UTF-8")
		@ResponseBody
		public String queryAddUniversita(String jsonStr) throws Exception{
					if(StringUtils.isEmpty(jsonStr)){
					return this.toJSONString("error","参数为空");
			}
			JSONObject json = JSON.parseObject(jsonStr);
			String ocad = "0"+ json.getString("areaId");
			
			//String ocad = jsonStr;
			//这个ocad就是数据的area_id字段
			List<TblUniversityInfo> unv = universitService.queryAddUniversita(ocad);
			System.out.println(this.toJSONString(unv));
			return this.toJSONString(unv);
		}
		//大学详细信息
		@RequestMapping(value="daXuXinXiXangQing",produces="text/html; charset=UTF-8")
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
		
		 /**
	     * 图片
	     */
	    @RequestMapping(value="fileupload")
	    @ResponseBody
	    public String fileupload(@RequestParam MultipartFile file){
	        String upFile = FileUtil.upFile(file, ConstantsBean.IMG_PATH);
	        return ConstantsBean.IMG_SERVER_PATH+upFile;
	    }
	    
	  //跳转大学详情页面
	    @RequestMapping("universitDetails")
	    public String universitDetails(HttpServletRequest request){
	    String id=request.getParameter("id");
	    request.setAttribute("id", id);
	    return "universitDetails";
	    }
	   
	  //查询大学详情
	    @RequestMapping("queryDetails")
	    @ResponseBody
	    public Map<String,Object> queryDetails(Integer page,Integer rows,String id){
	        Map<String,Object> map = new HashMap<String, Object>();
	        map.put("total", universitService.queryDetails(id).size());
	        map.put("rows", universitService.fyqueryDetails(page,rows,id));
	        return map;
	    }
	    
	    //跳转大学详情新增页面
	    @RequestMapping("addUniversitDetails")
	    public String addUniversitDetails(){
	    return "addUniversitDetails";
	    }
	    
	  //添加信息
		@RequestMapping(value="insetUniversitDetails")
		@ResponseBody
		public void insetUniversitDetails(TblUniversityDetails tud,String idd){
			String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
			tud.setId(replaceAll);
			tud.setUniversityId(idd);
			universitService.insetUniversitDetails(tud);
		}
		
		//跳转大学详情修改页面
	    @RequestMapping(value="upQueryUniversitDetails")
		public String upQueryUniversitDetails(String id,Model model){
	    	TblUniversityDetails tud  = universitService.upQueryUniversitDetails(id);
			model.addAttribute("tud", tud);
			return "upQueryUniversitDetails";
		}
	    
	  //修改
	  	@RequestMapping(value="updUniversitDetails")
	  	@ResponseBody
	  	public void updUniversitDetails(TblUniversityDetails tud){
	  		universitService.updUniversitDetails(tud);
	  	}
	  	
	  //删除
		@RequestMapping("delUniversitDetails")
		@ResponseBody
		public Map<String,Object> delUniversitDetails(String ids){
			Map<String,Object> map = new HashMap<String, Object>();
			try {
				universitService.delUniversitDetails(ids);
				map.put("success", true);
			} catch (Exception e) {
				e.printStackTrace();
				map.put("success", false);
			}
			return map;
		}
		
		/**
		 * 查询附近的大学现在是写死的支取三条
		 */
//		@RequestMapping(value="fuJinuniversityDetails",produces="text/html; charset=UTF-8")
//		@ResponseBody
//		public String fuJinuniversityDetails(String jsonStr){
//			try {
//				JSONObject json = JSON.parseObject(jsonStr);
//				String lawz = json.getString("lawz");
//				//String lawz = jsonStr;
//				List<TblUniversityInfo> unv = universitService.fuJinuniversityDetails(lawz);
//				List<TblUniversityDetails> und = new ArrayList<TblUniversityDetails>();
//				for (int i = 0; i < unv.size(); i++) {
//					String id =  unv.get(i).getId();
//					List<TblUniversityDetails>	 dag = universityDetailsService.seleUniversityDetails(id);			
//					und.addAll(dag);
//				}
//				for (int i = 0; i < unv.size(); i++) {
//					for (int j = 0; j < und.size(); j++) {
//						if(unv.get(i).getId().equals(und.get(j).getUniversityId())){
//							unv.get(i).setHeadimg(und.get(j).getHeadimg());
//							unv.get(i).setUniversityGrade(und.get(j).getUniversityGrade());
//							unv.get(i).setUniversityPeople(und.get(j).getUniversityPeople());
//							unv.get(i).setUniversityProbability(und.get(j).getUniversityProbability());
//							unv.get(i).setUniversityAdvantage(und.get(j).getUniversityAdvantage());			
//					 }
//					}
//				}
//				return this.toJSONString(unv);
//			} catch (Exception e) {
//			e.printStackTrace();
//			}
//			
//			return this.toJSONString("error","错误信息");
//		}

}
