package cn.kanmars.entity;

/**
 * @author xzkp
 *	用户意向表
 */
public class TblWxUserIntention implements java.io.Serializable{
    private String id;

    /**
     * 用户id
     */
    private String openid;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户手机号码
     */
    private String userCell;

    /**
     * 大学id
     */
    private String universityId;

    /**
     * 大学名称
     */
    private String universityName;

    /**
     * 创建时间
     */
    private String creationTime;

    /**
     * 跟进记录
     */
    private String followRecord;
    
    /**
     * 审核状态
     */
    private String auditStatus;

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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUserCell() {
		return userCell;
	}
	public void setUserCell(String userCell) {
		this.userCell = userCell;
	}
	public String getUniversityId() {
		return universityId;
	}
	public void setUniversityId(String universityId) {
		this.universityId = universityId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getFollowRecord() {
		return followRecord;
	}
	public void setFollowRecord(String followRecord) {
		this.followRecord = followRecord;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public TblWxUserIntention() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblWxUserIntention(String id, String openid, String nickname, String userCell, String universityId,
			String universityName, String creationTime, String followRecord, String auditStatus, Integer limitStart,
			Integer limitSize) {
		super();
		this.id = id;
		this.openid = openid;
		this.nickname = nickname;
		this.userCell = userCell;
		this.universityId = universityId;
		this.universityName = universityName;
		this.creationTime = creationTime;
		this.followRecord = followRecord;
		this.auditStatus = auditStatus;
		this.limitStart = limitStart;
		this.limitSize = limitSize;
	}
	@Override
	public String toString() {
		return "TblWxUserIntention [id=" + id + ", openid=" + openid + ", nickname=" + nickname + ", userCell="
				+ userCell + ", universityId=" + universityId + ", universityName=" + universityName + ", creationTime="
				+ creationTime + ", followRecord=" + followRecord + ", auditStatus=" + auditStatus + ", limitStart="
				+ limitStart + ", limitSize=" + limitSize + "]";
	}
    
    
}