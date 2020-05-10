package com.miracle.framework.domain.system.requset;

import lombok.Data;

import java.time.LocalDate;

@Data
public class QuerySysRoleRequest {

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色备注
     */
    private String remark;

    /**
     * 创建的开始时间
     */
    private LocalDate startTime;

    /**
     * 创建的结束时间
     */
    private LocalDate endTime;
}
