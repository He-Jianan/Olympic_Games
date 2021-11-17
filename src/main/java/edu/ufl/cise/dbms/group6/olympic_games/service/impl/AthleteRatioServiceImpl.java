package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import edu.ufl.cise.dbms.group6.olympic_games.dao.CountryMapper;
import edu.ufl.cise.dbms.group6.olympic_games.service.AthleteRatioService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.AthleteRatioVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AthleteRatioServiceImpl implements AthleteRatioService {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public ResponseVo<List<String>> queryRegionList() {
        List<String> list = countryMapper.queryAllRegion();
        return ResponseVo.success(list);
    }

    @Override
    public ResponseVo<List<AthleteRatioVo>> queryAthleteRatio(String region, String event) {
        List<AthleteRatioVo> list = countryMapper.queryAthleteRatio(region, event);
        return ResponseVo.success(list);
    }
}
