package com.miracle.framework.domain.system.ext;

import com.miracle.framework.domain.system.SysDept;
import com.miracle.framework.domain.system.SysPost;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.SysUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysUserExt extends SysUser {
    private SysDept sysDept;
    private SysPost sysPost;
    private List<SysRole> sysRoles;
}
