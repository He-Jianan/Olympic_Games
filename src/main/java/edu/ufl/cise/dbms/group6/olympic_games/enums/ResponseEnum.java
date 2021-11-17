package edu.ufl.cise.dbms.group6.olympic_games.enums;

public enum ResponseEnum {
    SUCCESS(1, "success"),

    ERROR(0, "error");

    Integer code;

    String desc;

    ResponseEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
