package edu.ufl.cise.dbms.group6.olympic_games.vo;

import java.math.BigDecimal;

public class TopVo {
    private Integer year;
    private String eventname;
    private Integer maxevent;
    private BigDecimal ratio;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public Integer getMaxevent() {
        return maxevent;
    }

    public void setMaxevent(Integer maxevent) {
        this.maxevent = maxevent;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }
}
