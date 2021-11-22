package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import edu.ufl.cise.dbms.group6.olympic_games.dao.OlympicGamesMapper;
import edu.ufl.cise.dbms.group6.olympic_games.service.GenderRatioService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.GenderRatioVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderRatioServiceImpl implements GenderRatioService {
    @Autowired
    private OlympicGamesMapper olympicGamesMapper;

    @Override
    public ResponseVo<List<GenderRatioVo>> queryGenderRatio(String season) {
        List<GenderRatioVo> list = olympicGamesMapper.queryGenderRatio(season);
        return ResponseVo.success(list);
    }
}
