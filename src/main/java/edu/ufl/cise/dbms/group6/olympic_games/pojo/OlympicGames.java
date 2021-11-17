package edu.ufl.cise.dbms.group6.olympic_games.pojo;

public class OlympicGames extends OlympicGamesKey {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }
}