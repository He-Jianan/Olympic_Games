package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.Country;
import edu.ufl.cise.dbms.group6.olympic_games.vo.AthleteRatioVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.CountryVo;

import java.util.List;

public interface CountryMapper {
    int deleteByPrimaryKey(String code);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);

    List<CountryVo> queryAll();

    List<String> queryAllRegion();

    List<AthleteRatioVo> queryAthleteRatio(String region, String event);
}