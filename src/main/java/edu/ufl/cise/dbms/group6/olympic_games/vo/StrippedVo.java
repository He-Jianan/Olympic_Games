package edu.ufl.cise.dbms.group6.olympic_games.vo;

import java.math.BigDecimal;

public class StrippedVo {
    private Integer year;
    private String season;
    private String country;
    private BigDecimal ratio;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

}
