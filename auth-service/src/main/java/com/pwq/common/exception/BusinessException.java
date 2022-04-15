package com.pwq.common.exception;

import com.pwq.common.constant.enums.ResponseCodeEnum;
import lombok.Data;

@Data
public class BusinessException extends RuntimeException {
    private ResponseCodeEnum responseCodeEnum;
}