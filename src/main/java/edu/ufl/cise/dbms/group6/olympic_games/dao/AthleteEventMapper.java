package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.AthleteEventKey;

public interface AthleteEventMapper {
    int deleteByPrimaryKey(AthleteEventKey key);

    int insert(AthleteEventKey record);

    int insertSelective(AthleteEventKey record);
}