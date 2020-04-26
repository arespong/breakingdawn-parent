package com.miracle.framework.domain.system;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.miracle.framework.domain.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName
public class SysRoleDept {
    /**
     * 角色ID
     */
    @TableId
    private Long roleId;

    /**
     * 部门ID
     */
    private Long deptId;
}
