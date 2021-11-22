package edu.ufl.cise.dbms.group6.olympic_games.service;

import edu.ufl.cise.dbms.group6.olympic_games.vo.GenderRatioVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;

import java.util.List;

public interface GenderRatioService {
    ResponseVo<List<GenderRatioVo>> queryGenderRatio(String season);

}
