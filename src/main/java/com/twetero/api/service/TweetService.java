package com.twetero.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.twetero.api.dto.TweetDTO;
import com.twetero.api.model.Auth;
import com.twetero.api.model.Tweet;
import com.twetero.api.repository.AuthRepository;
import com.twetero.api.repository.TweetRepository;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository repository;

    @Autowired
    private AuthRepository authRepository;

    public void post(TweetDTO tweetData) {
        List<Auth> users = authRepository.findAll();

        for(int i = 0; i < users.size(); i++) {
            if (Objects.equals(users.get(i).getUsername(), tweetData.username())) {
                repository.save(new Tweet(tweetData, users.get(i).getAvatar()));
                break;
            }
        }
    }

    public List<Tweet> findAll(int page) {
        Pageable pagination = PageRequest.of(page, 5, Sort.by("id").descending());
        return repository.findAll(pagination).getContent();
    }

    public List<Tweet> findByUsername(String username) {
        List<Tweet> tweets = repository.findAll(Sort.by("id").descending());

        return tweets.stream().filter(tweet -> Objects.equals(tweet.getUsername(), username)).collect(Collectors.toList());
    }
}
