package com.twetero.api.model;

import com.twetero.api.dto.AuthDTO;

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
public class Auth {

    public Auth(AuthDTO authdata) {
        this.avatar = authdata.avatar();
        this.username = authdata.username();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column( nullable = false)
    private String username;

    @Column(nullable = false)
    private String avatar;
}
