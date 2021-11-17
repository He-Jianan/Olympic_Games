package edu.ufl.cise.dbms.group6.olympic_games.service;

import edu.ufl.cise.dbms.group6.olympic_games.vo.CountryVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;

import java.util.List;

public interface CountryService {
    ResponseVo<List<CountryVo>> queryAllCountry();
}
