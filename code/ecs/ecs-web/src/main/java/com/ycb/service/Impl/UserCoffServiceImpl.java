package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.UserCoffService;

import cn.kanmars.dao.TblUserCoffMapper;
import cn.kanmars.entity.TblUserCoffeemachine;
@Service
public class UserCoffServiceImpl implements UserCoffService {
	@Autowired
	private TblUserCoffMapper tblUserCoffMapper;
//	查询我的咖啡机明细
	@Override
	public List<TblUserCoffeemachine> seleUserCoff(String openid) {
	
		return tblUserCoffMapper.seleUserCoff(openid);
	}

}
