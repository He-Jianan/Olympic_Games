package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.Medal;
import java.math.BigDecimal;

public interface MedalMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Medal record);

    int insertSelective(Medal record);

    Medal selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Medal record);

    int updateByPrimaryKey(Medal record);
}