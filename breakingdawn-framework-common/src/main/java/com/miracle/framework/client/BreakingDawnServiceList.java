package com.miracle.framework.client;

public enum BreakingDawnServiceList {
    BREAKINGDAWN_GOVERN_CENTER(9120, "breakingdawn-govern-center", "微服务注册中心"),
    BREAKINGDAWN_GOVERN_GATEWAY(9305, "breakingdawn-govern-gateway", "微服务网关"),
    SERVICE_MANAGEMENT_SYSTEM(5000, "service-manage-system", "系统管理"),
    SERVICE_UCENTER(5010, "service-ucenter", "用户中心"),
    SERVICE_UCENTER_AUTH(5020, "service-ucenter-auth", "认证服务"),
    SERVICE_MANAGE_MEDIA(6000, "service-manage-media", "媒资管理");


    String serverName;
    int port;
    String desc;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    BreakingDawnServiceList(int port, String serverName, String desc) {
        this.port = port;
        this.serverName = serverName;
        this.desc = desc;
    }
}
