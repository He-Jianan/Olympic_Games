package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.AthleteNationalityKey;

public interface AthleteNationalityMapper {
    int deleteByPrimaryKey(AthleteNationalityKey key);

    int insert(AthleteNationalityKey record);

    int insertSelective(AthleteNationalityKey record);
}