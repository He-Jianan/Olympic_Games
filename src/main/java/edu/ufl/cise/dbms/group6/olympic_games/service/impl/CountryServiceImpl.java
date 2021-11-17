package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import edu.ufl.cise.dbms.group6.olympic_games.dao.CountryMapper;
import edu.ufl.cise.dbms.group6.olympic_games.service.CountryService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.CountryVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public ResponseVo<List<CountryVo>> queryAllCountry() {
        List<CountryVo> list = countryMapper.queryAll();
        return ResponseVo.success(list);
    }
}
