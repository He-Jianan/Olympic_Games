package edu.ufl.cise.dbms.group6.olympic_games.service;

import edu.ufl.cise.dbms.group6.olympic_games.vo.StrippedEventVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.StrippedCountryVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.StrippedVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;


import java.util.List;

public interface StrippedService {
    ResponseVo<List<StrippedVo>> queryStrippedMedal(String season, String country);

    ResponseVo<List<StrippedCountryVo>> queryStrippedCountry(String season);

    ResponseVo<List<StrippedEventVo>> queryStrippedEvent(String season,String eventName);

}
