package edu.ufl.cise.dbms.group6.olympic_games.vo;

import java.math.BigDecimal;

public class AthleteRatioVo {
    private Integer year;

    private BigDecimal ratio;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }
}
