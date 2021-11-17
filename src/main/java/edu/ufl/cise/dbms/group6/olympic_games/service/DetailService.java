package edu.ufl.cise.dbms.group6.olympic_games.service;

import com.github.pagehelper.PageInfo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.DetailVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;

public interface DetailService {
    ResponseVo<PageInfo> queryDetail (Integer pageNum, Integer pageSize, String name, String country, Integer year, String season);
}
