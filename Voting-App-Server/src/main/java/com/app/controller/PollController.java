package com.app.controller;

import com.app.model.Poll;
import com.app.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    @Autowired
    private PollService service;

    @PostMapping
    public Poll createPoll(@RequestBody Poll poll){
        return service.createPoll(poll);
    }

    @GetMapping
    public List<Poll> getAllPolls(){
        return service.getAllPolls();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Poll> getPollById(@PathVariable long id){
        return service.getPollById(id)
                .map(ResponseEntity :: ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
