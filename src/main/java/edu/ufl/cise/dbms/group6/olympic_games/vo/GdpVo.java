package edu.ufl.cise.dbms.group6.olympic_games.vo;

import java.math.BigDecimal;

public class GdpVo {
    private Integer numberofparticipants;
    private BigDecimal rate;
    private BigDecimal gdp_value;
    private Integer year;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BigDecimal getGdp_value() {
        return gdp_value;
    }

    public void setGdp_value(BigDecimal gdp_value) {
        this.gdp_value = gdp_value;
    }



    public Integer getNumberofparticipants() {
        return numberofparticipants;
    }

    public void setNumberofparticipants(Integer numberofparticipants) {
        this.numberofparticipants = numberofparticipants;
    }

    public BigDecimal getRate() {
        return rate;

    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

}
