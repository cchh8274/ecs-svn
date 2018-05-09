/**
 * ecm Generator 
 */
package cn.kanmars.entity;


/**
 * 订单支付表
 * tbl_order_deal
 */
public class TblOrderDeal implements java.io.Serializable{
    /**
     * id
     * tbl_order_deal.id
     */
    private String id;

    /**
     * 订单号
     * tbl_order_deal.order_no
     */
    private String orderNo;

    /**
     * 商品描述
     * tbl_order_deal.body
     */
    private String body;

    /**
     * 商品详情
     * tbl_order_deal.detail
     */
    private String detail;

    /**
     * 名额数量
     * tbl_order_deal.number
     */
    private String number;

    /**
     * 名额单价
     * tbl_order_deal.price
     */
    private String price;

    /**
     * 总金额
     * tbl_order_deal.total_fee
     */
    private String totalFee;

    /**
     * 用户IP地址
     * tbl_order_deal.spbill_create_ip
     */
    private String spbillCreateIp;

    /**
     * 交易起始时间
     * tbl_order_deal.pay_start_time
     */
    private String payStartTime;

    /**
     * 交易结束时间
     * tbl_order_deal.pay_end_time
     */
    private String payEndTime;

    /**
     * goods_tag
     * tbl_order_deal.goods_tag
     */
    private String goodsTag;

    /**
     * 购买用户ID
     * tbl_order_deal.openid
     */
    private String openid;

    /**
     * 支付完成时间
     * tbl_order_deal.pay_time
     */
    private String payTime;

    /**
     * 支付状态
     * tbl_order_deal.pay_status
     */
    private String payStatus;

    /**
     * 机器ID
     * tbl_order_deal.maniche_id
     */
    private String manicheId;

    /**
     * 区域ID
     * tbl_order_deal.area_id
     */
    private String areaId;

    /**
     * 大学ID
     * tbl_order_deal.university_id
     */
    private String universityId;

    /**
     * 创建时间
     * tbl_order_deal.create_time
     */
    private String createTime;

    /**
     * 创建人
     * tbl_order_deal.create_user
     */
    private String createUser;


    public TblOrderDeal(){super();}
    public TblOrderDeal(String id,String orderNo,String body,String detail,String number,String price,String totalFee,String spbillCreateIp,String payStartTime,String payEndTime,String goodsTag,String openid,String payTime,String payStatus,String manicheId,String areaId,String universityId,String createTime,String createUser) {
        this.id = id;
        this.orderNo = orderNo;
        this.body = body;
        this.detail = detail;
        this.number = number;
        this.price = price;
        this.totalFee = totalFee;
        this.spbillCreateIp = spbillCreateIp;
        this.payStartTime = payStartTime;
        this.payEndTime = payEndTime;
        this.goodsTag = goodsTag;
        this.openid = openid;
        this.payTime = payTime;
        this.payStatus = payStatus;
        this.manicheId = manicheId;
        this.areaId = areaId;
        this.universityId = universityId;
        this.createTime = createTime;
        this.createUser = createUser;
    }
    /**
     * id
     * tbl_order_deal.id
     */
    public String getId(){
        return id;
    }

    /**
     * id
     * tbl_order_deal.id
     */
    public void setId(String id){
        this.id=id;
    }

    /**
     * 订单号
     * tbl_order_deal.order_no
     */
    public String getOrderNo(){
        return orderNo;
    }

    /**
     * 订单号
     * tbl_order_deal.order_no
     */
    public void setOrderNo(String orderNo){
        this.orderNo=orderNo;
    }

    /**
     * 商品描述
     * tbl_order_deal.body
     */
    public String getBody(){
        return body;
    }

    /**
     * 商品描述
     * tbl_order_deal.body
     */
    public void setBody(String body){
        this.body=body;
    }

    /**
     * 商品详情
     * tbl_order_deal.detail
     */
    public String getDetail(){
        return detail;
    }

    /**
     * 商品详情
     * tbl_order_deal.detail
     */
    public void setDetail(String detail){
        this.detail=detail;
    }

    /**
     * 名额数量
     * tbl_order_deal.number
     */
    public String getNumber(){
        return number;
    }

