package cn.kanmars.entity;

public class TblUserCoffeemachine implements java.io.Serializable{
    private String id;

    private String univerId;

    private String univerName;

    private String state;

    private String investmentTime;

    private String patm;

    private String accumulativeProfit;

    private String tmProfit;

    private String openid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUniverId() {
		return univerId;
	}

	public void setUniverId(String univerId) {
		this.univerId = univerId;
	}

	public String getUniverName() {
		return univerName;
	}

	public void setUniverName(String univerName) {
		this.univerName = univerName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInvestmentTime() {
		return investmentTime;
	}

	public void setInvestmentTime(String investmentTime) {
		this.investmentTime = investmentTime;
	}

	public String getPatm() {
		return patm;
	}

	public void setPatm(String patm) {
		this.patm = patm;
	}

	public String getAccumulativeProfit() {
		return accumulativeProfit;
	}

	public void setAccumulativeProfit(String accumulativeProfit) {
		this.accumulativeProfit = accumulativeProfit;
	}

	public String getTmProfit() {
		return tmProfit;
	}

	public void setTmProfit(String tmProfit) {
		this.tmProfit = tmProfit;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public TblUserCoffeemachine(String id, String univerId, String univerName, String state, String investmentTime,
			String patm, String accumulativeProfit, String tmProfit, String openid) {
		super();
		this.id = id;
		this.univerId = univerId;
		this.univerName = univerName;
		this.state = state;
		this.investmentTime = investmentTime;
		this.patm = patm;
		this.accumulativeProfit = accumulativeProfit;
		this.tmProfit = tmProfit;
		this.openid = openid;
	}

	public TblUserCoffeemachine() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TblUserCoffeemachine [id=" + id + ", univerId=" + univerId + ", univerName=" + univerName + ", state="
				+ state + ", investmentTime=" + investmentTime + ", patm=" + patm + ", accumulativeProfit="
				+ accumulativeProfit + ", tmProfit=" + tmProfit + ", openid=" + openid + "]";
	}

   
   
}