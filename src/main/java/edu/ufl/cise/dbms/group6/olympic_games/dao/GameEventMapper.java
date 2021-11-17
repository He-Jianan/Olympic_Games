package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.GameEvent;

public interface GameEventMapper {
    int insert(GameEvent record);

    int insertSelective(GameEvent record);
}