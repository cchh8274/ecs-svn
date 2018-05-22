/**
 * ecm Generator 
 */
package cn.kanmars.entity;


/**
 * 体现记录表
 * tbl_reflect_info
 */
public class TblReflectInfo implements java.io.Serializable{
    /**
     * id
     * tbl_reflect_info.id
     */
    private String id;

    /**
     * 体现流水号
     * tbl_reflect_info.trans_no
     */
    private String transNo;

    /**
     * openid
     * tbl_reflect_info.openid
     */
    private String openid;

    /**
     * 微信用户
     * tbl_reflect_info.wx_user
     */
    private String wxUser;

    /**
     * 体现用户
     * tbl_reflect_info.reflect_user
     */
    private String reflectUser;

    /**
     * 银行卡号
     * tbl_reflect_info.bank_card
     */
    private String bankCard;

    /**
     * 银行名称
     * tbl_reflect_info.bank_name
     */
    private String bankName;

    /**
     * 提现金额
     * tbl_reflect_info.reflect_money
     */
    private String reflectMoney;

    /**
     * 是否到账
     * tbl_reflect_info.is_account
     */
    private String isAccount;

    /**
     * 是否冻结
     * tbl_reflect_info.is_freeze
     */
    private String isFreeze;

    /**
     * 到账时间
     * tbl_reflect_info.account_time
     */
    private String accountTime;

    /**
     * 创建时间
     * tbl_reflect_info.create_time
     */
    private String createTime;

    /**
     * 创建人
     * tbl_reflect_info.create_user
     */
    private String createUser;
    
    /**
     * 大学名称
     * tbl_reflect_info.univer_name
     */
    private String univerName;
    
    /**
     * 大学id
     * tbl_reflect_info.univer_id
     */
    private String univerId;
    
    /**
     * 预留字段1
     * tbl_reflect_info.univer_name
     */
    private String col1;
    
    /**
     * 预留字段2
     * tbl_reflect_info.univer_name
     */
    private String col2;

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
	public String getTransNo() {
		return transNo;
	}
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getWxUser() {
		return wxUser;
	}
	public void setWxUser(String wxUser) {
		this.wxUser = wxUser;
	}
	public String getReflectUser() {
		return reflectUser;
	}
	public void setReflectUser(String reflectUser) {
		this.reflectUser = reflectUser;
	}
	public String getBankCard() {
		return bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getReflectMoney() {
		return reflectMoney;
	}
	public void setReflectMoney(String reflectMoney) {
		this.reflectMoney = reflectMoney;
	}
	public String getIsAccount() {
		return isAccount;
	}
	public void setIsAccount(String isAccount) {
		this.isAccount = isAccount;
	}
	public String getIsFreeze() {
		return isFreeze;
	}
	public void setIsFreeze(String isFreeze) {
		this.isFreeze = isFreeze;
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
	public String getUniverName() {
		return univerName;
	}
	public void setUniverName(String univerName) {
		this.univerName = univerName;
	}
	public String getUniverId() {
		return univerId;
	}
	public void setUniverId(String univerId) {
		this.univerId = univerId;
	}
	public String getCol1() {
		return col1;
	}
	public void setCol1(String col1) {
		this.col1 = col1;
	}
	public String getCol2() {
		return col2;
	}
	public void setCol2(String col2) {
		this.col2 = col2;
	}
	public TblReflectInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblReflectInfo(String id, String transNo, String openid, String wxUser, String reflectUser, String bankCard,
			String bankName, String reflectMoney, String isAccount, String isFreeze, String accountTime,
			String createTime, String createUser, String univerName, String univerId, String col1, String col2,
			Integer limitStart, Integer limitSize) {
		super();
		this.id = id;
		this.transNo = transNo;
		this.openid = openid;
		this.wxUser = wxUser;
		this.reflectUser = reflectUser;
		this.bankCard = bankCard;
		this.bankName = bankName;
		this.reflectMoney = reflectMoney;
		this.isAccount = isAccount;
		this.isFreeze = isFreeze;
		this.accountTime = accountTime;
		this.createTime = createTime;
		this.createUser = createUser;
		this.univerName = univerName;
		this.univerId = univerId;
		this.col1 = col1;
		this.col2 = col2;
		this.limitStart = limitStart;
		this.limitSize = limitSize;
	}
	@Override
	public String toString() {
		return "TblReflectInfo [id=" + id + ", transNo=" + transNo + ", openid=" + openid + ", wxUser=" + wxUser
				+ ", reflectUser=" + reflectUser + ", bankCard=" + bankCard + ", bankName=" + bankName
				+ ", reflectMoney=" + reflectMoney + ", isAccount=" + isAccount + ", isFreeze=" + isFreeze
				+ ", accountTime=" + accountTime + ", createTime=" + createTime + ", createUser=" + createUser
				+ ", univerName=" + univerName + ", univerId=" + univerId + ", col1=" + col1 + ", col2=" + col2
				+ ", limitStart=" + limitStart + ", limitSize=" + limitSize + "]";
	}
    
    
}

