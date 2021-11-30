package edu.ufl.cise.dbms.group6.olympic_games.vo;

public class StrippedCountryVo {
    private int year;

    private String season;

    private int stripped;

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

    public int getStripped() {
        return stripped;
    }

    public void setStripped(int stripped) {
        this.stripped = stripped;
    }
}
