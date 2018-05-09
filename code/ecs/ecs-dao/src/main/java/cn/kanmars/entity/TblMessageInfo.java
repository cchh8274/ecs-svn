/**
 * RTC Generator 
 */
package cn.kanmars.entity;


/**
 * 消息表
 * tbl_message_info
 */
public class TblMessageInfo implements java.io.Serializable{
    /**
     * 用户ID
     * tbl_message_info.opend_id
     */
    private String opendId;

    /**
     * 消息内容
     * tbl_message_info.message
     */
    private String message;

    /**
     * 聊天时间
     * tbl_message_info.message_time
     */
    private String messageTime;

    /**
     * 会话ID
     * tbl_message_info.session_id
     */
    private String sessionId;

    /**
     * 消息类型
     * tbl_message_info.state_zt
     */
    private String stateZt;

    /**
     * 
     * tbl_message_info.server_id
     */
    private String serverId;


    public TblMessageInfo(){super();}
    public TblMessageInfo(String opendId,String message,String messageTime,String sessionId,String stateZt,String serverId) {
        this.opendId = opendId;
        this.message = message;
        this.messageTime = messageTime;
        this.sessionId = sessionId;
        this.stateZt = stateZt;
        this.serverId = serverId;
    }
    /**
     * 用户ID
     * tbl_message_info.opend_id
     */
    public String getOpendId(){
        return opendId;
    }

    /**
     * 用户ID
     * tbl_message_info.opend_id
     */
    public void setOpendId(String opendId){
        this.opendId=opendId;
    }

    /**
     * 消息内容
     * tbl_message_info.message
     */
    public String getMessage(){
        return message;
    }

    /**
     * 消息内容
     * tbl_message_info.message
     */
    public void setMessage(String message){
        this.message=message;
    }

    /**
     * 聊天时间
     * tbl_message_info.message_time
     */
    public String getMessageTime(){
        return messageTime;
    }

    /**
     * 聊天时间
     * tbl_message_info.message_time
     */
    public void setMessageTime(String messageTime){
        this.messageTime=messageTime;
    }

    /**
     * 会话ID
     * tbl_message_info.session_id
     */
    public String getSessionId(){
        return sessionId;
    }

    /**
     * 会话ID
     * tbl_message_info.session_id
     */
    public void setSessionId(String sessionId){
        this.sessionId=sessionId;
    }

    /**
     * 消息类型
     * tbl_message_info.state_zt
     */
    public String getStateZt(){
        return stateZt;
    }

    /**
     * 消息类型
     * tbl_message_info.state_zt
     */
    public void setStateZt(String stateZt){
        this.stateZt=stateZt;
    }

    /**
     * 
     * tbl_message_info.server_id
     */
    public String getServerId(){
        return serverId;
    }

    /**
     * 
     * tbl_message_info.server_id
     */
    public void setServerId(String serverId){
        this.serverId=serverId;
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

