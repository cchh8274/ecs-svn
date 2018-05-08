package cn.kanmars.entity;
/*
 * 聊天表
 */
public class TabMessage implements java.io.Serializable{
	
	private String userid;
	private String chatLog;
	private String chatTime;
	private String charId;
	private String stateZt;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getChatLog() {
		return chatLog;
	}
	public void setChatLog(String chatLog) {
		this.chatLog = chatLog;
	}
	public String getChatTime() {
		return chatTime;
	}
	public void setChatTime(String chatTime) {
		this.chatTime = chatTime;
	}
	public String getCharId() {
		return charId;
	}
	public void setCharId(String charId) {
		this.charId = charId;
	}
	public String getStateZt() {
		return stateZt;
	}
	public void setStateZt(String stateZt) {
		this.stateZt = stateZt;
	}
	
	
	public TabMessage(String userid, String chatLog, String chatTime, String charId, String stateZt) {
		super();
		this.userid = userid;
		this.chatLog = chatLog;
		this.chatTime = chatTime;
		this.charId = charId;
		this.stateZt = stateZt;
	}
	public TabMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TabMessage [userid=" + userid + ", chatLog=" + chatLog + ", chatTime=" + chatTime + ", charId=" + charId
				+ ", stateZt=" + stateZt + "]";
	}
	
	
}
	
	
