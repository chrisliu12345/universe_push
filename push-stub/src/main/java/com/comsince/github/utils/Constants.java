package com.comsince.github.utils;

/**
 * @author comsicne
 *         Copyright (c) [2019] [Meizu.inc]
 * @Time 19-3-8 上午9:22
 **/
public class Constants {
    /**
     * 当前在线人数
     * */

    public static final String REDIS_PREFIX = "push.";

    public static final String ONLINE_NUM = "push.online_num";

    public static final String ONLINE_STATUS = "push.online_status";

    public static final String UID_TOKEN_MAP = "push.uid-token";

    public static final String REDISCLIENT_NAME = "redissonClient";

    public static final String PUSHSERVER_CONFIGURATION = "pushServerConfiguration";

    public static final int MAX_MESSAGE_QUEUE = 1024; // number of messages
    public static final int MAX_CHATROOM_MESSAGE_QUEUE = 256; // number of chatroom messages
    public static final String ATTR_USERNAME = "username";
    public static final String ATTR_CLIENTID = "ClientID";
}
