package com.miracle.manage_system.controller;

import com.github.pagehelper.PageInfo;
import com.miracle.api.manage_system.SystemPostControllerApi;
import com.miracle.framework.domain.system.SysPost;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysPostRequest;
import com.miracle.framework.domain.system.response.SysPostResult;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.service.ISystemPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/system/post")
public class SystemPostController implements SystemPostControllerApi {
    @Autowired
    private ISystemPostService systemPostService;

    @Override
    @PostMapping
    public SysPostResult add(SysPost sysPost) {
        return systemPostService.add(sysPost);
    }

    @Override
    @DeleteMapping
    public ResponseResult remove(Long[] sysPostIds) {
        return systemPostService.remove(sysPostIds);
    }

    @Override
    @PutMapping
    public SysPostResult edit(SysPost sysPost) {
        return null;
    }

    @Override
    @GetMapping("/selectOne/{sysPostId}")
    public SysPostResult selectOne(@PathVariable Long sysPostId) {
        return systemPostService.selectOne(sysPostId);
    }

    @Override
    @PostMapping("/list/{pageNum}/{size}")
    public PageInfo<SysRole> list(@PathVariable int pageNum, @PathVariable int size, QuerySysPostRequest querySysPostRequest) {
        return systemPostService.list(pageNum,size,querySysPostRequest);
    }
}
