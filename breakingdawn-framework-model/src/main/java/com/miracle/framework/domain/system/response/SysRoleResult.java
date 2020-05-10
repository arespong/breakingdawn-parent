package com.miracle.framework.domain.system.response;

import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class SysRoleResult extends ResponseResult implements Serializable {
    private SysRole sysRole;

    public SysRoleResult(ResultCode resultCode, SysRole sysRole) {
        super(resultCode);
        this.sysRole = sysRole;
    }
}
