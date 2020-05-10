package com.miracle.framework.client;

import lombok.Data;

public enum BreakingDawnServiceList {
    BREAKINGDAWN_GOVERN_CENTER(9120, "BREAKINGDAWN-GOVERN-CENTER", "微服务注册中心"),
    BREAKINGDAWN_GOVERN_GATEWAY(9305, "BREAKINGDAWN-GOVERN-GATEWAY", "微服务网关"),
    SERVICE_MANAGEMENT_SYSTEM(5000, "SERVICE-MANAGE-SYSTEM", "系统管理"),
    SERVICE_UCENTER(5010, "SERVICE-UCENTER", "用户中心"),
    SERVICE_UCENTER_AUTH(5020, "SERVICE-UCENTER-AUTH", "认证服务"),
    SERVICE_MANAGE_MEDIA(6000, "SERVICE-MANAGE-MEDIA", "媒资管理");

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

    public static final String getServerName(BreakingDawnServiceList breakingDawnServiceList){
        return breakingDawnServiceList.serverName;
    }
    public static final int getPort(BreakingDawnServiceList breakingDawnServiceList){
        return breakingDawnServiceList.port;
    }


    BreakingDawnServiceList(int port, String serverName, String desc) {
        this.port = port;
        this.serverName = serverName;
        this.desc = desc;
    }

}
