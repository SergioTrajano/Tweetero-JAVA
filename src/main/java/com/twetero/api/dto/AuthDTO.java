package com.twetero.api.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;

public record AuthDTO(

    @NotBlank
    String username,

    @URL
    String avatar
) {}
