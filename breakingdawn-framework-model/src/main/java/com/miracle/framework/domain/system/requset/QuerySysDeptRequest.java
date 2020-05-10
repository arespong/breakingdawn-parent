package com.miracle.framework.domain.system.requset;

import lombok.Data;

@Data
public class QuerySysDeptRequest {
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;
}
