package edu.ufl.cise.dbms.group6.olympic_games.service.impl;

import edu.ufl.cise.dbms.group6.olympic_games.dao.EventMapper;
import edu.ufl.cise.dbms.group6.olympic_games.form.EventForm;
import edu.ufl.cise.dbms.group6.olympic_games.service.EventService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.EventVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventMapper eventMapper;

    @Override
    public ResponseVo<List<EventVo>> queryAllEvent(EventForm eventForm) {
        String season = eventForm.getSeason();
        if (season.equals("summer") || season.equals("winter")) {
            return ResponseVo.error("The first letter should be capital!");
        }

        List<EventVo> list = eventMapper.queryAll(season);
        return ResponseVo.success(list);
    }
}
