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
	 * 图片
	 */
    private String headimg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName == null ? null : universityName.trim();
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId == null ? null : universityId.trim();
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
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

	public TblUniversityDetails(String id, String universityName, String universityId, String headimg,
			Integer limitStart, Integer limitSize) {
		super();
		this.id = id;
		this.universityName = universityName;
		this.universityId = universityId;
		this.headimg = headimg;
		this.limitStart = limitStart;
		this.limitSize = limitSize;
	}

	public TblUniversityDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TblUniversityDetails [id=" + id + ", universityName=" + universityName + ", universityId="
				+ universityId + ", headimg=" + headimg + ", limitStart=" + limitStart + ", limitSize=" + limitSize
				+ "]";
	}
    
}