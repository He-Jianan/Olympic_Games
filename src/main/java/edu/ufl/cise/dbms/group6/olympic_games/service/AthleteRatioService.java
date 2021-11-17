package edu.ufl.cise.dbms.group6.olympic_games.service;

import edu.ufl.cise.dbms.group6.olympic_games.vo.AthleteRatioVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;

import java.util.List;

public interface AthleteRatioService {

    ResponseVo<List<String>> queryRegionList();

    ResponseVo<List<AthleteRatioVo>> queryAthleteRatio(String region, String event);
}
