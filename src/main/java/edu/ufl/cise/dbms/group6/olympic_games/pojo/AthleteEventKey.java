package edu.ufl.cise.dbms.group6.olympic_games.pojo;

import java.math.BigDecimal;

public class AthleteEventKey {
    private BigDecimal athleteId;

    private BigDecimal eventId;

    public BigDecimal getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(BigDecimal athleteId) {
        this.athleteId = athleteId;
    }

    public BigDecimal getEventId() {
        return eventId;
    }

    public void setEventId(BigDecimal eventId) {
        this.eventId = eventId;
    }
}