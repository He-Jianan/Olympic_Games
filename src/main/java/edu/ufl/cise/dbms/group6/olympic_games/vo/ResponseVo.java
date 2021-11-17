package edu.ufl.cise.dbms.group6.olympic_games.vo;

import edu.ufl.cise.dbms.group6.olympic_games.enums.ResponseEnum;

public class ResponseVo<T> {
    private Integer status;

    private String message;

    private T data;

    public ResponseVo(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseVo(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseVo<T> success(T data) {
        return new ResponseVo<>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getDesc(), data);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
