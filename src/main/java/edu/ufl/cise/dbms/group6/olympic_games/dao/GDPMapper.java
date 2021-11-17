package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.GDP;

public interface GDPMapper {
    int insert(GDP record);

    int insertSelective(GDP record);
}