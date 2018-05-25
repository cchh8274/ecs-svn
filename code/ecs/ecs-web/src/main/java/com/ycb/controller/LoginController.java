package com.ycb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ycb.service.LoginService;

import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblPower;
import cn.kanmars.entity.TblRole;

/**
 * 赵浩
 * 登陆表
 * @author xzkp
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	 //导航树
	   @RequestMapping("getTree")
	   @ResponseBody
	   public List<Map<String,Object>> getTree(HttpServletRequest request ){
	      TblLogin  user = (TblLogin) request.getSession().getAttribute("user");
	      List<TblPower> list = loginService.queryTreeByUserId(user.getId());
	      List<Map<String, Object>> lis = getTreeStr(list,0);
	      return lis;
	   }

	   public List<Map<String,Object>> getTreeStr(List<TblPower> list, Integer pid){
	       //定义返回的变量
	       List<Map<String,Object>> newlist = new ArrayList<Map<String,Object>>();
	       //循环所有的数据
	       for (int i = 0; i < list.size(); i++) {
	           //获取单个对象
	    	   TblPower t = list.get(i);
	           //定义单个对象容器
	           Map<String,Object> map = null;
	           //根据父节点id判断当前节点是否属于父节点
	           if(t.getPid() == pid){
	               map = new HashMap<String, Object>();
	               map.put("id", t.getId());
	               map.put("text", t.getText());
	               map.put("url", t.getUrl());
	               map.put("children", getTreeStr(list,t.getId()));
	           }
	           if(map != null){
	               //获取children的数据
	               List<Map<String,Object>> l = (List<Map<String, Object>>) map.get("children");
	               //如果children的数据为空,删除children属性
	               if(l.size()==0){
	                   map.remove("children");
	               }
	               newlist.add(map);
	           }
	       }
	       return newlist;
	   }
	
	/**
	 * 跳转登陆用户页面
	 * @return
	 */
	@RequestMapping("touser")
	public String toyangqiang() {
		return "user";
	}
	
	/**
	 * 登陆用户查询
	 * @param page
	 * @param rows
	 * @param user
	 * @return
	 */
	@RequestMapping("queryrole")
	@ResponseBody
	public Map<String,Object> getCar(Integer page,Integer rows,TblLogin tbllogin){
		Map<String,Object> map = new HashMap<String, Object>();
		//总数据条数
		map.put("total", loginService.getCarAll(tbllogin).size());
		//每页的数据
		map.put("rows", loginService.getCar(page,rows,tbllogin));
		return map;
	}
	
	/**
	 * 用户赋角色
	 * @param uid
	 * @param rid
	 * @return
	 */
	@RequestMapping("addrole")
	@ResponseBody
	public Map<String,Object> addrole(Integer loginid,@RequestParam(value="roleid") Integer[] roleid){
		Map<String,Object> map = new HashMap<String, Object>();
		try {
			
			loginService.addrole(loginid,roleid);
			map.put("success",true);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success",false);
		}
		return map;
	}
	
	/**
	 * 角色查询
	 * @param id
	 * @return
	 */
	@RequestMapping("getrole")
	@ResponseBody
	public Map<String, List<Object>> getrole(Integer id){
		Map<String, List<Object>> rol =new HashMap<String, List<Object>>();
		List<Object> role=loginService.getrole();
		List<Object> ur=loginService.getUserRole(id);
		
			rol.put("roles", role);
			rol.put("list", ur);
		
		
		return rol;
	}
	
	@RequestMapping("addid")
	public ModelAndView addid(Integer id){
		ModelAndView mv=new ModelAndView("role");
		mv.addObject("id", id);
		
		return mv;
	}
	
	
	/**
	 * 跳转权限页面
	 * @return
	 */
	@RequestMapping("toQuan")
	public String toQuan(){
		return "power";
	}
	
	/**
	 * 角色查询
	 * @param role
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(value="/queryRole")
	@ResponseBody
	
	public Map<String, Object> queryRole(TblRole role,int page ,int rows){
		Map<String, Object> map = loginService.queryRole(role , page , rows);
		return map;
	}
	
	/**
	 * 删除旧权限
	 * @param rids
	 * @return
	 */
	@RequestMapping(value="/removeRoleByIds")
	@ResponseBody
	public String removeRoleByIds(String rids){
		Integer arr = loginService.removeRoleByIds(rids);
		return arr.toString();
	}
	/**
	 * 权限功能中的角色查询
	 * @param rid2
	 * @param request
	 * @return
	 */
	@RequestMapping("queryQuanById")
	public String queryQuanById(String rid2,HttpServletRequest request){
		
		TblRole role=loginService.queryQuanById(rid2);
		request.setAttribute("role", role);
		return "tree";
	}
	
	/**
	 * 查询权限树
	 * @param 用户ID
	 * @return
	 */
	@RequestMapping("queryTrees")
	@ResponseBody
	public List queryTrees(Integer id){
		List list=loginService.queryTrees(id);
		return list;
	}
	
	/**
	 * 修改权限
	 * @param arr
	 * @return
	 */
	@RequestMapping("updateQuan")
	@ResponseBody
	public List updateQuan(String  arr){
		String[] array = arr.split("-");
		Integer rid=Integer.valueOf(array[1]);
		List list = loginService.updateQuan(array[0],rid);
		return list;
	} 
	/**
	 * 修改角色回显（跳转修改角色页面）
	 * @param rid
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/queryRoleById")
	public String queryPetById(Integer id,HttpServletRequest request){
		TblRole role = loginService.queryRoleById(id);
		request.setAttribute("role", role);
		return "updateRole";
	}
	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	@RequestMapping(value="/updateRole")
	@ResponseBody
	public String updateRole(TblRole role){
		Integer p = loginService.updateRole(role);
		return p.toString();
	}
	
	/**
	 * 跳转角色新增页面
	 * @return
	 */
	@RequestMapping("jumpAddRole")
	public String jumpAddRole(){
		return "addRole";
	}
	
	/**
	 * 新增角色
	 * @param role
	 * @return
	 */
	@RequestMapping(value="/addRole")
	@ResponseBody
	public String addRole(TblRole role){
		
		loginService.addRole(role);
		
		return "";
	}
	
	/**
	 * 删除用户
	 * @param ids
	 * @return
	 */
	@RequestMapping("delCars")
	@ResponseBody
	public Map<String,Object> delCars(String ids){
		Map<String,Object> map = new HashMap<String, Object>();
		try {
			loginService.delCars(ids);
			map.put("success", true);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
		return map;
	}
	
	/**
	 * 跳转用户新增页面
	 * @return
	 */
	@RequestMapping("logAdduser")
	public String logAdduser(){
		return "addUser";
	}
	
	/**
	 * 新增用户
	 * @param role
	 * @return
	 */
	@RequestMapping(value="adduser")
	@ResponseBody
	public String adduser(TblLogin login){
		
		loginService.adduser(login);
		
		return "";
	}
	
	/**
	 * 修改用户回显（跳转修改页面）
	 * @param id
	 * @return
	 */
	@RequestMapping("queryLogById")
	@ResponseBody
	public ModelAndView queryLogById(Integer id){
		ModelAndView mv = new ModelAndView();
		TblLogin user = loginService.queryLogById(id);
        mv.addObject("user",user);
        mv.setViewName("updataUser");
        return mv;
	}
	
	
	@RequestMapping(value="updateLog")
	@ResponseBody
	public String updateLog(TblLogin user){
		Integer L = loginService.updateLog(user);
		return L.toString();
	}
	
	
	/*
	 * zjj 
	 * 登录
	 */
	@RequestMapping("logUser")
	@ResponseBody
	public String logUser(TblLogin tl,HttpServletRequest request){	
		String log = loginService.logUser(tl,request);
		return log;
	}
	
	/*
	 * 注销登录
	 */
    @RequestMapping(value = "cancellations") 
    @ResponseBody
    public String cancellations(HttpServletRequest request){
    	TblLogin attribute = (TblLogin) request.getSession().getAttribute("user");
            request.getSession().removeAttribute("user");
     return "11";
    }
    	//修改密码
   @RequestMapping("ModifythePWD")
   public String toRecordAdd(){
   return "ModifythePwd";
   }
   //跳转分配用户页面
   @RequestMapping("fenPaiUsera")
   public String fenPaiUsera(){
	   return "fenPUser";
   }
   //跳转分配form,
   @RequestMapping("fenPaiUseraform")
   public String fenPaiUseraform(){
	   return "fpForm";
   }
   //跳转登录页面
   @RequestMapping("loginjsp")
   public String loginjsp(){
   return "login";
   }
   //分配用户
   @RequestMapping(value="logUseradd")
   @ResponseBody
   public String logUseradd(TblLogin tlog){
	String zhanghao = loginService.logUseradd(tlog);
	return zhanghao;
   }
   
 //跳转微信用户信息页面
   @RequestMapping("page1")
   public String page1(){
	   return "WxUserInfo";
   }
   
 //跳转大学信息页面
   @RequestMapping("page2")
   public String page2(){
   return "UniversityInfo";
   }
   
 //跳转机器信息页面
   @RequestMapping("page4")
   public String page4(){
   return "MachineInfo";
   }
   
 //跳转收益信息页面
   @RequestMapping("page5")
   public String page5(){
   return "EarningsInfo";
   }
   
 //跳转收益汇总信息页面
   @RequestMapping("page6")
   public String page6(){
   return "EarningsGather";
   }
   
 //跳转用户咖啡机信息页面
   @RequestMapping("page9")
   public String page9(){
   return "MachineGatherInfo";
   }
   
 //跳转用户账户信息页面
   @RequestMapping("page10")
   public String page10(){
   return "AmountInfo";
   }
   
 //跳转体现记录信息页面
   @RequestMapping("page12")
   public String page12(){
   return "ReflectInfo";
   }
   
 //跳转账户明细信息页面
   @RequestMapping("page13")
   public String page13(){
   return "AmountDetail";
   }
   
 //跳转银行账户信息页面
   @RequestMapping("page14")
   public String page14(){
   return "BankamountInfo";
   }
   
 //跳转分配用户页面
   @RequestMapping("page15")
   public String page15(){
   return "fenPUser";
   }
   
 //跳转服务端页面
   @RequestMapping("page16")
   public String page16(){
   return "Serve";
   }
   
 //跳转用户意向页面
   @RequestMapping("page17")
   public String page17(){
   return "WxUserIntention";
   }
}

