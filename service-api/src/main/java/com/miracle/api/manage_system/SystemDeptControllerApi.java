package com.miracle.api.manage_system;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysDept;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysDeptRequest;
import com.miracle.framework.domain.system.response.SysDeptResult;
import com.miracle.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "部门管理", tags = "部门管理接口")
public interface SystemDeptControllerApi {
    @ApiOperation("新增部门")
    SysDeptResult add(SysDept sysDept);

    @ApiOperation("删除部门")
    ResponseResult remove(Long[] sysDeptIds);

    @ApiOperation("编辑部门")
    SysDeptResult edit(SysDept sysDept);

    @ApiOperation("部门详情")
    SysDeptResult selectOne(Long sysDeptId);

    @ApiOperation("条件分页查询所有部门")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "querySysDeptRequest", value = "查询条件", required = false),
    })
    PageInfo<SysRole> list(int pageNum, int size, QuerySysDeptRequest querySysDeptRequest);

}
