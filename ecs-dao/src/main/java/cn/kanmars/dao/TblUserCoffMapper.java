package cn.kanmars.dao;

import java.util.List;

import cn.kanmars.entity.TblUserCoffeemachine;

public interface TblUserCoffMapper {
//	查询我的咖啡机明细seleUserCoff
	List<TblUserCoffeemachine> seleUserCoff(String openid);
}