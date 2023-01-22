package com.twetero.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twetero.api.dto.TweetDTO;
import com.twetero.api.model.Tweet;
import com.twetero.api.repository.TweetRepository;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository repository;

    public void post(TweetDTO tweetData) {
        repository.save(new Tweet(tweetData));
    }
}
