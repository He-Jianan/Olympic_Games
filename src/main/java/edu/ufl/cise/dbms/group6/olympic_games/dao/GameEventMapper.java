package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.GameEvent;
import edu.ufl.cise.dbms.group6.olympic_games.vo.TopVo;

import java.util.List;

public interface GameEventMapper {
    int insert(GameEvent record);

    int insertSelective(GameEvent record);
    List<TopVo> Topevent(String season , String name);
}