package com.miracle.manage_system.service;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysMenu;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysMenuRequest;
import com.miracle.framework.domain.system.response.SysMenuResult;
import com.miracle.framework.model.response.ResponseResult;

public interface ISystemMenuService {
    SysMenuResult add(SysMenu sysMenu);

    ResponseResult remove(Long[] sysMenuIds);

    SysMenuResult edit(SysMenu sysMenu);

    SysMenuResult selectOne(Long sysMenuId);
    
    PageInfo<SysRole> list(int pageNum, int size, QuerySysMenuRequest querySysMenuRequest);
}
