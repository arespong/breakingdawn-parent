package com.miracle.manage_system.service.impl;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysMenu;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysMenuRequest;
import com.miracle.framework.domain.system.response.SysMenuResult;
import com.miracle.framework.model.response.CommonCode;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.dao.SystemMenuMapper;
import com.miracle.manage_system.service.ISystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SystemMenuServiceImpl implements ISystemMenuService {
    @Autowired
    private SystemMenuMapper systemMenuMapper;

    @Override
    public SysMenuResult add(SysMenu sysMenu) {
        systemMenuMapper.insert(sysMenu);
        return new SysMenuResult(CommonCode.SUCCESS, sysMenu);
    }

    @Override
    public ResponseResult remove(Long[] sysMenuIds) {
        systemMenuMapper.deleteBatchIds(Arrays.asList(sysMenuIds));
        return ResponseResult.SUCCESS();
    }

    @Override
    public SysMenuResult edit(SysMenu sysMenu) {
        systemMenuMapper.updateById(sysMenu);
        return new SysMenuResult(CommonCode.SUCCESS, sysMenu);
    }

    @Override
    public SysMenuResult selectOne(Long sysMenuId) {
        SysMenu sysMenu = systemMenuMapper.selectById(sysMenuId);
        return new SysMenuResult(CommonCode.SUCCESS, sysMenu);
    }

    @Override
    public PageInfo<SysRole> list(int pageNum, int size, QuerySysMenuRequest querySysMenuRequest) {
        return null;
    }
}
