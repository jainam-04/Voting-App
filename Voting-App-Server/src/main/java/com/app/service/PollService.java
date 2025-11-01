package com.app.service;

import com.app.model.Poll;
import com.app.model.PollOptionVote;
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

    public void vote(long pollId, int optionIndex){
        Poll poll = repository.findById(pollId).orElseThrow(() -> new RuntimeException("Poll not found"));
        List<PollOptionVote> options = poll.getOptions();
        if(optionIndex < 0 || optionIndex >= options.size()){
            throw new IllegalArgumentException("Invalid option index");
        }
        PollOptionVote selectedOption = options.get(optionIndex);
        selectedOption.setVoteCount(selectedOption.getVoteCount() + 1);
        repository.save(poll);
    }
}
