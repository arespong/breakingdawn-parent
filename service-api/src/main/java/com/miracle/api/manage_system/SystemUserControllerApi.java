package com.miracle.api.manage_system;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysUser;
import com.miracle.framework.domain.system.ext.SysUserExt;
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
    SysUserResult edit(SysUser sysUser);

    @ApiOperation("用户详情")
    SysUserResult selectOne(Long sysUserId);

    @ApiOperation("条件分页查询所有用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页码", required = true, paramType = "path", dataType = "Integer"),
            @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "Integer"),
            @ApiImplicitParam(name = "querySysUserRequest", value = "查询条件", required = false),
    })
    PageInfo<SysUser> list(Integer pageNum, Integer size, QuerySysUserRequest querySysUserRequest);

    @ApiOperation(value = "条件分页查询所有用户",tags = "根据用户登录名获取用户的部门、职位、角色")
    SysUserExt getSysUserExt(String loginName);
}
