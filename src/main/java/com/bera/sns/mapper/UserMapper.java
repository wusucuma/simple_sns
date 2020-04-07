package com.bera.sns.mapper;

import com.bera.sns.dto.UserCreateDto;
import com.bera.sns.dto.UserRequestDto;
import com.bera.sns.entity.user.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    public UserCreateDto toCreateDto(UserRequestDto.UserCreate userCreate);

    public User toEntity(UserCreateDto userCreateDto);
}
