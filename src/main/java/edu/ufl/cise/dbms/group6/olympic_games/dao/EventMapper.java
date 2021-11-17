package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.Event;
import edu.ufl.cise.dbms.group6.olympic_games.vo.EventVo;

import java.math.BigDecimal;
import java.util.List;

public interface EventMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Event record);

    int insertSelective(Event record);

    Event selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);

    List<EventVo> queryAll (String season);
}