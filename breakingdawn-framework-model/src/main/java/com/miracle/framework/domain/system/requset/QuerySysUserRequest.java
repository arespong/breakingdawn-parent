package com.miracle.framework.domain.system.requset;

import lombok.Data;

import java.time.LocalDate;

@Data
public class QuerySysUserRequest {
    /**
     * 部门ID
     */
    private String  deptName;
    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phonenumber;


    /**
     * 帐号状态（0正常 1停用）
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    /**
     * 创建的开始时间
     */
    private LocalDate startTime;

    /**
     * 创建的结束时间
     */
    private LocalDate endTime;
}
