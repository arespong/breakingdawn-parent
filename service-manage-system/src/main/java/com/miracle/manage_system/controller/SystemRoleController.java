package com.miracle.manage_system.controller;

import com.github.pagehelper.PageInfo;
import com.miracle.api.manage_system.SystemRoleControllerApi;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysRoleRequest;
import com.miracle.framework.domain.system.response.SysRoleResult;
import com.miracle.framework.model.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/system/role")
public class SystemRoleController implements SystemRoleControllerApi {
    @Override
    @PostMapping
    public SysRoleResult add(SysRole sysRole) {
        return null;
    }

    @Override
    @DeleteMapping
    public ResponseResult remove(Long[] sysRoleIds) {
        return null;
    }

    @Override
    @PutMapping
    public SysRoleResult edit( SysRole sysRole) {
        return null;
    }

    @Override
    @GetMapping("/selectOne/{sysRoleId}")
    public SysRoleResult selectOne(@PathVariable Long sysRoleId) {
        return null;
    }

    @Override
    @PostMapping("/list/{pageNum}/{size}")
    public PageInfo<SysRole> list(@PathVariable int pageNum,@PathVariable int size, QuerySysRoleRequest querySysRoleRequest) {
        return null;
    }
}
