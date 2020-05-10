package com.miracle.manage_system.service;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysRoleRequest;
import com.miracle.framework.domain.system.response.SysRoleResult;
import com.miracle.framework.model.response.ResponseResult;


public interface ISystemRoleService {

    SysRoleResult add(SysRole sysRole);

    ResponseResult remove(Long[] sysRoleIds);

    SysRoleResult edit( SysRole sysRole);

    SysRoleResult selectOne(Long sysRoleId);

    PageInfo<SysRole> list(int pageNum, int size, QuerySysRoleRequest querySysRoleRequest);

}
