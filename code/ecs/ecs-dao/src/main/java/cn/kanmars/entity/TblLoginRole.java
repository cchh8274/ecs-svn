package cn.kanmars.entity;

/**
 *用户角色关联表
 *tbl_role
 */
public class TblLoginRole implements java.io.Serializable{

	/**
     * id
     * tbl_login_role
     */
    private Integer id;
    
    /**
     * loginid
     * tbl_role.loginid
     */
    private Integer loginid;
    
    /**
     * roleid
     * tbl_role.roleid
     */
    private Integer roleid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLoginid() {
		return loginid;
	}

	public void setLoginid(Integer loginid) {
		this.loginid = loginid;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public TblLoginRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TblLoginRole(Integer id, Integer loginid, Integer roleid) {
		super();
		this.id = id;
		this.loginid = loginid;
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "TblLoginRole [id=" + id + ", loginid=" + loginid + ", roleid=" + roleid + "]";
	}
    
}
