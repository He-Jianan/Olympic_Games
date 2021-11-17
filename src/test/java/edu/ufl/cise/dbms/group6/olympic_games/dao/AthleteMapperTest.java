package edu.ufl.cise.dbms.group6.olympic_games.dao;


import edu.ufl.cise.dbms.group6.olympic_games.OlympicGamesApplicationTests;
import edu.ufl.cise.dbms.group6.olympic_games.pojo.Athlete;
import edu.ufl.cise.dbms.group6.olympic_games.vo.DetailVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AthleteMapperTest extends OlympicGamesApplicationTests {

    @Autowired
    private AthleteMapper athleteMapper;

    @Test
    void queryDetail() {
        List<DetailVo> list = athleteMapper.queryDetail(1, 10, null, null, null, null);
        for (DetailVo detailVo : list) {
            System.out.println(detailVo.toString());
        }
    }

    @Test
    void selectByPrimaryKey() {
        Athlete athlete = athleteMapper.selectByPrimaryKey(BigDecimal.valueOf(1));
        System.out.println(athlete.toString());
    }
}