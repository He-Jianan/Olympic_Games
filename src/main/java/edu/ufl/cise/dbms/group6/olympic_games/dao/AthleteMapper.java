package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.Athlete;
import edu.ufl.cise.dbms.group6.olympic_games.vo.DetailVo;

import java.math.BigDecimal;
import java.util.List;

public interface AthleteMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Athlete record);

    int insertSelective(Athlete record);

    Athlete selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Athlete record);

    int updateByPrimaryKey(Athlete record);

    List<DetailVo> queryDetail(Integer startRow, Integer endRow, String name, String country, Integer year, String season);

    int count();
}