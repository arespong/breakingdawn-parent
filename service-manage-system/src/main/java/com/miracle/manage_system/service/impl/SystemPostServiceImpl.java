package com.miracle.manage_system.service.impl;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysPost;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysPostRequest;
import com.miracle.framework.domain.system.response.SysPostResult;
import com.miracle.framework.model.response.CommonCode;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.manage_system.dao.SystemPostMapper;
import com.miracle.manage_system.service.ISystemPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SystemPostServiceImpl implements ISystemPostService {
    @Autowired
    private SystemPostMapper systemPostMapper;

    @Override
    public SysPostResult add(SysPost sysPost) {
        systemPostMapper.insert(sysPost);
        return new SysPostResult(CommonCode.SUCCESS, sysPost);
    }

    @Override
    public ResponseResult remove(Long[] sysPostIds) {
        systemPostMapper.deleteBatchIds(Arrays.asList(sysPostIds));
        return ResponseResult.SUCCESS();
    }

    @Override
    public SysPostResult edit(SysPost sysPost) {
        systemPostMapper.updateById(sysPost);
        return new SysPostResult(CommonCode.SUCCESS, sysPost);
    }

    @Override
    public SysPostResult selectOne(Long sysPostId) {
        SysPost sysPost = systemPostMapper.selectById(sysPostId);
        return new SysPostResult(CommonCode.SUCCESS,sysPost);
    }

    @Override
    public PageInfo<SysRole> list(int pageNum, int size, QuerySysPostRequest querySysPostRequest) {
        return null;
    }
}
