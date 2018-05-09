package com.ycb.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblPower;
import cn.kanmars.entity.TblRole;

public interface LoginService {
	List<TblPower> queryTreeByUserId(Integer id);

	List<TblLogin> getCarAll(TblLogin tbllogin);

	List<TblLogin> getCar(Integer page, Integer rows, TblLogin tbllogin);

	void addrole(Integer loginid, Integer[] roleid);

	List<Object> getrole();

	List<Object> getUserRole(Integer id);

	Integer removeRoleByIds(String rids);

	Map<String, Object> queryRole(TblRole role, int page, int rows);

	TblRole queryQuanById(String rid2);

	List updateQuan(String role, Integer rid);

	List queryTrees(Integer id);

	TblRole queryRoleById(Integer id);

	Integer updateRole(TblRole role);

	void addRole(TblRole role);

	void delCars(String ids);

	void adduser(TblLogin login);

	TblLogin queryLogById(Integer id);

	Integer updateLog(TblLogin user);
	
	String logUser(TblLogin tl, HttpServletRequest request);

	String logUseradd(TblLogin tlog);
	
}
