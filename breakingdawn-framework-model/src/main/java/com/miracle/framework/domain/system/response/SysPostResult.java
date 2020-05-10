package com.miracle.framework.domain.system.response;

import com.miracle.framework.domain.system.SysPost;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class SysPostResult extends ResponseResult implements Serializable {
    private SysPost sysPost;

    public SysPostResult(ResultCode resultCode, SysPost sysPost) {
        super(resultCode);
        this.sysPost = sysPost;
    }
}
