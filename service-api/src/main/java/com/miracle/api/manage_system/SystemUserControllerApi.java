package com.miracle.api.manage_system;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysUser;
import com.miracle.framework.domain.system.requset.QuerySysUserRequest;
import com.miracle.framework.domain.system.response.SysUserResult;
import com.miracle.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户管理", tags = "用户管理接口")
public interface SystemUserControllerApi {

    @ApiOperation("新增用户")
    SysUserResult add(SysUser sysUser);

    @ApiOperation("删除用户")
    ResponseResult remove(Long[] sysUserIds);

    @ApiOperation("编辑用户")
    SysUserResult edit(Long sysUserId);

    @ApiOperation("用户详情")
    SysUserResult selectOne(Long sysUserId);

    @ApiOperation("条件分页查询所有用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "querySysUserRequest", value = "查询条件", required = false),
    })
    PageInfo<SysUser> list(int pageNum, int size, QuerySysUserRequest querySysUserRequest);

}
