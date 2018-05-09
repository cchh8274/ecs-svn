package cn.kanmars.entity;
/**
 *角色表
 *tbl_role
 */
public class TblRole implements java.io.Serializable{

	/**
     * id
     * tbl_role
     */
    private Integer id;

    /**
     * 角色名称
     * tbl_login.admin_name
     */
    private String roleName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "TblRole [id=" + id + ", roleName=" + roleName + "]";
	}

	public TblRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TblRole(Integer id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
    
}
