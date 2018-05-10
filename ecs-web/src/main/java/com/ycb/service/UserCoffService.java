package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblUserCoffeemachine;

public interface UserCoffService {
//	查询我的咖啡机明细
	List<TblUserCoffeemachine> seleUserCoff(String openid);

	

}
