/**
 * ecm Generator 
 */
package cn.kanmars.entity;


/**
 * 区域表
 * tbl_area_info
 */
public class TblAreaInfo implements java.io.Serializable{
    /**
     * id
     * tbl_area_info.id
     */
    private String id;
    
    /**
     * 区域id
     * tbl_area_info.area_code
     */
    private String areaCode;

    /**
     * 区域名称
     * tbl_area_info.area_name
     */
    private String areaName;

    /**
     * 状态
     * tbl_area_info.status
     */
    private String status;

    /**
     * 启用等级
     * tbl_area_info.enable_levl
     */
    private String enableLevl;

    /**
     * 页面启用状态
     * tbl_area_info.page_status
     */
    private String pageStatus;

    /**
     * 创建时间
     * tbl_area_info.create_time
     */
    private String createTime;

    /**
     * 创建人
     * tbl_area_info.create_user
     */
    private String createUser;

    /**
     * 修改时间
     * tbl_area_info.update_time
     */
    private String updateTime;

    /**
     * 修改人
     * tbl_area_info.up_user
     */
    private String upUser;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEnableLevl() {
		return enableLevl;
	}

	public void setEnableLevl(String enableLevl) {
		this.enableLevl = enableLevl;
	}

	public String getPageStatus() {
		return pageStatus;
	}

	public void setPageStatus(String pageStatus) {
		this.pageStatus = pageStatus;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpUser() {
		return upUser;
	}

	public void setUpUser(String upUser) {
		this.upUser = upUser;
	}

	public TblAreaInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TblAreaInfo(String id, String areaCode, String areaName, String status, String enableLevl, String pageStatus,
			String createTime, String createUser, String updateTime, String upUser) {
		super();
		this.id = id;
		this.areaCode = areaCode;
		this.areaName = areaName;
		this.status = status;
		this.enableLevl = enableLevl;
		this.pageStatus = pageStatus;
		this.createTime = createTime;
		this.createUser = createUser;
		this.updateTime = updateTime;
		this.upUser = upUser;
	}
	/**
     * 自定义列，分页查询用
     */
    private Integer limitStart;
    public Integer getLimitStart(){
        return limitStart;
    }
    public void setLimitStart(Integer limitStart){
        this.limitStart = limitStart;
    }
    private Integer limitSize;
    public Integer getLimitSize(){
        return limitSize;
    }
    public void setLimitSize(Integer limitSize){
        this.limitSize = limitSize;
    }
    
}

