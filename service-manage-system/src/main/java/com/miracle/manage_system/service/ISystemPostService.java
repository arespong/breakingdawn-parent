package com.miracle.manage_system.service;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysPost;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysPostRequest;
import com.miracle.framework.domain.system.response.SysPostResult;
import com.miracle.framework.model.response.ResponseResult;

public interface ISystemPostService {
    
    SysPostResult add(SysPost sysPost);

   
    ResponseResult remove(Long[] sysPostIds);


    SysPostResult edit(SysPost sysPost);

 
    SysPostResult selectOne(Long sysPostId);


    PageInfo<SysRole> list(int pageNum, int size, QuerySysPostRequest querySysPostRequest);
}
