package com.miracle.framework.exception;

import com.miracle.framework.model.response.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomException extends RuntimeException {
    ResultCode resultCode;
}
