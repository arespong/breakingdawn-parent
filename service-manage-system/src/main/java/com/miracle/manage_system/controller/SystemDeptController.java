package com.miracle.manage_system.controller;

import com.github.pagehelper.PageInfo;
import com.miracle.api.manage_system.SystemDeptControllerApi;
import com.miracle.framework.domain.system.SysDept;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysDeptRequest;
import com.miracle.framework.domain.system.response.SysDeptResult;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.service.ISystemDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/system/dept")
public class SystemDeptController implements SystemDeptControllerApi {
    @Autowired
    private ISystemDeptService systemDeptService;

    @Override
    @PostMapping
    public SysDeptResult add(SysDept sysDept) {
        return systemDeptService.add(sysDept);
    }

    @Override
    @DeleteMapping
    public ResponseResult remove(Long[] sysDeptIds) {
        return systemDeptService.remove(sysDeptIds);
    }

    @Override
    @PutMapping
    public SysDeptResult edit(SysDept sysDept) {
        return systemDeptService.edit(sysDept);
    }

    @Override
    @GetMapping("/selectOne/{sysDeptId}")
    public SysDeptResult selectOne(@PathVariable Long sysDeptId) {
        return systemDeptService.selectOne(sysDeptId);
    }

    @Override
    @PostMapping("/list/{pageNum}/{size}")
    public PageInfo<SysRole> list(@PathVariable int pageNum, @PathVariable int size, QuerySysDeptRequest querySysDeptRequest) {
        return systemDeptService.list(pageNum,size,querySysDeptRequest);
    }
}
