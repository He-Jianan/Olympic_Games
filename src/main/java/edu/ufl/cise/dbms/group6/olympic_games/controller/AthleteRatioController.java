package edu.ufl.cise.dbms.group6.olympic_games.controller;

import edu.ufl.cise.dbms.group6.olympic_games.service.AthleteRatioService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.AthleteRatioVo;
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
@Api(tags = "Athlete Ratio API")
public class AthleteRatioController {
    @Autowired
    private AthleteRatioService athleteRatioService;

    @PostMapping("/regionList")
    @Operation(summary = "Query All Region")
    public ResponseVo<List<String>> queryRegionList() {
        return athleteRatioService.queryRegionList();
    }

    @GetMapping("/athleteRatio")
    @Operation(summary = "Query Athlete Ratio")
    public ResponseVo<List<AthleteRatioVo>> queryAthleteRatio(@RequestParam String region,
                                                              @RequestParam String event) {
        return athleteRatioService.queryAthleteRatio(region, event);
    }
}
