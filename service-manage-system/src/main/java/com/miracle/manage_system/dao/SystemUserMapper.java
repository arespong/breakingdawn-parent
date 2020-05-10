package com.miracle.manage_system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.miracle.framework.domain.system.SysUser;
import com.miracle.framework.domain.system.ext.SysUserExt;

public interface SystemUserMapper extends BaseMapper<SysUser> {
    SysUserExt getSysUserExt(String loginName);
    SysUser echo();
}
