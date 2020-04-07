package com.bera.sns.dto;

import lombok.Getter;

public class UserRequestDto {

    @Getter
    public static class UserCreate {
        private String userName;
    }
}
