package com.miracle.manage_system.service;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysDept;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysDeptRequest;
import com.miracle.framework.domain.system.response.SysDeptResult;
import com.miracle.framework.model.response.ResponseResult;

public interface ISystemDeptService {
    SysDeptResult add(SysDept sysDept);

    ResponseResult remove(Long[] sysDeptIds);

    SysDeptResult edit(SysDept sysDept);

    SysDeptResult selectOne(Long sysDeptId);

    PageInfo<SysRole> list(int pageNum, int size, QuerySysDeptRequest querySysDeptRequest);
}
