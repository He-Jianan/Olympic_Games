package edu.ufl.cise.dbms.group6.olympic_games.pojo;

import java.math.BigDecimal;

public class GameEvent {
    private BigDecimal year;

    private String season;

    private BigDecimal eventId;

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

    public BigDecimal getEventId() {
        return eventId;
    }

    public void setEventId(BigDecimal eventId) {
        this.eventId = eventId;
    }
}