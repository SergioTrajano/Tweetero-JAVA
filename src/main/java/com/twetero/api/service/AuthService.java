package com.twetero.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twetero.api.dto.AuthDTO;
import com.twetero.api.model.Auth;
import com.twetero.api.repository.AuthRepository;

import java.util.List;

@Service
public class AuthService {
    
    @Autowired
    private AuthRepository repository;

    public void signUp(AuthDTO authData) {
        repository.save(new Auth(authData));
    }

    public List<Auth> signIn() {
        return repository.findAll();
    }
}
