package com.vineet.assessment3.repository;

import com.vineet.assessment3.model.UserEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;



public interface UserEventRepository extends MongoRepository<UserEvent, String> {

    public List<UserEvent> findByUser(String userId);


}


