package com.pwq.model.vo;

import lombok.Data;

@Data
public class RestResponse {
    private int code;
    private String message;

    public RestResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
