package com.miracle.manage_system.service.impl;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysRoleRequest;
import com.miracle.framework.domain.system.response.SysRoleResult;
import com.miracle.framework.model.response.CommonCode;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.dao.SystemRoleMapper;
import com.miracle.manage_system.service.ISystemRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SystemRoleServiceImpl implements ISystemRoleService {
    @Autowired
    private SystemRoleMapper systemRoleMapper;

    @Override
    public SysRoleResult add(SysRole sysRole) {
        systemRoleMapper.insert(sysRole);
        return new SysRoleResult(CommonCode.SUCCESS, sysRole);
    }

    @Override
    public ResponseResult remove(Long[] sysRoleIds) {
        systemRoleMapper.deleteBatchIds(Arrays.asList(sysRoleIds));
        return ResponseResult.SUCCESS();
    }

    @Override
    public SysRoleResult edit(SysRole sysRole) {
        systemRoleMapper.updateById(sysRole);
        return new SysRoleResult(CommonCode.SUCCESS,sysRole);
    }

    @Override
    public SysRoleResult selectOne(Long sysRoleId) {
       SysRole sysRole = systemRoleMapper.selectById(sysRoleId);
        return new SysRoleResult(CommonCode.SUCCESS,sysRole);
    }

    @Override
    public PageInfo<SysRole> list(int pageNum, int size, QuerySysRoleRequest querySysRoleRequest) {
        return null;
    }
}
