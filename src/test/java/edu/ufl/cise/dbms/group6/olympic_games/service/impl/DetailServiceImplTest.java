package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import com.github.pagehelper.PageInfo;
import edu.ufl.cise.dbms.group6.olympic_games.OlympicGamesApplicationTests;
import edu.ufl.cise.dbms.group6.olympic_games.enums.ResponseEnum;
import edu.ufl.cise.dbms.group6.olympic_games.service.DetailService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class DetailServiceImplTest extends OlympicGamesApplicationTests {

    @Autowired
    private DetailService detailService;

    @Test
    void queryDetail() {
        ResponseVo<PageInfo> responseVo = detailService.queryDetail(1, 2, null, null, null, null);
        System.out.println(responseVo.getData().getList());
        Assertions.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
    }
}