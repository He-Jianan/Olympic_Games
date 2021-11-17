package edu.ufl.cise.dbms.group6.olympic_games.pojo;

import java.math.BigDecimal;

public class OlympicGamesKey {
    private BigDecimal year;

    private String season;

    public BigDecimal getYear() {
        return year;
    }

    public void setYear(BigDecimal year) {
        this.year = year;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season == null ? null : season.trim();
    }
}