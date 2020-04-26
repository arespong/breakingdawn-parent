package com.miracle.manage_system.dao;

import com.miracle.framework.domain.system.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper  {
    void insert(SysUser sysUser);
    SysUser selectOne(Long userId);
}
