package edu.ufl.cise.dbms.group6.olympic_games.pojo;

import java.math.BigDecimal;

public class GDP {
    private BigDecimal year;

    private BigDecimal gdpValue;

    private String nationality;

    public BigDecimal getYear() {
        return year;
    }

    public void setYear(BigDecimal year) {
        this.year = year;
    }

    public BigDecimal getGdpValue() {
        return gdpValue;
    }

    public void setGdpValue(BigDecimal gdpValue) {
        this.gdpValue = gdpValue;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }
}