package edu.ufl.cise.dbms.group6.olympic_games.pojo;

import java.math.BigDecimal;

public class AthleteNationalityKey {
    private String country;

    private BigDecimal athleteId;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public BigDecimal getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(BigDecimal athleteId) {
        this.athleteId = athleteId;
    }
}