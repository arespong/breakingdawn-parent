package com.miracle.manage_system.service.impl;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysDept;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysDeptRequest;
import com.miracle.framework.domain.system.response.SysDeptResult;
import com.miracle.framework.model.response.CommonCode;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.dao.SystemDeptMapper;
import com.miracle.manage_system.service.ISystemDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SystemDeptServiceImpl implements ISystemDeptService {
    @Autowired
    private SystemDeptMapper systemDeptMapper;

    @Override
    public SysDeptResult add(SysDept sysDept) {
        systemDeptMapper.insert(sysDept);
        return new SysDeptResult(CommonCode.SUCCESS, sysDept);
    }

    @Override
    public ResponseResult remove(Long[] sysDeptIds) {
        systemDeptMapper.deleteBatchIds(Arrays.asList(sysDeptIds));
        return ResponseResult.SUCCESS();
    }

    @Override
    public SysDeptResult edit(SysDept sysDept) {
        systemDeptMapper.updateById(sysDept);
        return new SysDeptResult(CommonCode.SUCCESS, sysDept);
    }

    @Override
    public SysDeptResult selectOne(Long sysDeptId) {
        SysDept sysDept = systemDeptMapper.selectById(sysDeptId);
        return new SysDeptResult(CommonCode.SUCCESS, sysDept);
    }

    @Override
    public PageInfo<SysRole> list(int pageNum, int size, QuerySysDeptRequest querySysDeptRequest) {
        return null;
    }
}
