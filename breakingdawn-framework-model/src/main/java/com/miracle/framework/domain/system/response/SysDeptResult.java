package com.miracle.framework.domain.system.response;

import com.miracle.framework.domain.system.SysDept;
import com.miracle.framework.model.response.ResponseResult;
import com.miracle.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class SysDeptResult extends ResponseResult implements Serializable {
    private SysDept sysDept;

    public SysDeptResult(ResultCode resultCode, SysDept sysDept) {
        super(resultCode);
        this.sysDept = sysDept;
    }
}
