package com.miracle.manage_system.service;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysUser;
import com.miracle.framework.domain.system.requset.QuerySysUserRequest;
import com.miracle.framework.domain.system.response.SysUserResult;
import com.miracle.framework.model.response.ResponseResult;

public interface ISysUserService {
    SysUserResult add(SysUser sysUser);

    ResponseResult remove(Long[] sysUserIds);

    SysUserResult edit(Long sysUserId);

    SysUserResult selectOne(Long sysUserId);

    PageInfo<SysUser> list(int pageNum, int size, QuerySysUserRequest querySysUserRequest);

}
