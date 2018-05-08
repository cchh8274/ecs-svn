/**
 * ecm Generator 
 */
package cn.kanmars.entity;


/**
 * 收益汇总表
 * tbl_earnings_gather
 */
public class TblEarningsGather implements java.io.Serializable{
    /**
     * 
     * tbl_earnings_gather.id
     */
    private String id;

    /**
     * 收益月份
     * tbl_earnings_gather.ernings_month
     */
    private String erningsMonth;

    /**
     * 收益大学
     * tbl_earnings_gather.unversity_id
     */
    private String unversityId;

    /**
     * 购买份数总额
     * tbl_earnings_gather.number
     */
    private String number;

    /**
     * openid
     * tbl_earnings_gather.openid
     */
    private String openid;

    /**
     * 大学名称
     * tbl_earnings_gather.unversity_name
     */
    private String unversityName;

    /**
     * 区域名称
     * tbl_earnings_gather.area_name
     */
    private String areaName;

    /**
     * 收益区域
     * tbl_earnings_gather.area_id
     */
    private String areaId;

    /**
     * 创建时间
     * tbl_earnings_gather.createtime
     */
    private String createtime;

    /**
     * 创建人
     * tbl_earnings_gather.create_user
     */
    private String createUser;


    public TblEarningsGather(){super();}
    public TblEarningsGather(String id,String erningsMonth,String unversityId,String number,String openid,String unversityName,String areaName,String areaId,String createtime,String createUser) {
        this.id = id;
        this.erningsMonth = erningsMonth;
        this.unversityId = unversityId;
        this.number = number;
        this.openid = openid;
        this.unversityName = unversityName;
        this.areaName = areaName;
        this.areaId = areaId;
        this.createtime = createtime;
        this.createUser = createUser;
    }
    /**
     * 
     * tbl_earnings_gather.id
     */
    public String getId(){
        return id;
    }

    /**
     * 
     * tbl_earnings_gather.id
     */
    public void setId(String id){
        this.id=id;
    }

    /**
     * 收益月份
     * tbl_earnings_gather.ernings_month
     */
    public String getErningsMonth(){
        return erningsMonth;
    }

    /**
     * 收益月份
     * tbl_earnings_gather.ernings_month
     */
    public void setErningsMonth(String erningsMonth){
        this.erningsMonth=erningsMonth;
    }

    /**
     * 收益大学
     * tbl_earnings_gather.unversity_id
     */
    public String getUnversityId(){
        return unversityId;
    }

    /**
     * 收益大学
     * tbl_earnings_gather.unversity_id
     */
    public void setUnversityId(String unversityId){
        this.unversityId=unversityId;
    }

    /**
     * 购买份数总额
     * tbl_earnings_gather.number
     */
    public String getNumber(){
        return number;
    }

    /**
     * 购买份数总额
     * tbl_earnings_gather.number
     */
    public void setNumber(String number){
        this.number=number;
    }

    /**
     * openid
     * tbl_earnings_gather.openid
     */
    public String getOpenid(){
        return openid;
    }

    /**
     * openid
     * tbl_earnings_gather.openid
     */
    public void setOpenid(String openid){
        this.openid=openid;
    }

    /**
     * 大学名称
     * tbl_earnings_gather.unversity_name
     */
    public String getUnversityName(){
        return unversityName;
    }

    /**
     * 大学名称
     * tbl_earnings_gather.unversity_name
     */
    public void setUnversityName(String unversityName){
        this.unversityName=unversityName;
    }

    /**
     * 区域名称
     * tbl_earnings_gather.area_name
     */
    public String getAreaName(){
        return areaName;
    }

    /**
     * 区域名称
     * tbl_earnings_gather.area_name
     */
    public void setAreaName(String areaName){
        this.areaName=areaName;
    }

    /**
     * 收益区域
     * tbl_earnings_gather.area_id
     */
    public String getAreaId(){
        return areaId;
    }

    /**
     * 收益区域
     * tbl_earnings_gather.area_id
     */
    public void setAreaId(String areaId){
        this.areaId=areaId;
    }

    /**
     * 创建时间
     * tbl_earnings_gather.createtime
     */
    public String getCreatetime(){
        return createtime;
    }

    /**
     * 创建时间
     * tbl_earnings_gather.createtime
     */
    public void setCreatetime(String createtime){
        this.createtime=createtime;
    }

    /**
     * 创建人
     * tbl_earnings_gather.create_user
     */
    public String getCreateUser(){
        return createUser;
    }

    /**
     * 创建人
     * tbl_earnings_gather.create_user
     */
    public void setCreateUser(String createUser){
        this.createUser=createUser;
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
}

