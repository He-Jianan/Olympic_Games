package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.Medal;
import edu.ufl.cise.dbms.group6.olympic_games.vo.StrippedVo;

import java.math.BigDecimal;
import java.util.List;

public interface MedalMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Medal record);

    int insertSelective(Medal record);

    Medal selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Medal record);

    int updateByPrimaryKey(Medal record);

    List<StrippedVo> queryStrippedMedal(String season,String country);

}