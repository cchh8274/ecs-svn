package cn.kanmars.entity;

/**
 * 角色权限关联表
 *tbl_rile_power
 */
public class TblRolePower implements java.io.Serializable{

	/**
     * id
     * tbl_rile_power
     */
    private Integer id;
    
    /**
     * roleid
     * tbl_rile_power
     */
    private Integer roleid;
    
    /**
     * powerid
     * tbl_rile_power
     */
    private Integer powerid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TblRolePower [id=" + id + ", roleid=" + roleid + ", powerid=" + powerid + "]";
	}

	public TblRolePower(Integer id, Integer roleid, Integer powerid) {
		super();
		this.id = id;
		this.roleid = roleid;
		this.powerid = powerid;
	}

	public TblRolePower() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Integer getPowerid() {
		return powerid;
	}

	public void setPowerid(Integer powerid) {
		this.powerid = powerid;
	}
    
    
}
