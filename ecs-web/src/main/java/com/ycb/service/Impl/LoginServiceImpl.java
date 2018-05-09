package com.ycb.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.LoginService;

import cn.kanmars.dao.TblLoginMapper;
import cn.kanmars.entity.ConstantClass;
import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblPower;
import cn.kanmars.entity.TblRole;
import cn.kanmars.entity.TblRolePower;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private TblLoginMapper tblLoginMapper;

	public List<TblLogin> getCar(Integer page, Integer rows, TblLogin tbllogin) {
		Integer begin = (page-1)*rows+1;
		Integer end = page*rows;
		return tblLoginMapper.getCar(begin,end,tbllogin);
	}

	public List<TblLogin> getCarAll(TblLogin tbllogin) {
		return tblLoginMapper.getCarAll(tbllogin);
	}

	public void addrole(Integer loginid, Integer[] roleid) {
		if(loginid!=null& loginid!=0){
			tblLoginMapper.deleteuser_role(loginid);
		}
		
		tblLoginMapper.addrole(loginid,roleid);
	}
	
	public List<Object> getrole() {
		return tblLoginMapper.getrole();
	}

	public List<Object> getUserRole(Integer id) {
		
		return tblLoginMapper.getUserRole(id);
	}

	public Integer removeRoleByIds(String rids) {
		return tblLoginMapper.removeRoleByIds(rids);
	}

	public Map<String, Object> queryRole(TblRole role, int page, int rows) {
		long total = tblLoginMapper.queryRoleCount(role);
		List<TblRole> pe = tblLoginMapper.queryRolePage(role,(page-1)*rows,rows);
		Map<String, Object> map= new HashMap<String, Object>();
		
		map.put("total", total);
		map.put("rows", pe);
		return map;
	}

	public TblRole queryQuanById(String rid2) {
		return tblLoginMapper.queryQuanById(rid2);
	}

	public List updateQuan(String role, Integer rid) {
		tblLoginMapper.deleteaddQuan(rid);
		String [] arr = role.split(",");
		TblPower power= new TblPower();
		TblRole roles= new TblRole();
			if(arr[0].equals("")){
				return null;
				
			}else{
				for (int i = 0; i < arr.length; i++) {
					Integer flag = Integer.valueOf(arr[i]);
					tblLoginMapper.addQuan(flag,rid);
					
				}
			}
			return null;
		}

	public List queryTrees(Integer id) {
		List<TblPower> allList = tblLoginMapper.queryTreess();
		List<TblRolePower> myList = tblLoginMapper.queryQuan(id);
		for (int i = 0; i < myList.size(); i++) {
			for (int j = 0; j < allList.size(); j++) {
				if(myList.get(i).getPowerid() == allList.get(j).getId()){
					allList.get(j).setChecked(true);
				}
			}
		}
		return allList;
	}

	public TblRole queryRoleById(Integer id) {
		return tblLoginMapper.queryRoleById(id);
	}

	public Integer updateRole(TblRole role) {
		return tblLoginMapper.updateRole(role);
	}

	public void addRole(TblRole role) {
		tblLoginMapper.addRole(role);
	}

	public void delCars(String ids) {
		tblLoginMapper.delCars(ids);
	}

	public void adduser(TblLogin login) {
		tblLoginMapper.adduser(login);
	}

	public TblLogin queryLogById(Integer id) {
		return tblLoginMapper.queryLogById(id);
	}

	public Integer updateLog(TblLogin user) {
		return tblLoginMapper.updateLog(user);
	}
	
	public String logUser(TblLogin tl,HttpServletRequest request) {
		ConstantClass cls = new ConstantClass();
		TblLogin  tlgin = tblLoginMapper.logUser(tl.getAdminName());
		//tlgin.setXadminPassword(tl.getXadminPassword());
		//账号错误
		if(tlgin==null){
			return cls.getCuowu();
		}
		//判断次数
		if(tlgin.getAdminState()<3){
			 //密码错误
		if(tl.getAdminPassword()==null ||!tl.getAdminPassword().equals(tlgin.getAdminPassword())){
			tblLoginMapper.updState(tl.getAdminName());
			return cls.getCuowua();
		}
		//修改密码
		if(tl.getXadminPassword() !=null){
			tblLoginMapper.updatepwd(tl);
			return cls.getXiugai();
		}
		//登录成功
		 request.getSession().setAttribute("user", tlgin);
			return cls.getZhengque();
		}
		return cls.getCuowub();
			}
	//分配用户
	@Override
	public String logUseradd(TblLogin tlog) {
		ConstantClass cls = new ConstantClass();

		TblLogin  tlgin = tblLoginMapper.logUser(tlog.getAdminName());
			if(tlgin==null){
				tblLoginMapper.logUseradd(tlog);
			}
			return cls.getCuowu();
		
	}

	@Override
	public List<TblPower> queryTreeByUserId(Integer id) {
		return tblLoginMapper.queryTreeByUserId(id);
	}
	
}
