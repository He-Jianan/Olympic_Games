package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import edu.ufl.cise.dbms.group6.olympic_games.dao.GameEventMapper;
import edu.ufl.cise.dbms.group6.olympic_games.service.TopeventService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.GdpVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.TopVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopeventServiceImpl implements TopeventService {
    @Autowired
    private GameEventMapper gameEventMapper;

    @Override
    public ResponseVo<List<TopVo>> Topevent(String season, String name) {
        List<TopVo> list = gameEventMapper.Topevent(season, name);
        return ResponseVo.success(list);
    }
}
