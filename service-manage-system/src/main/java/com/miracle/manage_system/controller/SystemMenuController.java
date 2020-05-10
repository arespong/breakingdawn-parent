package com.miracle.manage_system.controller;

import com.github.pagehelper.PageInfo;
import com.miracle.api.manage_system.SystemMenuControllerApi;
import com.miracle.framework.domain.system.SysMenu;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysMenuRequest;
import com.miracle.framework.domain.system.response.SysMenuResult;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.service.ISystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/system/menu")
public class SystemMenuController implements SystemMenuControllerApi {
    @Autowired
    private ISystemMenuService systemMenuService;

    @Override
    @PostMapping
    public SysMenuResult add(SysMenu sysMenu) {
        return systemMenuService.add(sysMenu);
    }

    @Override
    @DeleteMapping
    public ResponseResult remove(Long[] sysMenuIds) {
        return systemMenuService.remove(sysMenuIds);
    }

    @Override
    @PutMapping
    public SysMenuResult edit(SysMenu sysMenu) {
        return systemMenuService.edit(sysMenu);
    }

    @Override
    @GetMapping("/selectOne/{sysMenuId}")
    public SysMenuResult selectOne(@PathVariable Long sysMenuId) {
        return systemMenuService.selectOne(sysMenuId);
    }

    @Override
    @PostMapping("/list/{pageNum}/{size}")
    public PageInfo<SysRole> list(@PathVariable int pageNum, @PathVariable int size, QuerySysMenuRequest querySysMenuRequest) {
        return systemMenuService.list(pageNum,size,querySysMenuRequest);
    }
}
