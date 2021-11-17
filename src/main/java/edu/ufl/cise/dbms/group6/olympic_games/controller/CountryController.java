package edu.ufl.cise.dbms.group6.olympic_games.controller;

import edu.ufl.cise.dbms.group6.olympic_games.service.CountryService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.CountryVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "Country List API")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @PostMapping("/countryList")
    @Operation(summary = "Query Country List")
    public ResponseVo<List<CountryVo>> queryCountryList() {
        return countryService.queryAllCountry();
    }
}
