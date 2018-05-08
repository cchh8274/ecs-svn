/**
 * RTC Generator 
 */
package cn.kanmars.entity;


/**
 * 会话表
 * tbl_seesion_info
 */
public class TblSeesionInfo implements java.io.Serializable{
    /**
     * 主见(会话id)
     * tbl_seesion_info.session_id
     */
    private String sessionId;

    /**
     * 用户id唯一
     * tbl_seesion_info.open_id
     */
    private String openId;

    /**
     * 服务人员id
     * tbl_seesion_info.server_id
     */
    private String serverId;

    /**
     * 010接待  020未接待
     * tbl_seesion_info.status
     */
    private String status;

    /**
     * close关闭会话状态normal为正在会话
     * tbl_seesion_info.session_status
     */
    private String sessionStatus;


    public TblSeesionInfo(){super();}
    public TblSeesionInfo(String sessionId,String openId,String serverId,String status,String sessionStatus) {
        this.sessionId = sessionId;
        this.openId = openId;
        this.serverId = serverId;
        this.status = status;
        this.sessionStatus = sessionStatus;
    }
    /**
     * 主见(会话id)
     * tbl_seesion_info.session_id
     */
    public String getSessionId(){
        return sessionId;
    }

    /**
     * 主见(会话id)
     * tbl_seesion_info.session_id
     */
    public void setSessionId(String sessionId){
        this.sessionId=sessionId;
    }

    /**
     * 用户id唯一
     * tbl_seesion_info.open_id
     */
    public String getOpenId(){
        return openId;
    }

    /**
     * 用户id唯一
     * tbl_seesion_info.open_id
     */
    public void setOpenId(String openId){
        this.openId=openId;
    }

    /**
     * 服务人员id
     * tbl_seesion_info.server_id
     */
    public String getServerId(){
        return serverId;
    }

    /**
     * 服务人员id
     * tbl_seesion_info.server_id
     */
    public void setServerId(String serverId){
        this.serverId=serverId;
    }

    /**
     * 010接待  020未接待
     * tbl_seesion_info.status
     */
    public String getStatus(){
        return status;
    }

    /**
     * 010接待  020未接待
     * tbl_seesion_info.status
     */
    public void setStatus(String status){
        this.status=status;
    }

    /**
     * close关闭会话状态normal为正在会话
     * tbl_seesion_info.session_status
     */
    public String getSessionStatus(){
        return sessionStatus;
    }

    /**
     * close关闭会话状态normal为正在会话
     * tbl_seesion_info.session_status
     */
    public void setSessionStatus(String sessionStatus){
        this.sessionStatus=sessionStatus;
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

