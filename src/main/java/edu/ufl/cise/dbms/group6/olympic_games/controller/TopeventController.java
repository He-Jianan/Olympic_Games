package edu.ufl.cise.dbms.group6.olympic_games.controller;

import edu.ufl.cise.dbms.group6.olympic_games.service.GdpRatioService;
import edu.ufl.cise.dbms.group6.olympic_games.service.TopeventService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.GdpVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.TopVo;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Api(tags = "Top event API")
public class TopeventController {

    @Autowired
    private TopeventService TopeventService;

    @GetMapping("/eventRatio")
    @Operation(summary = "Top event")
    public ResponseVo<List<TopVo>> Topevent(@RequestParam(required = false, defaultValue = "Summer") String season,
                                            @RequestParam(required = false, defaultValue = "United States") String countryName){
        return TopeventService.Topevent(season,countryName);
    }

}
