/**
 * ecm Generator 
 */
package cn.kanmars.entity;


/**
 * 银行账户表
 * tbl_bankamount_info
 */
public class TblBankamountInfo implements java.io.Serializable{
    /**
     * id
     * tbl_bankamount_info.id
     */
    private String id;

    /**
     * 用户名称
     * tbl_bankamount_info.user_name
     */
    private String userName;

    /**
     * 身份证号
     * tbl_bankamount_info.idcard
     */
    private String idcard;

    /**
     * 电话
     * tbl_bankamount_info.phone
     */
    private String phone;

    /**
     * 微信用户名称
     * tbl_bankamount_info.wx_name
     */
    private String wxName;

    /**
     * openid
     * tbl_bankamount_info.openid
     */
    private String openid;

    /**
     * 银行账户
     * tbl_bankamount_info.bank_amount_no
     */
    private String bankAmountNo;

    /**
     * 银行名称
     * tbl_bankamount_info.bank_name
     */
    private String bankName;

    /**
     * 开户地址
     * tbl_bankamount_info.bank_adress
     */
    private String bankAdress;

    /**
     * 创建时间
     * tbl_bankamount_info.create_time
     */
    private String createTime;

    /**
     * 创建人
     * tbl_bankamount_info.create_user
     */
    private String createUser;

    /**
     * 修改时间
     * tbl_bankamount_info.update_time
     */
    private String updateTime;

    /**
     * 修改人
     * tbl_bankamount_info.update_user
     */
    private String updateUser;
    
    /**
     * 提现密码
     * tbl_bankamount_info.forward_pwd
     */
    private String forwardPwd;

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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWxName() {
		return wxName;
	}
	public void setWxName(String wxName) {
		this.wxName = wxName;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getBankAmountNo() {
		return bankAmountNo;
	}
	public void setBankAmountNo(String bankAmountNo) {
		this.bankAmountNo = bankAmountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAdress() {
		return bankAdress;
	}
	public void setBankAdress(String bankAdress) {
		this.bankAdress = bankAdress;
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
	public String getForwardPwd() {
		return forwardPwd;
	}
	public void setForwardPwd(String forwardPwd) {
		this.forwardPwd = forwardPwd;
	}
	public TblBankamountInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblBankamountInfo(String id, String userName, String idcard, String phone, String wxName, String openid,
			String bankAmountNo, String bankName, String bankAdress, String createTime, String createUser,
			String updateTime, String updateUser, String forwardPwd, Integer limitStart, Integer limitSize) {
		super();
		this.id = id;
		this.userName = userName;
		this.idcard = idcard;
		this.phone = phone;
		this.wxName = wxName;
		this.openid = openid;
		this.bankAmountNo = bankAmountNo;
		this.bankName = bankName;
		this.bankAdress = bankAdress;
		this.createTime = createTime;
		this.createUser = createUser;
		this.updateTime = updateTime;
		this.updateUser = updateUser;
		this.forwardPwd = forwardPwd;
		this.limitStart = limitStart;
		this.limitSize = limitSize;
	}
	@Override
	public String toString() {
		return "TblBankamountInfo [id=" + id + ", userName=" + userName + ", idcard=" + idcard + ", phone=" + phone
				+ ", wxName=" + wxName + ", openid=" + openid + ", bankAmountNo=" + bankAmountNo + ", bankName="
				+ bankName + ", bankAdress=" + bankAdress + ", createTime=" + createTime + ", createUser=" + createUser
				+ ", updateTime=" + updateTime + ", updateUser=" + updateUser + ", forwardPwd=" + forwardPwd
				+ ", limitStart=" + limitStart + ", limitSize=" + limitSize + "]";
	}
	
}

