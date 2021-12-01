package edu.ufl.cise.dbms.group6.olympic_games.vo;

public class StrippedEventVo {
    private int year;

    private String season;

    private int num;

    private String strippedEvent;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStrippedEvent() {
        return strippedEvent;
    }

    public void setStrippedEvent(String strippedEvent) {
        this.strippedEvent = strippedEvent;
    }
}
