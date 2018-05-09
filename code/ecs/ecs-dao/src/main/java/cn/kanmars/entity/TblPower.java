package cn.kanmars.entity;

import java.util.List;

/**
 * 权限表
 *tbl_power
 */
public class TblPower implements java.io.Serializable{

	/**
     * id
     * tbl_power
     */
    private Integer id;
    
    /**
     * text
     * tbl_power
     */
    private String text;
    
    /**
     * url
     * tbl_power
     */
    private String url;
    
    /**
     * pid
     * tbl_power
     */
    private Integer pid;
    
    private List<TblPower> children;
    
    private boolean checked = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public List<TblPower> getChildren() {
		return children;
	}

	public void setChildren(List<TblPower> children) {
		this.children = children;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public TblPower() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TblPower(Integer id, String text, String url, Integer pid, List<TblPower> children, boolean checked) {
		super();
		this.id = id;
		this.text = text;
		this.url = url;
		this.pid = pid;
		this.children = children;
		this.checked = checked;
	}

	@Override
	public String toString() {
		return "TblPower [id=" + id + ", text=" + text + ", url=" + url + ", pid=" + pid + ", children=" + children
				+ ", checked=" + checked + "]";
	}

	
}
