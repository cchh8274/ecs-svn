package com.ycb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.AmountDetailService;
import com.ycb.service.ReflectInfoService;

import cn.kanmars.entity.TblAmountDetail;
import cn.kanmars.entity.TblReflectInfo;

/**
 * 赵浩
 * 账户明细表
 * @author xzkp
 */
//备注
@Controller
@RequestMapping(value = "amountDetail")
public class AmountDetailController {
	
	@Autowired
	private AmountDetailService amountDetailService;

	/*
	 *账户明细表查询
	 */
	@RequestMapping("selectList")
    @ResponseBody
    public Map<String,Object> selectList(Integer page,Integer rows,TblAmountDetail ablAmountDetail){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", amountDetailService.selectList(ablAmountDetail).size());
        map.put("rows", amountDetailService.selectpage(page,rows,ablAmountDetail));
        return map;
    }
}
