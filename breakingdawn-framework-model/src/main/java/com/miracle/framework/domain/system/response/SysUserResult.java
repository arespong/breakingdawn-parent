package com.miracle.framework.domain.system.response;

import com.miracle.framework.domain.system.SysUser;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class SysUserResult extends ResponseResult implements Serializable {
    private SysUser sysUser;

    public SysUserResult(ResultCode resultCode, SysUser sysUser) {
        super(resultCode);
        this.sysUser = sysUser;
    }
}
