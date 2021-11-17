package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import edu.ufl.cise.dbms.group6.olympic_games.dao.OlympicGamesMapper;
import edu.ufl.cise.dbms.group6.olympic_games.service.HostAdvantageService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.HostCountryVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostAdvantageServiceImpl implements HostAdvantageService {

    @Autowired
    private OlympicGamesMapper olympicGamesMapper;

    @Override
    public ResponseVo<List<HostCountryVo>> queryMedalNum(String season) {
        List<HostCountryVo> list = olympicGamesMapper.queryMedalNum(season);
        return ResponseVo.success(list);
    }
}
