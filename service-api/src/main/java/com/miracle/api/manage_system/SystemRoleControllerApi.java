package com.miracle.api.manage_system;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysRoleRequest;
import com.miracle.framework.domain.system.response.SysRoleResult;
import com.miracle.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "角色管理", tags = "角色管理接口")
public interface SystemRoleControllerApi {

    @ApiOperation("新增角色")
    SysRoleResult add(SysRole sysRole);

    @ApiOperation("删除角色")
    ResponseResult remove(Long[] sysRoleIds);

    @ApiOperation("编辑角色")
    SysRoleResult edit(SysRole sysRole);

    @ApiOperation("角色详情")
    SysRoleResult selectOne(Long sysRoleId);

    @ApiOperation("条件分页查询所有角色")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "querySysRoleRequest", value = "查询条件", required = false),
    })
    PageInfo<SysRole> list(int pageNum, int size, QuerySysRoleRequest querySysRoleRequest);

}
