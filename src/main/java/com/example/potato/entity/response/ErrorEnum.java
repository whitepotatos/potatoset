package com.example.potato.entity.response;

import lombok.Getter;

@Getter
public enum ErrorEnum implements CommonEnum{

    //系统
    SUCCESS("0000","请求成功"),
    SECUTIRY_ERROR("0030","安全验证未通过"),
    UNKNOWN_ERROR("0001","系统异常"),
    IP_OPERATION_OFTEN("0002","ip操作过于频繁"),
    DECRYPT_ERROR("0028","解密异常"),
    SESSION_NULL_ERROR("0003","session为空"),
    NOT_LOGIN("0004","用户未登录"),
    ;

    private String code;
    private String message;

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }

    ErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
