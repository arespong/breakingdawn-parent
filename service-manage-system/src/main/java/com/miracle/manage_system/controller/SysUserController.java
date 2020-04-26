package com.miracle.manage_system.controller;

import com.github.pagehelper.PageInfo;
import com.miracle.api.manage_system.SystemUserControllerApi;

import com.miracle.framework.domain.system.SysUser;
import com.miracle.framework.domain.system.requset.QuerySysUserRequest;
import com.miracle.framework.domain.system.response.SysUserResult;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/system/user")
public class SysUserController implements SystemUserControllerApi {

    @Autowired
    private ISysUserService sysUserService;

    @Override
    @PostMapping
    public SysUserResult add(SysUser sysUser) {
        return sysUserService.add(sysUser);
    }

    @Override
    @DeleteMapping("/sysUserIds")
    public ResponseResult remove(@PathVariable Long[] sysUserIds) {
        return sysUserService.remove(sysUserIds);
    }

    @Override
    @PutMapping("/sysUserId")
    public SysUserResult edit(@PathVariable Long sysUserId) {
        return sysUserService.edit(sysUserId);
    }

    @Override
    @GetMapping("/sysUserId")
    public SysUserResult selectOne(@PathVariable Long sysUserId) {
        return sysUserService.selectOne(sysUserId);
    }

    @Override
    @PostMapping("/list/pageNum/size")
    public PageInfo<SysUser> list(@PathVariable int pageNum,@PathVariable int size, QuerySysUserRequest querySysUserRequest) {
        return sysUserService.list(pageNum, size, querySysUserRequest);
    }
}
