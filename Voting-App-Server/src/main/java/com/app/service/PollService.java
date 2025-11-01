package com.app.service;

import com.app.model.Poll;
import com.app.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PollService {

    @Autowired
    private PollRepository repository;

    public Poll createPoll(Poll poll){
        return repository.save(poll);
    }

    public List<Poll> getAllPolls(){
        return repository.findAll();
    }

    public Optional<Poll> getPollById(long id){
        return repository.findById(id);
    }
}
