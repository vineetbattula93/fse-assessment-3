package com.vineet.assessment3.controller;

import com.vineet.assessment3.model.UserEvent;
import com.vineet.assessment3.repository.UserEventRepository;
import com.vineet.assessment3.service.UserEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import

import java.util.List;

@RestController
public class UserEventController {

    @Autowired
    private UserEventRepository repository;

    @Autowired
    private UserEventService service;

    @GetMapping(value = "/events")
    public List<UserEvent> getAllEvents() {
        return repository.findAll();
    }

    @GetMapping(value = "/events/{userId}")
    public List<UserEvent> getUserEvents(@PathVariables("userId") String userId){
        return service.getEventsById(userId);
    }

}



