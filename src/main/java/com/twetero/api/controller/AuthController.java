package com.twetero.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twetero.api.dto.AuthDTO;
import com.twetero.api.service.AuthService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody @Valid AuthDTO authData) {
        service.signUp(authData);
    }
}
