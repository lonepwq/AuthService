package com.pwq.common.exception;

import com.pwq.common.constant.enums.CommonResponseCodeEnum;
import com.pwq.common.constant.enums.ResponseCodeEnum;
import com.pwq.model.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)//返回500状态码
    public RestResponse processException(HttpServletRequest request, HttpServletResponse response, Exception e) {
        //异常处理
        //系统自定义异常取出errCode和errMessage
        if (e instanceof BusinessException) {
            //控制台打印
            log.info(e.getMessage(), e);
            //解析系统自定义异常
            BusinessException businessException = (BusinessException) e;
            ResponseCodeEnum responseCodeEnum = businessException.getResponseCodeEnum();
            //错误代码
            int code = responseCodeEnum.getCode();
            //错误信息
            String message = responseCodeEnum.getMessage();
            return new RestResponse(code, message);
        }
        //非自定义异常类型，定义为99999系统未知错误
        log.error("系统异常:", e);
        return new RestResponse(CommonResponseCodeEnum.UNKNOWN.getCode(), CommonResponseCodeEnum.UNKNOWN.getMessage());
    }
}
