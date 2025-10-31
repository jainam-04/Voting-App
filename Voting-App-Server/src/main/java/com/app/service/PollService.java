package com.app.service;

import com.app.model.Poll;
import com.app.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollService {

    @Autowired
    private PollRepository repository;

    public Poll createPoll(Poll poll){
        return repository.save(poll);
    }
}
