package com.twetero.api.model;

import com.twetero.api.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweet {


    public Tweet(TweetDTO tweetData, String avatar) {
        this.text = tweetData.tweet();
        this.username = tweetData.username();
        this.avatar = avatar;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column( nullable = false)
    private String username;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private String avatar;
}
