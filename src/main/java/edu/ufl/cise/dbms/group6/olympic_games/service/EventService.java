package edu.ufl.cise.dbms.group6.olympic_games.service;

import edu.ufl.cise.dbms.group6.olympic_games.form.EventForm;
import edu.ufl.cise.dbms.group6.olympic_games.vo.EventVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;

import java.util.List;

public interface EventService {
    ResponseVo<List<EventVo>> queryAllEvent(EventForm eventForm);
}
