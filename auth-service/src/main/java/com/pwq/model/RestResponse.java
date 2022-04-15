package com.pwq.model;

import com.pwq.common.constant.enums.CommonResponseCodeEnum;
import lombok.Data;

@Data
public class RestResponse {
    private Integer code;
    private String message;
    private Object data;

    public RestResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public RestResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static RestResponse ofSuccess() {
        RestResponse response = new RestResponse(CommonResponseCodeEnum.SUCCESS.getCode(),
                CommonResponseCodeEnum.SUCCESS.getMessage());
        return response;
    }

    public static RestResponse ofSuccess(Object data) {
        RestResponse response = new RestResponse(CommonResponseCodeEnum.SUCCESS.getCode(),
                CommonResponseCodeEnum.SUCCESS.getMessage(), data);
        return response;
    }
}
