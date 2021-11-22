package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import edu.ufl.cise.dbms.group6.olympic_games.dao.GDPMapper;
import edu.ufl.cise.dbms.group6.olympic_games.service.GdpRatioService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.GdpVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GdpRatioServiceImpl implements GdpRatioService {
    @Autowired
    private GDPMapper gdpMapper;

    @Override
    public ResponseVo<List<GdpVo>> ParticipateGdp(String season, String name) {
        List<GdpVo> list = gdpMapper.participateGdp(season, name);
        return ResponseVo.success(list);
    }


}
