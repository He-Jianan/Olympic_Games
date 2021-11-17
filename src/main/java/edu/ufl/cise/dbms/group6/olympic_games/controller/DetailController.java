package edu.ufl.cise.dbms.group6.olympic_games.controller;

import com.github.pagehelper.PageInfo;
import edu.ufl.cise.dbms.group6.olympic_games.service.DetailService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Detail API")
public class DetailController {

    @Autowired
    private DetailService detailService;

    @GetMapping("/detail")
    @Operation(summary = "Query Detail Info")
    public ResponseVo<PageInfo> detail(@RequestParam (required = false, defaultValue = "1") Integer pageNum,
                                       @RequestParam (required = false, defaultValue = "10") Integer pageSize,
                                       @RequestParam (required = false) String name,
                                       @RequestParam (required = false) String country,
                                       @RequestParam (required = false) Integer year,
                                       @RequestParam (required = false) String season) {
        return detailService.queryDetail(pageNum, pageSize, name, country, year, season);
    }
}
