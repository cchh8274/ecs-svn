/**
 * ecm Generator 
 */
package cn.kanmars.entity;


/**
 * 用户账户表
 * tbl_amount_info
 */
public class TblAmountInfo implements java.io.Serializable{
    /**
     * id
     * tbl_amount_info.id
     */
    private String id;

    /**
     * 用户名称
     * tbl_amount_info.user_name
     */
    private String userName;

    /**
     * openid
     * tbl_amount_info.openid
     */
    private String openid;

    /**
     * 账户金额
     * tbl_amount_info.account_money
     */
    private String accountMoney;

    /**
     * 是否启用
     * tbl_amount_info.is_start
     */
    private String isStart;

    /**
     * 账户ID
     * tbl_amount_info.account_id
     */
    private String accountId;

    /**
     * 账户创建时间
     * tbl_amount_info.account_time
     */
    private String accountTime;

    /**
     * 创建时间
     * tbl_amount_info.create_time
     */
    private String createTime;

    /**
     * 创建人
     * tbl_amount_info.create_user
     */
    private String createUser;

    /**
     * 是否冻结
     * tbl_amount_info.is_freeze
     */
    private String isFreeze;


    public TblAmountInfo(){super();}
    public TblAmountInfo(String id,String userName,String openid,String accountMoney,String isStart,String accountId,String accountTime,String createTime,String createUser,String isFreeze) {
        this.id = id;
        this.userName = userName;
        this.openid = openid;
        this.accountMoney = accountMoney;
        this.isStart = isStart;
        this.accountId = accountId;
        this.accountTime = accountTime;
        this.createTime = createTime;
        this.createUser = createUser;
        this.isFreeze = isFreeze;
    }
    

    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getAccountMoney() {
		return accountMoney;
	}
	public void setAccountMoney(String accountMoney) {
		this.accountMoney = accountMoney;
	}
	public String getIsStart() {
		return isStart;
	}
	public void setIsStart(String isStart) {
		this.isStart = isStart;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountTime() {
		return accountTime;
	}
	public void setAccountTime(String accountTime) {
		this.accountTime = accountTime;
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
	public String getIsFreeze() {
		return isFreeze;
	}
	public void setIsFreeze(String isFreeze) {
		this.isFreeze = isFreeze;
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
	@Override
	public String toString() {
		return "TblAmountInfo [id=" + id + ", userName=" + userName + ", openid=" + openid + ", accountMoney="
				+ accountMoney + ", isStart=" + isStart + ", accountId=" + accountId + ", accountTime=" + accountTime
				+ ", createTime=" + createTime + ", createUser=" + createUser + ", isFreeze=" + isFreeze
				+ ", limitStart=" + limitStart + ", limitSize=" + limitSize + "]";
	}
    
}

