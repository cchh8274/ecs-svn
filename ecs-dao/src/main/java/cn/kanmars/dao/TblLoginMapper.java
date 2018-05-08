package cn.kanmars.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblPower;
import cn.kanmars.entity.TblRole;
import cn.kanmars.entity.TblRolePower;

/**
 * 登陆表
 * tbl_login
 */
@cn.kanmars.MybatisRepository
public interface TblLoginMapper {

	List<TblLogin> getCar(@Param("begin")Integer begin,@Param("end") Integer end, TblLogin tbllogin);

	List<TblLogin> getCarAll(TblLogin tbllogin);

	void deleteuser_role(Integer loginid);

	void addrole(@Param("loginid")Integer loginid,@Param("roleid") Integer[] roleid);

	List<Object> getrole();

	List<Object> getUserRole(Integer id);

	Integer removeRoleByIds(@Param("rids")String rids);

	long queryRoleCount(TblRole role);

	List<TblRole> queryRolePage(@Param("role")TblRole role, @Param("str")int i, @Param("ro")int rows);

	TblRole queryQuanById(@Param("rid2")String rid2);

	void deleteaddQuan(@Param("rid")Integer rid);

	void addQuan(@Param("flag")Integer flag, @Param("rid")Integer rid);

	List<TblPower> queryTreess();

	List<TblRolePower> queryQuan(@Param("rid")Integer rid);

	TblRole queryRoleById(Integer id);

	Integer updateRole(TblRole role);

	void addRole(TblRole role);

	void delCars(@Param("ids") String ids);

	void adduser(TblLogin login);

	TblLogin queryLogById(Integer id);

	Integer updateLog(@Param("user") TblLogin user);
	
	List<TblLogin> aaaaa();

	TblLogin logUser(String adminName);
	//修改登录次数
	void updState(String adminName);
	//修改密码

	void updatepwd(TblLogin tl);
	//分配用户
	void logUseradd(TblLogin tlog);
	List<TblPower> queryTreeByUserId(@Param("id")Integer id);

}
