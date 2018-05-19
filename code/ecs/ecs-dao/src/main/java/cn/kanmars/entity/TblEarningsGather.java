/**
 * ecm Generator 
 */
package cn.kanmars.entity;


/**
 * 收益汇总表
 * tbl_earnings_gather
 */
public class TblEarningsGather implements java.io.Serializable{
    /**
     * 
     * tbl_earnings_gather.id
     */
    private String id;

    /**
     * 收益月份
     * tbl_earnings_gather.ernings_month
     */
    private String erningsMonth;

    /**
     * 收益大学
     * tbl_earnings_gather.unversity_id
     */
    private String unversityId;

    /**
     * 购买份数总额
     * tbl_earnings_gather.number
     */
    private String number;

    /**
     * openid
     * tbl_earnings_gather.openid
     */
    private String openid;

    /**
     * 大学名称
     * tbl_earnings_gather.unversity_name
     */
    private String unversityName;

    /**
     * 区域名称
     * tbl_earnings_gather.area_name
     */
    private String areaName;

    /**
     * 收益区域
     * tbl_earnings_gather.area_id
     */
    private String areaId;

    /**
     * 创建时间
     * tbl_earnings_gather.createtime
     */
    private String createtime;

    /**
     * 创建人
     * tbl_earnings_gather.create_user
     */
    private String createUser;
    
    /**
     * 收益类型（010月份收益；020总收益）
     * tbl_earnings_gather.earning_type
     */
    private String earningType;
    
    /**
     * 开始收益日期
     * tbl_earnings_gather.start_earning_time
     */
    private String startEarningTime;
    
    /**
     * 投放日期
     * tbl_earnings_gather.location_time
     */
    private String locationTime;


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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getErningsMonth() {
		return erningsMonth;
	}
	public void setErningsMonth(String erningsMonth) {
		this.erningsMonth = erningsMonth;
	}
	public String getUnversityId() {
		return unversityId;
	}
	public void setUnversityId(String unversityId) {
		this.unversityId = unversityId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getUnversityName() {
		return unversityName;
	}
	public void setUnversityName(String unversityName) {
		this.unversityName = unversityName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getEarningType() {
		return earningType;
	}
	public void setEarningType(String earningType) {
		this.earningType = earningType;
	}
	public String getStartEarningTime() {
		return startEarningTime;
	}
	public void setStartEarningTime(String startEarningTime) {
		this.startEarningTime = startEarningTime;
	}
	public String getLocationTime() {
		return locationTime;
	}
	public void setLocationTime(String locationTime) {
		this.locationTime = locationTime;
	}
	public TblEarningsGather() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblEarningsGather(String id, String erningsMonth, String unversityId, String number, String openid,
			String unversityName, String areaName, String areaId, String createtime, String createUser,
			String earningType, String startEarningTime, String locationTime, Integer limitStart, Integer limitSize) {
		super();
		this.id = id;
		this.erningsMonth = erningsMonth;
		this.unversityId = unversityId;
		this.number = number;
		this.openid = openid;
		this.unversityName = unversityName;
		this.areaName = areaName;
		this.areaId = areaId;
		this.createtime = createtime;
		this.createUser = createUser;
		this.earningType = earningType;
		this.startEarningTime = startEarningTime;
		this.locationTime = locationTime;
		this.limitStart = limitStart;
		this.limitSize = limitSize;
	}
	@Override
	public String toString() {
		return "TblEarningsGather [id=" + id + ", erningsMonth=" + erningsMonth + ", unversityId=" + unversityId
				+ ", number=" + number + ", openid=" + openid + ", unversityName=" + unversityName + ", areaName="
				+ areaName + ", areaId=" + areaId + ", createtime=" + createtime + ", createUser=" + createUser
				+ ", earningType=" + earningType + ", startEarningTime=" + startEarningTime + ", locationTime="
				+ locationTime + ", limitStart=" + limitStart + ", limitSize=" + limitSize + "]";
	}
    
    
}

