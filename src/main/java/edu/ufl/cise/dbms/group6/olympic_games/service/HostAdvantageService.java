package edu.ufl.cise.dbms.group6.olympic_games.service;

import edu.ufl.cise.dbms.group6.olympic_games.vo.HostCountryVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;

import java.util.List;

public interface HostAdvantageService {
    ResponseVo<List<HostCountryVo>> queryMedalNum (String season);
}
