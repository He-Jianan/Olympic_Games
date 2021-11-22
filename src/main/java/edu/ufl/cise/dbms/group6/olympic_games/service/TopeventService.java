package edu.ufl.cise.dbms.group6.olympic_games.service;


import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.TopVo;

import java.util.List;

public interface TopeventService {
    ResponseVo<List<TopVo>> Topevent(String season, String name);
}
