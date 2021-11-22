package edu.ufl.cise.dbms.group6.olympic_games.controller;

import edu.ufl.cise.dbms.group6.olympic_games.service.StrippedService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.StrippedVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "Stripped Medal API")
public class StrippedController {
    @Autowired
    private StrippedService strippedService;

    @GetMapping("/strippedMedal")
    @Operation(summary = "Query Stripped Medal")
    public ResponseVo<List<StrippedVo>> queryStrippedMedal(@RequestParam String season, @RequestParam String country) {
        return strippedService.queryStrippedMedal(season,country);
    }
}