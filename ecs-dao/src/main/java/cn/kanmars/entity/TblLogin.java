package cn.kanmars.entity;
/**
 * 登陆表
 *tbl_login
 */
public class TblLogin implements java.io.Serializable{
	
	/**
     * id
     * tbl_login
     */
    private Integer id;

    /**
     * 登陆管理员名字
     * tbl_login.admin_name
     */
    private String adminName;

    /**
     * 登陆密码
     * tbl_login.admin_password
     */
    private String adminPassword;
    
    /**
     * 登陆状态
     * tbl_login.admin_state
     */
    private Integer adminState;
    
    /**
     * 登陆类型(1、管理员 |2、普通员工)
     * tbl_login.admin_type
     */
    private Integer adminType;
    /**
     * 新密码
     */
    private String xadminPassword;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public Integer getAdminState() {
		return adminState;
	}
	public void setAdminState(Integer adminState) {
		this.adminState = adminState;
	}
	public Integer getAdminType() {
		return adminType;
	}
	public void setAdminType(Integer adminType) {
		this.adminType = adminType;
	}
	public String getXadminPassword() {
		return xadminPassword;
	}
	public void setXadminPassword(String xadminPassword) {
		this.xadminPassword = xadminPassword;
	}
	public TblLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblLogin(Integer id, String adminName, String adminPassword, Integer adminState, Integer adminType,
			String xadminPassword) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminState = adminState;
		this.adminType = adminType;
		this.xadminPassword = xadminPassword;
	}
	@Override
	public String toString() {
		return "TblLogin [id=" + id + ", adminName=" + adminName + ", adminPassword=" + adminPassword + ", adminState="
				+ adminState + ", adminType=" + adminType + ", xadminPassword=" + xadminPassword + "]";
	}
	
    

}