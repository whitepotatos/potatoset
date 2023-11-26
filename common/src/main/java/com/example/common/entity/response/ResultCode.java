package com.example.potato.entity.response;

public enum ResultCode {
        UNAUTHORIZED(1000, "未经授权，无法访问"),
        OK(2000, "成功"),
        ;

        private int code;
        private String message;

        ResultCode(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

}
