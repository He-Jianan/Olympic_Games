package edu.ufl.cise.dbms.group6.olympic_games.dao;

import edu.ufl.cise.dbms.group6.olympic_games.pojo.GDP;
import edu.ufl.cise.dbms.group6.olympic_games.vo.GdpVo;

import java.util.List;

public interface GDPMapper {
    int insert(GDP record);

    int insertSelective(GDP record);

    List<GdpVo> ParticipateGdp(String season ,String name);
}