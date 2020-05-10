package com.miracle.api.manage_system;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysPost;
import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.requset.QuerySysPostRequest;
import com.miracle.framework.domain.system.response.SysPostResult;
import com.miracle.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "岗位管理", tags = "岗位管理接口")
public interface SystemPostControllerApi {

    @ApiOperation("新增岗位")
    SysPostResult add(SysPost sysPost);

    @ApiOperation("删除岗位")
    ResponseResult remove(Long[] sysPostIds);

    @ApiOperation("编辑岗位")
    SysPostResult edit(SysPost sysPost);

    @ApiOperation("岗位详情")
    SysPostResult selectOne(Long sysPostId);

    @ApiOperation("条件分页查询所有岗位")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "querySysPostRequest", value = "查询条件", required = false),
    })
    PageInfo<SysRole> list(int pageNum, int size, QuerySysPostRequest querySysPostRequest);

}
