package com.ycb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.joda.MillisecondInstantPrinter;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ycb.base.BaseController;
import com.ycb.service.BankamountInfoService;
import com.ycb.util.MD5Encryption;

import cn.kanmars.entity.IDGeneratorTools;
import cn.kanmars.entity.TblBankamountInfo;
import cn.kanmars.entity.TblLogin;

/**
 * 赵浩
 * 银行账户表
 * @author xzkp
 */
@Controller
@RequestMapping(value = "bankamountInfo")
public class BankamountInfoController extends BaseController {

	@Autowired
	private BankamountInfoService bankamountInfoService;
	/*
	 *银行账户表
	 */
	@RequestMapping("selectList")
    @ResponseBody
    public Map<String,Object> selectList(Integer page,Integer rows,TblBankamountInfo tblBankamountInfo){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", bankamountInfoService.selectList(tblBankamountInfo).size());
        map.put("rows", bankamountInfoService.selectpage(page,rows,tblBankamountInfo));
        return map;
    }
	/**
	 * 返回所有银行卡  提现调用这个接口
	 */
	@RequestMapping(value="allBankcard",produces="text/html; charset=UTF-8",method=RequestMethod.POST)
	@ResponseBody
	public String allBankcard(String jsonStr){
		if(StringUtils.isEmpty(jsonStr)){
			return this.toErroJSONString("用户id不能为空");
		}
		JSONObject json = JSON.parseObject(jsonStr);
		String openid = json.getString("openid");
		//String openid = jsonStr;
		List<TblBankamountInfo> yhk = bankamountInfoService.seleAllBankamountInfo(openid);
		if(CollectionUtils.isEmpty(yhk)){
			return this.toErroJSONString("该用户没有银行卡");
		}
		return this.toJSONString(yhk);
	}
	/**
	 * 回显银行卡信息
	 */
	@RequestMapping(value="huixianBankamountInfo",produces="text/html; charset=UTF-8")
    @ResponseBody
    public String huixianBankamountInfo(String jsonStr) throws Exception{
		HashMap<String, String> hmp = new HashMap<String, String>();
   	 	//判断数据不为空
		if(StringUtils.isEmpty(jsonStr)){
			return this.toErroJSONString("数据不能为空");
		}
		JSONObject json = JSON.parseObject(jsonStr);
			String openid = json.getString("openid");//银行账户
		//String openid = jsonStr;
		   //判断改用有几张银行卡
		   List<TblBankamountInfo> yhk = bankamountInfoService.seleAllBankamountInfo(openid);
		   	if(yhk.size()>=4){
		   		hmp.put("success", "您已经有4张银行卡");
		   		return this.toJSONString(hmp);
		   	}
			//回显银行卡			
			TblBankamountInfo bmt = bankamountInfoService.dangeBankamountInfohui(openid);
			if(bmt!=null){
				return this.toJSONString(bmt);
			}
			return this.toJSONString("error","该用户没有银行卡");
	}

