package com.avatech.common.exception;

/**
 * 异常基类
 */
public class BaseException extends RuntimeException{

    private String code = "";

    public String getCode(){
        return code;
    }

    private String message = "";
    public String getMessage(){return message;}

    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
        this.message = message;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message;
    }

    public BaseException(String code,String message){
        super(message);
        this.code = code;
        this.message = message;
    }
}
