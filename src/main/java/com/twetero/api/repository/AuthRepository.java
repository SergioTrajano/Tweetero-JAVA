package com.twetero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twetero.api.model.Auth;

public interface AuthRepository extends JpaRepository<Auth, Long>{
    
}
