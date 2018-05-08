package cn.kanmars.entity;
/*
 * 会话表
 */
public class TabSurface implements java.io.Serializable{
	
	private String id;
	private String userId;
	private String fwId;
	private String ztState;
	private String chatState;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFwId() {
		return fwId;
	}
	public void setFwId(String fwId) {
		this.fwId = fwId;
	}
	public String getZtState() {
		return ztState;
	}
	public void setZtState(String ztState) {
		this.ztState = ztState;
	}
	public String getChatState() {
		return chatState;
	}
	public void setChatState(String chatState) {
		this.chatState = chatState;
	}
	
	public TabSurface() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TabSurface(String id, String userId, String fwId, String ztState, String chatState) {
		super();
		this.id = id;
		this.userId = userId;
		this.fwId = fwId;
		this.ztState = ztState;
		this.chatState = chatState;
	}
	@Override
	public String toString() {
		return "TabSurface [id=" + id + ", userId=" + userId + ", fwId=" + fwId + ", ztState=" + ztState
				+ ", chatState=" + chatState + "]";
	}
	
}
