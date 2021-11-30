package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import edu.ufl.cise.dbms.group6.olympic_games.dao.EventMapper;
import edu.ufl.cise.dbms.group6.olympic_games.service.CountAllTuplesService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountAllTuplesServiceImpl implements CountAllTuplesService {

    @Autowired
    private EventMapper eventMapper;

    @Override
    public ResponseVo<Integer> count() {
        int number = eventMapper.countAllTuples();
        return ResponseVo.success(number);
    }
}
