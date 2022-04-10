package com.pwq.common.exception;

import com.pwq.common.constant.ErrorCodeEnum;
import lombok.Data;

@Data
public class BusinessException extends RuntimeException {
    private ErrorCodeEnum errorCodeEnum;
}