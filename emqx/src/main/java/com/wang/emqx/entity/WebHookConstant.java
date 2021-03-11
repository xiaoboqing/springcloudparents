package com.wang.emqx.entity;

public class WebHookConstant {
    //固定的属性名
    public static final String ACTION = "action";
    public static final String CLINET_ID= "clientid";
    public static final String USERNAME = "username";
    public static final String REASON = "reason";
    public static final String TOPIC = "topic";
    public static final String PAYLOAD = "payload";

    //消息的事件戳
    public static final String TS = "ts";
    //QoS 等级
    public static final String QOS = "qos";
    //消息来源用户名
    public static final String FROM_USERNAME = "from_username";
    //消息clientId
    public static final String FROM_CLIENT_ID = "from_client_id";
    //ACTION
    /**断开连接*/
    public static final String ACTION_DISCONNECTED = "client_disconnected";
    /**成功连接*/
    public static final String ACTION_CONNECTED = "client_connected";
    /**上传数据*/
    public static final String MESSAGE_PUBLISH = "message_publish";
}