	/**
	 * 添加银行卡信息
	 */
	@RequestMapping(value="addBankamountInfo",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String addBankamountInfo(String jsonStr,HttpServletRequest request) throws Exception{
		HashMap<String, String> hmp = new HashMap<String, String>();
		//判断数据不为空
		if(StringUtils.isEmpty(jsonStr)){
			return this.toJSONString("error","数据不能为空");
		}
		    JSONObject json = JSON.parseObject(jsonStr);
			String userName = json.getString("name");//用户名称
			String idcard = json.getString("card");//用户身份证
			String phone = json.getString("phone");//手机号
			String bankAmountNo = json.getString("bankno");//银行账户号
			String bankName = json.getString("chose");//银行账户
			String openid = json.getString("openid");
			TblBankamountInfo bkif = bankamountInfoService.judgeBankamountInfo(openid,bankName);
			if(bkif!=null){
				hmp.put("success", "该银行卡已经添加过不能添加");
				return this.toJSONString(hmp);
			}
			 // 根据银行卡号查询该银行卡是不是已经添加
			/*String zh = bankamountInfoService.seleBankamountInfo(bankAmountNo);
			if(zh !=null){
				return "该银行卡绑定";
			}*/
			SimpleDateFormat formata = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			HashMap<String, String> hmap = new HashMap<String,String>();
			hmap.put("id", IDGeneratorTools.createId());
			hmap.put("userName", userName);
			hmap.put("idcard", idcard);
			hmap.put("phone", phone);
			hmap.put("bankAmountNo", bankAmountNo);
			hmap.put("bankName", bankName);
			hmap.put("openid", openid);
			String createTime = formata.format(new Date()).toString();
			hmap.put("createTime", createTime);
			bankamountInfoService.addBankamountInfo(hmap);   
			// 测试没有登录用的时候放开回去session
	      /* TblLogin log = (TblLogin) request.getSession().getAttribute("user");
			if(log == null){
				return this.toJSONString("error","没有登录请登录");
			}*/
			//List<TblBankamountInfo> yhk = bankamountInfoService.seleAllBankamountInfo(openid);*/		
		return "成功";
	}
	/*
	 * 体现更换银行卡
	 */
	@RequestMapping(value="changebankamountInfo",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String changebankamountInfo(String jsonStr) throws Exception{
		if(StringUtils.isEmpty(jsonStr)){
			return this.toJSONString("error","不能为空");
		}
		JSONObject json = JSON.parseObject(jsonStr);
		String bankAmountNo = json.getString("bankAmountNo");
         if(bankAmountNo!=null){
        	 //查询选中的银行卡
        	 TblBankamountInfo bmt = bankamountInfoService.dangeBankamountInfo(bankAmountNo);
        	 return this.toJSONString(bmt);
        }
		return this.toJSONString("error","最少传一个参数");
	}
	/*
	 * 查看有无密码
	 */
	@RequestMapping(value="panduPwd",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String panduPwd(String jsonStr) throws Exception{
		HashMap<String, String> hmap = new HashMap<String, String>();
		try {
			JSONObject json = JSON.parseObject(jsonStr);
			String openid = json.getString("openid");
			TblBankamountInfo bmi= bankamountInfoService.panduPwd(openid);
			if(bmi.getForwardPwd() ==null){
				hmap.put("success", "该用户没有密码");
				this.toJSONString(hmap);
			}
			hmap.put("success", "已经有密码请输入密码");
			this.toJSONString(hmap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.toJSONString("error","最少传一个参数");
	}
	/**
	 * 添加密码
	 * @param jsonStr
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="addToPwd",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String addToPwd(String jsonStr) throws Exception{
		HashMap<String, String> hmap = new HashMap<String, String>();
		try {
			//String openid = jsonStr;
			//String forwardPwda = jsonStr;
		     JSONObject json = JSON.parseObject(jsonStr);
			String openid = json.getString("openid");
			List<TblBankamountInfo> bki = bankamountInfoService.seleUserPwd(openid);
			String forwardPwda = json.getString("forwardPwd");
			for (TblBankamountInfo tblBankamountInfo : bki) {
				String id = tblBankamountInfo.getId();
				String forwardPwd = MD5Encryption.getEncryption(forwardPwda);
				bankamountInfoService.updateUserToPwd(forwardPwd,id);
			}
			hmap.put("seccess","添加密码成功");
			return	this.toJSONString(hmap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.toErroJSONString("最少传一个参数");
	}
	/**
	 * 体现判断密码正确错误
	 * 微信用户id
	 * 银行卡id或者卡号
	 * 密码
	 */

	@RequestMapping(value="putforwardJudgePwd",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String putforwardJudgePwd(String jsonStr) throws Exception{
		
		return this.toErroJSONString("请输入正确的信息");
	}
	
	
}
