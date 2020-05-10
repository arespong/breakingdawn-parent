package com.miracle.manage_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysUser;
import com.miracle.framework.domain.system.ext.SysUserExt;
import com.miracle.framework.domain.system.requset.QuerySysUserRequest;
import com.miracle.framework.domain.system.response.SysUserResult;
import com.miracle.framework.model.response.CommonCode;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.dao.SystemUserMapper;
import com.miracle.manage_system.service.ISystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class SystemUserServiceImpl implements ISystemUserService {
    @Autowired
    private SystemUserMapper systemUserMapper;

    @Override
    public SysUserResult add(SysUser sysUser) {
        //TODO 从SpringSecurity中获取创建人、更新人
        sysUser.setCreateTime(LocalDateTime.now());
        sysUser.setUpdateTime(sysUser.getCreateTime());
        systemUserMapper.insert(sysUser);
        return new SysUserResult(CommonCode.SUCCESS, sysUser);
    }

    @Override
    public ResponseResult remove(Long[] sysUserIds) {
        systemUserMapper.deleteBatchIds(Arrays.asList(sysUserIds));
        return ResponseResult.SUCCESS();
    }

    @Override
    public SysUserResult edit(SysUser sysUser) {
        systemUserMapper.updateById(sysUser);
        return new SysUserResult(CommonCode.SUCCESS, sysUser);
    }

    @Override
    public SysUserResult selectOne(Long sysUserId) {
        SysUser sysUser = systemUserMapper.selectById(sysUserId);
        return new SysUserResult(CommonCode.SUCCESS, sysUser);
    }

    @Override
    public PageInfo<SysUser> list(int pageNum, int size, QuerySysUserRequest querySysUserRequest) {
        PageHelper.startPage(pageNum, size);
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()//TODO
                .eq(SysUser::getDeptId, 103);
        List<SysUser> sysUsers = systemUserMapper.selectList(queryWrapper);
        PageInfo<SysUser> pageInfo = new PageInfo<>(sysUsers);
        return pageInfo;
    }

    @Override
    public SysUserExt getSysUserExt(String loginName) {
        return null;
    }

}
