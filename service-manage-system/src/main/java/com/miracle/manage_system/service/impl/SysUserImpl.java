package com.miracle.manage_system.service.impl;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysUser;
import com.miracle.framework.domain.system.requset.QuerySysUserRequest;
import com.miracle.framework.domain.system.response.SysUserResult;
import com.miracle.framework.model.response.CommonCode;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.dao.SysUserMapper;
import com.miracle.manage_system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SysUserImpl implements ISysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserResult add(SysUser sysUser) {
        sysUser.setCreateBy("AresPong");//TODO
        sysUser.setCreateTime(LocalDateTime.now());
        sysUser.setUpdateTime(LocalDateTime.now());
        sysUser.setUpdateBy("AresPong");//TODO
        sysUserMapper.insert(sysUser);
        return selectOne(sysUser.getUserId());
    }

    @Override
    public ResponseResult remove(Long[] sysUserIds) {
        return null;
    }

    @Override
    public SysUserResult edit(Long sysUserId) {
        return null;
    }

    @Override
    public SysUserResult selectOne(Long sysUserId) {
        SysUserResult sysUserResult = new SysUserResult(CommonCode.SUCCESS, sysUserMapper.selectOne(sysUserId));
        return sysUserResult;
    }

    @Override
    public PageInfo<SysUser> list(int pageNum, int size, QuerySysUserRequest querySysUserRequest) {
        return null;
    }
}
