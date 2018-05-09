package cn.kanmars.entity;
/**
 *我的咖啡机收益
 * @author Administrator
 *
 */
public class CfProfit implements java.io.Serializable{

	/**
	 * id
	 */
	private String id; 
	/**
	 * 区域id
	 */
	private String areaCode;
	/**
	 * 市id
	 */
	private String enableLevl;
	/**
	 * 盈利状态1盈利中0为盈利
	 */
	private String piofitStatic;
	/**
	 * 投资日期
	 */
	private String InvestmentTime;
	/**
	 * 收益日期
	 */
	private String piofitTime;
	/**
	 * 累计盈利
	 */
	private String sumPiofit;
	/**
	 * 本月盈利
	 */
	private String tmPiofit;
	/**
	 * 
	 */
	private String piofit1;
	/**
	 * 
	 */
	private String piofit2;
	/**
	 * 
	 */
	private String piofit3;
	/**
	 * 
	 */
	private String piofit4;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getEnableLevl() {
		return enableLevl;
	}
	public void setEnableLevl(String enableLevl) {
		this.enableLevl = enableLevl;
	}
	public String getPiofitStatic() {
		return piofitStatic;
	}
	public void setPiofitStatic(String piofitStatic) {
		this.piofitStatic = piofitStatic;
	}
	public String getInvestmentTime() {
		return InvestmentTime;
	}
	public void setInvestmentTime(String investmentTime) {
		InvestmentTime = investmentTime;
	}
	public String getPiofitTime() {
		return piofitTime;
	}
	public void setPiofitTime(String piofitTime) {
		this.piofitTime = piofitTime;
	}
	public String getSumPiofit() {
		return sumPiofit;
	}
	public void setSumPiofit(String sumPiofit) {
		this.sumPiofit = sumPiofit;
	}
	public String getTmPiofit() {
		return tmPiofit;
	}
	public void setTmPiofit(String tmPiofit) {
		this.tmPiofit = tmPiofit;
	}
	public String getPiofit1() {
		return piofit1;
	}
	public void setPiofit1(String piofit1) {
		this.piofit1 = piofit1;
	}
	public String getPiofit2() {
		return piofit2;
	}
	public void setPiofit2(String piofit2) {
		this.piofit2 = piofit2;
	}
	public String getPiofit3() {
		return piofit3;
	}
	public void setPiofit3(String piofit3) {
		this.piofit3 = piofit3;
	}
	public String getPiofit4() {
		return piofit4;
	}
	public void setPiofit4(String piofit4) {
		this.piofit4 = piofit4;
	}
	public CfProfit(String id, String areaCode, String enableLevl, String piofitStatic, String investmentTime,
			String piofitTime, String sumPiofit, String tmPiofit, String piofit1, String piofit2, String piofit3,
			String piofit4) {
		super();
		this.id = id;
		this.areaCode = areaCode;
		this.enableLevl = enableLevl;
		this.piofitStatic = piofitStatic;
		InvestmentTime = investmentTime;
		this.piofitTime = piofitTime;
		this.sumPiofit = sumPiofit;
		this.tmPiofit = tmPiofit;
		this.piofit1 = piofit1;
		this.piofit2 = piofit2;
		this.piofit3 = piofit3;
		this.piofit4 = piofit4;
	}
	public CfProfit() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CfProfit [id=" + id + ", areaCode=" + areaCode + ", enableLevl=" + enableLevl + ", piofitStatic="
				+ piofitStatic + ", InvestmentTime=" + InvestmentTime + ", piofitTime=" + piofitTime + ", sumPiofit="
				+ sumPiofit + ", tmPiofit=" + tmPiofit + ", piofit1=" + piofit1 + ", piofit2=" + piofit2 + ", piofit3="
				+ piofit3 + ", piofit4=" + piofit4 + "]";
	}
	
	
}
