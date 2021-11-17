package edu.ufl.cise.dbms.group6.olympic_games.controller;

import edu.ufl.cise.dbms.group6.olympic_games.service.HostAdvantageService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.HostCountryVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "Host Country Advantage API")
public class HostAdvantageController {
    @Autowired
    private HostAdvantageService hostAdvantageService;

    @GetMapping("/hostAdvantage")
    @Operation(summary = "Query Host Country Medal Number")
    public ResponseVo<List<HostCountryVo>> queryHostAdvantage (@RequestParam String season) {
        return hostAdvantageService.queryMedalNum(season);
    }
}
