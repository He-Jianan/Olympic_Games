package edu.ufl.cise.dbms.group6.olympic_games.controller;

import edu.ufl.cise.dbms.group6.olympic_games.service.GenderRatioService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.GenderRatioVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "Gender Ratio API")
public class GenderRatioController {
    @Autowired
    private GenderRatioService genderRatioService;

    @GetMapping("/sexRatio")
    @Operation(summary = "Query Gender Ratio")
    public ResponseVo<List<GenderRatioVo>> queryGenderRatio(@RequestParam String season) {
        return genderRatioService.queryGenderRatio(season);
    }
}