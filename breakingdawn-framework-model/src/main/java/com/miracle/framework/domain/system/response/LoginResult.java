package com.miracle.framework.domain.system.response;

import com.miracle.framework.model.response.ResponseResult;
import com.miracle.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@NoArgsConstructor
public class LoginResult extends ResponseResult {
    private String token;

    public LoginResult(ResultCode resultCode, String token) {
        super(resultCode);
        this.token = token;
    }

}
