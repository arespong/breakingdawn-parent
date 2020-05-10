package com.miracle.api.auth;

import com.miracle.framework.domain.system.requset.LoginRequest;
import com.miracle.framework.domain.system.response.LoginResult;
import com.miracle.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户认证")
public interface AuthControllerApi {
    @ApiOperation("登录")
    public LoginResult login(LoginRequest loginRequest);

    @ApiOperation("退出")
    public ResponseResult logout();

}
