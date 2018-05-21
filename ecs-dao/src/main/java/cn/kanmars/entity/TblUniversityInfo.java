/**
 * ecm Generator 
 */
package cn.kanmars.entity;


/**
 * 大学表
 * tbl_university_info
 */
public class TblUniversityInfo implements java.io.Serializable{
    /**
     * ID
     * tbl_university_info.id
     */
    private String id;

    /**
     * 大学名称
     * tbl_university_info.univer_name
     */
    private String univerName;

    /**
     * 区域名称
     * tbl_university_info.area_name
     */
    private String areaName;

    /**
     * 区域ID
     * tbl_university_info.area_id
     */
    private String areaId;

    
    /**
     * 创建时间
     * tbl_university_info.create_time
     */
    private String createTime;

    /**
     * 创建人
     * tbl_university_info.create_user
     */
    private String createUser;

    /**
     * 修改时间
     * tbl_university_info.up_time
     */
    private String upTime;

    /**
     * 修改人
     * tbl_university_info.up_user
     */
    private String aurlb;
    private String upUser;
    private String code;
    private String sy_me;
    private String zme;
    private String myyjsr;
    private String rzstase;
    /**
     * 详细表字段
     * @return
     */
    /**
     * 大学id
     */
    private String universityId;
    /**
     * 图片
     */
    private String headimg;
    /**
     * 等级
     */
    private String universityGrade;
    /**
     * 人数
     */
    private String universityPeople;
    /**
     * 汇报率
     */
    private String universityProbability;
    /**
     * 介绍
     */
    private String universityAdvantage;
    /**
     * 位置
     * @return
     */
   private String lawz;
	

   

public TblUniversityInfo(String id, String univerName, String areaName, String areaId, String createTime,
			String createUser, String upTime, String aurlb, String upUser, String code, String sy_me, String zme,
			String myyjsr, String rzstase, String universityId, String headimg, String universityGrade,
			String universityPeople, String universityProbability, String universityAdvantage, String lawz,
			Integer limitStart, Integer limitSize) {
		super();
		this.id = id;
		this.univerName = univerName;
		this.areaName = areaName;
		this.areaId = areaId;
		this.createTime = createTime;
		this.createUser = createUser;
		this.upTime = upTime;
		this.aurlb = aurlb;
		this.upUser = upUser;
		this.code = code;
		this.sy_me = sy_me;
		this.zme = zme;
		this.myyjsr = myyjsr;
		this.rzstase = rzstase;
		this.universityId = universityId;
		this.headimg = headimg;
		this.universityGrade = universityGrade;
		this.universityPeople = universityPeople;
		this.universityProbability = universityProbability;
		this.universityAdvantage = universityAdvantage;
		this.lawz = lawz;
		this.limitStart = limitStart;
		this.limitSize = limitSize;
	}


public TblUniversityInfo() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
	public String toString() {
		return "TblUniversityInfo [id=" + id + ", univerName=" + univerName + ", areaName=" + areaName + ", areaId="
				+ areaId + ", createTime=" + createTime + ", createUser=" + createUser + ", upTime=" + upTime
				+ ", aurlb=" + aurlb + ", upUser=" + upUser + ", code=" + code + ", sy_me=" + sy_me + ", zme=" + zme
				+ ", myyjsr=" + myyjsr + ", rzstase=" + rzstase + ", universityId=" + universityId + ", headimg="
				+ headimg + ", universityGrade=" + universityGrade + ", universityPeople=" + universityPeople
				+ ", universityProbability=" + universityProbability + ", universityAdvantage=" + universityAdvantage
				+ ", lawz=" + lawz + ", limitStart=" + limitStart + ", limitSize=" + limitSize + "]";
	}

public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUniverName() {
		return univerName;
	}
	public void setUniverName(String univerName) {
		this.univerName = univerName;
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
	public String getUpTime() {
		return upTime;
	}
	public void setUpTime(String upTime) {
		this.upTime = upTime;
	}
	public String getAurlb() {
		return aurlb;
	}
	public void setAurlb(String aurlb) {
		this.aurlb = aurlb;
	}
	public String getUpUser() {
		return upUser;
	}
	public void setUpUser(String upUser) {
		this.upUser = upUser;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSy_me() {
		return sy_me;
	}
	public void setSy_me(String sy_me) {
		this.sy_me = sy_me;
	}
	public String getZme() {
		return zme;
	}
	public void setZme(String zme) {
		this.zme = zme;
	}
	public String getMyyjsr() {
		return myyjsr;
	}
	public void setMyyjsr(String myyjsr) {
		this.myyjsr = myyjsr;
	}
	public String getRzstase() {
		return rzstase;
	}
	public void setRzstase(String rzstase) {
		this.rzstase = rzstase;
	}
	public String getUniversityId() {
		return universityId;
	}
	public void setUniversityId(String universityId) {
		this.universityId = universityId;
	}
	public String getHeadimg() {
		return headimg;
	}
	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}
	public String getUniversityGrade() {
		return universityGrade;
	}
	public void setUniversityGrade(String universityGrade) {
		this.universityGrade = universityGrade;
	}
	public String getUniversityPeople() {
		return universityPeople;
	}
	public void setUniversityPeople(String universityPeople) {
		this.universityPeople = universityPeople;
	}
	public String getUniversityProbability() {
		return universityProbability;
	}
	public void setUniversityProbability(String universityProbability) {
		this.universityProbability = universityProbability;
	}
	public String getUniversityAdvantage() {
		return universityAdvantage;
	}
	public void setUniversityAdvantage(String universityAdvantage) {
		this.universityAdvantage = universityAdvantage;
	}
	public String getlawz() {
		return lawz;
	}
	public void setlawz(String lawz) {
		this.lawz = lawz;
	}
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

