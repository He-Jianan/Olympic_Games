package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.ParticipateIn;

public interface ParticipateInMapper {
    int insert(ParticipateIn record);

    int insertSelective(ParticipateIn record);
}