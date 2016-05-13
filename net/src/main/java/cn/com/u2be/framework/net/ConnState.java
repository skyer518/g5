package cn.com.u2be.framework.net;

/**
 * 连接状态
 */
public enum ConnState {
    /**
     * 参数错误
     */
    ParamError,
    /**
     * 没有连接上WIFI
     */
    NoWifi,
    /**
     * 没有连接上LED（有WIFI）
     */
    DisConnected,
    /**
     * 连接成功
     */
    Connected
}
