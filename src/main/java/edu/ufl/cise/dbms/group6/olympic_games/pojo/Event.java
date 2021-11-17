package edu.ufl.cise.dbms.group6.olympic_games.pojo;

import java.math.BigDecimal;

public class Event {
    private BigDecimal id;

    private String name;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}