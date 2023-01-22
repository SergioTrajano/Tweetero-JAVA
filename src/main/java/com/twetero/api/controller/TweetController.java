package com.twetero.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twetero.api.dto.TweetDTO;
import com.twetero.api.service.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetController {
    
    @Autowired
    private TweetService service;

    @PostMapping
    public void post(@RequestBody @Valid TweetDTO tweetData) {
        service.post(tweetData);
    }
}
