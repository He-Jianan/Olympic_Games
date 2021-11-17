package edu.ufl.cise.dbms.group6.olympic_games.controller;

import edu.ufl.cise.dbms.group6.olympic_games.form.EventForm;
import edu.ufl.cise.dbms.group6.olympic_games.service.EventService;
import edu.ufl.cise.dbms.group6.olympic_games.vo.EventVo;
import edu.ufl.cise.dbms.group6.olympic_games.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "Event API")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("eventList")
    @Operation(summary = "Query Event List")
    public ResponseVo<List<EventVo>> queryEventList(@RequestBody EventForm eventForm) {
        return eventService.queryAllEvent(eventForm);
    }
}
