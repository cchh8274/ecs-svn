/**
 * ecm Generator 
 */
package cn.kanmars.entity;


/**
 * 收益表
 * tbl_earnings_info
 */
public class TblEarningsInfo implements java.io.Serializable{
    /**
     * id
     * tbl_earnings_info.id
     */
    private String id;

    /**
     * openid
     * tbl_earnings_info.openid
     */
    private String openid;

    /**
     * 微信用户
     * tbl_earnings_info.wx_user_name
     */
    private String wxUserName;

    /**
     * 机器ID
     * tbl_earnings_info.maniche_id
     */
    private String manicheId;

    /**
     * 大学名称
     * tbl_earnings_info.unversity_name
     */
    private String unversityName;

    /**
     * 大学ID
     * tbl_earnings_info.unversity_id
     */
    private String unversityId;

    /**
     * 机器名称
     * tbl_earnings_info.maniche_name
     */
    private String manicheName;

    /**
     * 收益单价
     * tbl_earnings_info.price
     */
    private String price;

    /**
     * 收益咖啡机数量
     * tbl_earnings_info.coffee_number
     */
    private String coffeeNumber;

    /**
     * 当月收益总金额
     * tbl_earnings_info.tolal_money
     */
    private String tolalMoney;

    /**
     * 收益时间
     * tbl_earnings_info.earing_month
     */
    private String earingMonth;

    /**
     * 收益开始时间
     * tbl_earnings_info.earning_start_time
     */
    private String earningStartTime;
    /**
     * 是否下发收益
     * tbl_earnings_info.is_eaning_status
     */
    private String isEaningStatus;

    /**
     * 收益下发时间
     * tbl_earnings_info.earning_send_time
     */
    private String earningSendTime;

    /**
     * 创建时间
     * tbl_earnings_info.create_time
     */
    private String createTime;

    /**
     * 创建人
     * tbl_earnings_info.create_user
     */
    private String createUser;

    /**
     * 修改时间
     * tbl_earnings_info.update_time
     */
    private String updateTime;

    /**
     * 修改人
     * tbl_earnings_info.update_user
     */
    private String updateUser;
	
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
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getWxUserName() {
		return wxUserName;
	}
	public void setWxUserName(String wxUserName) {
		this.wxUserName = wxUserName;
	}
	public String getManicheId() {
		return manicheId;
	}
	public void setManicheId(String manicheId) {
		this.manicheId = manicheId;
	}
	public String getUnversityName() {
		return unversityName;
	}
	public void setUnversityName(String unversityName) {
		this.unversityName = unversityName;
	}
	public String getUnversityId() {
		return unversityId;
	}
	public void setUnversityId(String unversityId) {
		this.unversityId = unversityId;
	}
	public String getManicheName() {
		return manicheName;
	}
	public void setManicheName(String manicheName) {
		this.manicheName = manicheName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCoffeeNumber() {
		return coffeeNumber;
	}
	public void setCoffeeNumber(String coffeeNumber) {
		this.coffeeNumber = coffeeNumber;
	}
	public String getTolalMoney() {
		return tolalMoney;
	}
	public void setTolalMoney(String tolalMoney) {
		this.tolalMoney = tolalMoney;
	}
	public String getEaringMonth() {
		return earingMonth;
	}
	public void setEaringMonth(String earingMonth) {
		this.earingMonth = earingMonth;
	}
	public String getEarningStartTime() {
		return earningStartTime;
	}
	public void setEarningStartTime(String earningStartTime) {
		this.earningStartTime = earningStartTime;
	}
	public String getIsEaningStatus() {
		return isEaningStatus;
	}
	public void setIsEaningStatus(String isEaningStatus) {
		this.isEaningStatus = isEaningStatus;
	}
	public String getEarningSendTime() {
		return earningSendTime;
	}
	public void setEarningSendTime(String earningSendTime) {
		this.earningSendTime = earningSendTime;
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
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public TblEarningsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblEarningsInfo(String id, String openid, String wxUserName, String manicheId, String unversityName,
			String unversityId, String manicheName, String price, String coffeeNumber, String tolalMoney,
			String earingMonth, String earningStartTime, String isEaningStatus, String earningSendTime,
			String createTime, String createUser, String updateTime, String updateUser, Integer limitStart,
			Integer limitSize) {
		super();
		this.id = id;
		this.openid = openid;
		this.wxUserName = wxUserName;
		this.manicheId = manicheId;
		this.unversityName = unversityName;
		this.unversityId = unversityId;
		this.manicheName = manicheName;
		this.price = price;
		this.coffeeNumber = coffeeNumber;
		this.tolalMoney = tolalMoney;
		this.earingMonth = earingMonth;
		this.earningStartTime = earningStartTime;
		this.isEaningStatus = isEaningStatus;
		this.earningSendTime = earningSendTime;
		this.createTime = createTime;
		this.createUser = createUser;
		this.updateTime = updateTime;
		this.updateUser = updateUser;
		this.limitStart = limitStart;
		this.limitSize = limitSize;
	}
	@Override
	public String toString() {
		return "TblEarningsInfo [id=" + id + ", openid=" + openid + ", wxUserName=" + wxUserName + ", manicheId="
				+ manicheId + ", unversityName=" + unversityName + ", unversityId=" + unversityId + ", manicheName="
				+ manicheName + ", price=" + price + ", coffeeNumber=" + coffeeNumber + ", tolalMoney=" + tolalMoney
				+ ", earingMonth=" + earingMonth + ", earningStartTime=" + earningStartTime + ", isEaningStatus="
				+ isEaningStatus + ", earningSendTime=" + earningSendTime + ", createTime=" + createTime
				+ ", createUser=" + createUser + ", updateTime=" + updateTime + ", updateUser=" + updateUser
				+ ", limitStart=" + limitStart + ", limitSize=" + limitSize + "]";
	}
	
}
