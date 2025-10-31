package com.app.controller;

import com.app.model.Poll;
import com.app.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    @Autowired
    private PollService service;

    @PostMapping
    public Poll createPoll(@RequestBody Poll poll){
        return service.createPoll(poll);
    }
}
