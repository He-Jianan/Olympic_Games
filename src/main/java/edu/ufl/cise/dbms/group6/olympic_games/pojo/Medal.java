package edu.ufl.cise.dbms.group6.olympic_games.pojo;

import java.math.BigDecimal;

public class Medal {
    private BigDecimal id;

    private BigDecimal eventId;

    private String status;

    private String medalType;

    private BigDecimal athleteId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getEventId() {
        return eventId;
    }

    public void setEventId(BigDecimal eventId) {
        this.eventId = eventId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMedalType() {
        return medalType;
    }

    public void setMedalType(String medalType) {
        this.medalType = medalType == null ? null : medalType.trim();
    }

    public BigDecimal getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(BigDecimal athleteId) {
        this.athleteId = athleteId;
    }
}