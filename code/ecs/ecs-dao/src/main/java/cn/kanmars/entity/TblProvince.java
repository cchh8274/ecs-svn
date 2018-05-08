package cn.kanmars.entity;

/**
 * 省表
 *tbl_province
 */
public class TblProvince implements java.io.Serializable{

	/**
     * id
     * tbl_province
     */
    private String id;
    
    /**
     * 省
     * tbl_province.name
     */
    private String name;
    
    /**
     * 关联区域id
     * tbl_province.area_id
     */
    private String area_id;
    
    /**
     * 区域民称
     */
    private String areaName;
    
    /**
     * 区域民称
     */
    private String univerName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea_id() {
		return area_id;
	}

	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getUniverName() {
		return univerName;
	}

	public void setUniverName(String univerName) {
		this.univerName = univerName;
	}

	public TblProvince() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TblProvince(String id, String name, String area_id, String areaName, String univerName) {
		super();
		this.id = id;
		this.name = name;
		this.area_id = area_id;
		this.areaName = areaName;
		this.univerName = univerName;
	}

	@Override
	public String toString() {
		return "TblProvince [id=" + id + ", name=" + name + ", area_id=" + area_id + ", areaName=" + areaName
				+ ", univerName=" + univerName + "]";
	}

	
}