    /**
     * 名额数量
     * tbl_order_deal.number
     */
    public void setNumber(String number){
        this.number=number;
    }

    /**
     * 名额单价
     * tbl_order_deal.price
     */
    public String getPrice(){
        return price;
    }

    /**
     * 名额单价
     * tbl_order_deal.price
     */
    public void setPrice(String price){
        this.price=price;
    }

    /**
     * 总金额
     * tbl_order_deal.total_fee
     */
    public String getTotalFee(){
        return totalFee;
    }

    /**
     * 总金额
     * tbl_order_deal.total_fee
     */
    public void setTotalFee(String totalFee){
        this.totalFee=totalFee;
    }

    /**
     * 用户IP地址
     * tbl_order_deal.spbill_create_ip
     */
    public String getSpbillCreateIp(){
        return spbillCreateIp;
    }

    /**
     * 用户IP地址
     * tbl_order_deal.spbill_create_ip
     */
    public void setSpbillCreateIp(String spbillCreateIp){
        this.spbillCreateIp=spbillCreateIp;
    }

    /**
     * 交易起始时间
     * tbl_order_deal.pay_start_time
     */
    public String getPayStartTime(){
        return payStartTime;
    }

    /**
     * 交易起始时间
     * tbl_order_deal.pay_start_time
     */
    public void setPayStartTime(String payStartTime){
        this.payStartTime=payStartTime;
    }

    /**
     * 交易结束时间
     * tbl_order_deal.pay_end_time
     */
    public String getPayEndTime(){
        return payEndTime;
    }

    /**
     * 交易结束时间
     * tbl_order_deal.pay_end_time
     */
    public void setPayEndTime(String payEndTime){
        this.payEndTime=payEndTime;
    }

    /**
     * goods_tag
     * tbl_order_deal.goods_tag
     */
    public String getGoodsTag(){
        return goodsTag;
    }

    /**
     * goods_tag
     * tbl_order_deal.goods_tag
     */
    public void setGoodsTag(String goodsTag){
        this.goodsTag=goodsTag;
    }

    /**
     * 购买用户ID
     * tbl_order_deal.openid
     */
    public String getOpenid(){
        return openid;
    }

    /**
     * 购买用户ID
     * tbl_order_deal.openid
     */
    public void setOpenid(String openid){
        this.openid=openid;
    }

    /**
     * 支付完成时间
     * tbl_order_deal.pay_time
     */
    public String getPayTime(){
        return payTime;
    }

    /**
     * 支付完成时间
     * tbl_order_deal.pay_time
     */
    public void setPayTime(String payTime){
        this.payTime=payTime;
    }

    /**
     * 支付状态
     * tbl_order_deal.pay_status
     */
    public String getPayStatus(){
        return payStatus;
    }

    /**
     * 支付状态
     * tbl_order_deal.pay_status
     */
    public void setPayStatus(String payStatus){
        this.payStatus=payStatus;
    }

    /**
     * 机器ID
     * tbl_order_deal.maniche_id
     */
    public String getManicheId(){
        return manicheId;
    }

    /**
     * 机器ID
     * tbl_order_deal.maniche_id
     */
    public void setManicheId(String manicheId){
        this.manicheId=manicheId;
    }

    /**
     * 区域ID
     * tbl_order_deal.area_id
     */
    public String getAreaId(){
        return areaId;
    }

    /**
     * 区域ID
     * tbl_order_deal.area_id
     */
    public void setAreaId(String areaId){
        this.areaId=areaId;
    }

    /**
     * 大学ID
     * tbl_order_deal.university_id
     */
    public String getUniversityId(){
        return universityId;
    }

    /**
     * 大学ID
     * tbl_order_deal.university_id
     */
    public void setUniversityId(String universityId){
        this.universityId=universityId;
    }

    /**
     * 创建时间
     * tbl_order_deal.create_time
     */
    public String getCreateTime(){
        return createTime;
    }

    /**
     * 创建时间
     * tbl_order_deal.create_time
     */
    public void setCreateTime(String createTime){
        this.createTime=createTime;
    }

    /**
     * 创建人
     * tbl_order_deal.create_user
     */
    public String getCreateUser(){
        return createUser;
    }

    /**
     * 创建人
     * tbl_order_deal.create_user
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

