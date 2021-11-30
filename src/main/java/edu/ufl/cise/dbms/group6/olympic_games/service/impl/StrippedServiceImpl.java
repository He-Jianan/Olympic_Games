package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import edu.ufl.cise.dbms.group6.olympic_games.dao.MedalMapper;
import edu.ufl.cise.dbms.group6.olympic_games.dao.OlympicGamesMapper;
import edu.ufl.cise.dbms.group6.olympic_games.service.GenderRatioService;
import edu.ufl.cise.dbms.group6.olympic_games.service.StrippedService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.GenderRatioVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.StrippedCountryVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.StrippedVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StrippedServiceImpl implements StrippedService {
    @Autowired
    private MedalMapper medalMapper;

    @Override
    public ResponseVo<List<StrippedVo>> queryStrippedMedal(String season, String country) {
        List<StrippedVo> list = medalMapper.queryStrippedMedal(season,country);
        return ResponseVo.success(list);
    }

    @Override
    public ResponseVo<List<StrippedCountryVo>> queryStrippedCountry(String season) {
        List<StrippedCountryVo> strippedCountryVoList = medalMapper.queryStrippedCountry(season);
        return ResponseVo.success(strippedCountryVoList);

    }


}
