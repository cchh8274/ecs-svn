package cn.kanmars.entity;
/**
 *大学详情
 *张见军
 * @author Administrator
 *
 */
public class TblUniversityDetails implements java.io.Serializable{
	/**
	 * 主见
	 */
    private String id;
    /**
	 * 大学名称
	 */
    private String universityName;
    /**
	 * 大学id 关联id
	 */
    private String universityId;
    /**
	 * 大学图片
	 */
    private String headimg;
    /**
   	 * 大学等级（1级）
   	 */
    private String universityGrade;
    /**
   	 * 大学人数
   	 */
    private String universityPeople;
    /**
   	 * 大学投资回报率（百分比）
   	 */
    private String universityProbability;
    /**
   	 * 大学优势介绍
   	 */
    private String universityAdvantage;

    private String universityStatus;
    public String getUniversityStatus() {
		return universityStatus;
	}
	public void setUniversityStatus(String universityStatus) {
		this.universityStatus = universityStatus;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
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
	public TblUniversityDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblUniversityDetails(String id, String universityName, String universityId, String headimg,
			String universityGrade, String universityPeople, String universityProbability, String universityAdvantage,
			String universityStatus,Integer limitStart, Integer limitSize) {
		super();
		this.id = id;
		this.universityName = universityName;
		this.universityId = universityId;
		this.headimg = headimg;
		this.universityGrade = universityGrade;
		this.universityPeople = universityPeople;
		this.universityProbability = universityProbability;
		this.universityAdvantage = universityAdvantage;
		this.universityStatus = universityStatus;
		this.limitStart = limitStart;
		this.limitSize = limitSize;
	}
	@Override
	public String toString() {
		return "TblUniversityDetails [id=" + id + ", universityName=" + universityName + ", universityId="
				+ universityId + ", headimg=" + headimg + ", universityGrade=" + universityGrade + ", universityPeople="
				+ universityPeople + ", universityProbability=" + universityProbability + ", universityAdvantage="
				+ universityAdvantage + ", limitStart=" + limitStart + ", limitSize=" + limitSize + "]";
	}

    
}