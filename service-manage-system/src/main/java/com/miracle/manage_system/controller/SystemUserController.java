package com.miracle.manage_system.controller;

import com.github.pagehelper.PageInfo;
import com.miracle.api.manage_system.SystemUserControllerApi;

import com.miracle.framework.domain.system.SysUser;
import com.miracle.framework.domain.system.ext.SysUserExt;
import com.miracle.framework.domain.system.requset.QuerySysUserRequest;
import com.miracle.framework.domain.system.response.SysUserResult;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.service.ISystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/system/user")
public class SystemUserController implements SystemUserControllerApi {

    @Autowired
    private ISystemUserService systemUserService;

    @Override
    @PostMapping
    public SysUserResult add(SysUser sysUser) {
        return systemUserService.add(sysUser);
    }

    @Override
    @DeleteMapping
    public ResponseResult remove(Long[] sysUserIds) {
        return systemUserService.remove(sysUserIds);
    }

    @Override
    @PutMapping
    public SysUserResult edit(SysUser sysUser) {
        return systemUserService.edit(sysUser);
    }

    @Override
    @GetMapping("/selectOne/{sysUserId}")
    public SysUserResult selectOne(@PathVariable Long sysUserId) {
        return systemUserService.selectOne(sysUserId);
    }

    @Override
    @PostMapping("/list/{pageNum}/{size}")
    public PageInfo<SysUser> list(@PathVariable Integer pageNum, @PathVariable Integer size, QuerySysUserRequest querySysUserRequest) {
        return systemUserService.list(pageNum, size, querySysUserRequest);
    }

    @Override
    @GetMapping
    public SysUserExt getSysUserExt(@RequestParam String loginName) {
        return systemUserService.getSysUserExt(loginName);
    }

    @GetMapping("/echo")
    String getEcho(int a) {
        return a + "xxx";
    }

    @PostMapping("/echo")
    String getEcho1(int a) {
        return a + "***";
    }

    @PostMapping("/echo1")
    List getEcho2(int a) {
        return Arrays.asList("a", "b", "c");
    }

    @PostMapping("/echo2")
    Map getEcho3(int a) {
        Map map = new HashMap();
        map.put("name", "ponter");
        map.put("age", 28);
        map.put("addr", "四川遂宁");
        map.put("school", "四川电力职业技术学院");
        return map;
    }
}
