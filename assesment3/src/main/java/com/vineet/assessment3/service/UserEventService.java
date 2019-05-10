package com.vineet.assessment3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vineet.assessment3.model.UserEvent;
import com.vineet.assessment3.repository.UserEventRepository;

public class UserEventService {

    @Autowired
    UserEventRepository repository;

    public List<UserEvent> getEventsById(String userId){

        return repository.findByUser(userId);
    }
}
