package com.miracle.framework.domain.system.response;

import com.miracle.framework.domain.system.SysMenu;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class SysMenuResult extends ResponseResult implements Serializable {
    private SysMenu sysMenu;

    public SysMenuResult(ResultCode resultCode, SysMenu sysMenu) {
        super(resultCode);
        this.sysMenu = sysMenu;
    }
}
