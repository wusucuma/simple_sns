package com.bera.sns.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserCreateDto {

    private String userName;

    @Builder
    public UserCreateDto(String userName) {
        this.userName = userName;
    }
}
