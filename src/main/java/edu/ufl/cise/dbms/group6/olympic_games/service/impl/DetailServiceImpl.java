package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.ufl.cise.dbms.group6.olympic_games.dao.AthleteMapper;
import edu.ufl.cise.dbms.group6.olympic_games.service.DetailService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.DetailVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    private AthleteMapper athleteMapper;

    @Override
    public ResponseVo<PageInfo> queryDetail(Integer pageNum, Integer pageSize, String name, String country, Integer year, String season) {
        Integer startRow = (pageNum - 1) * pageSize + 1;
        Integer endRow = pageNum * pageSize;
        List<DetailVo> list = athleteMapper.queryDetail(startRow, endRow, name, country, year, season);
        int totalCount = athleteMapper.count();
        int pages = (int) Math.ceil((double) totalCount/(double) pageSize);
        PageHelper.startPage(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo(list);
        pageInfo.setList(list);
        pageInfo.setPages(pages);
        return ResponseVo.success(pageInfo);
    }
}
