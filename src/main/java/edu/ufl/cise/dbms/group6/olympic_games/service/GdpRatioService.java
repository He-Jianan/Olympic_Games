package edu.ufl.cise.dbms.group6.olympic_games.service;


import edu.ufl.cise.dbms.group6.olympic_games.vo.GdpVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;

import java.util.List;

public interface GdpRatioService {
    ResponseVo<List<GdpVo>> ParticipateGdp(String season, String name);
}
