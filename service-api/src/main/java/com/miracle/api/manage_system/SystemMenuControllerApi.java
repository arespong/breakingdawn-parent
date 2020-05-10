package com.miracle.api.manage_system;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysMenu;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysMenuRequest;
import com.miracle.framework.domain.system.response.SysMenuResult;
import com.miracle.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "菜单管理", tags = "菜单管理接口")
public interface SystemMenuControllerApi {

    @ApiOperation("新增菜单")
    SysMenuResult add(SysMenu sysMenu);

    @ApiOperation("删除菜单")
    ResponseResult remove(Long[] sysMenuIds);

    @ApiOperation("编辑菜单")
    SysMenuResult edit(SysMenu sysMenu);

    @ApiOperation("菜单详情")
    SysMenuResult selectOne(Long sysMenuId);

    @ApiOperation("条件分页查询所有菜单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "querySysMenuRequest", value = "查询条件", required = false),
    })
    PageInfo<SysRole> list(int pageNum, int size, QuerySysMenuRequest querySysMenuRequest);

}
