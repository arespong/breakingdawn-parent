package com.miracle.ucenter_auth.controller;

import com.miracle.api.auth.AuthControllerApi;
import com.miracle.framework.domain.ucenter.request.LoginRequest;
import com.miracle.framework.domain.ucenter.response.LoginResult;
import com.miracle.framework.model.response.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController implements AuthControllerApi {
    @Override
    @PostMapping("/userlogin")
    public LoginResult login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    @PostMapping("/userlogout")
    public ResponseResult logout() {
        return null;
    }
}
