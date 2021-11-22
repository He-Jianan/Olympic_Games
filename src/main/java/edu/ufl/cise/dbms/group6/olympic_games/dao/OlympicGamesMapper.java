package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.OlympicGames;
import edu.ufl.cise.dbms.group6.olympic_games.pojo.OlympicGamesKey;
import edu.ufl.cise.dbms.group6.olympic_games.vo.GenderRatioVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.HostCountryVo;

import java.util.List;

public interface OlympicGamesMapper {
    int deleteByPrimaryKey(OlympicGamesKey key);

    int insert(OlympicGames record);

    int insertSelective(OlympicGames record);

    OlympicGames selectByPrimaryKey(OlympicGamesKey key);

    int updateByPrimaryKeySelective(OlympicGames record);

    int updateByPrimaryKey(OlympicGames record);

    List<HostCountryVo> queryMedalNum (String season);

    List<GenderRatioVo> queryGenderRatio(String region);
}