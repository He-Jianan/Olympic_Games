package edu.ufl.cise.dbms.group6.olympic_games.controller;

import edu.ufl.cise.dbms.group6.olympic_games.service.CountAllTuplesService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Count all tuples in database")
public class CountAllTupleController {

    @Autowired
    private CountAllTuplesService countAllTuplesService;

    @PostMapping("/count")
    @Operation(summary = "Count all tuples in database")
    public ResponseVo<Integer> countAll() {
        return countAllTuplesService.count();
    }
}
