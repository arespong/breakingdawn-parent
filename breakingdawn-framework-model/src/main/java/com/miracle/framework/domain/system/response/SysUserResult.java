package com.miracle.framework.domain.system.response;

import com.miracle.framework.domain.system.SysUser;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.framework.model.response.ResultCode;
import lombok.Data;

@Data
public class SysUserResult extends ResponseResult {
    private SysUser sysUser;

    public SysUserResult(ResultCode resultCode, SysUser sysUser) {
        super(resultCode);
        this.sysUser = sysUser;
    }
}
