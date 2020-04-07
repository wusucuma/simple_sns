package com.bera.sns.service;

import com.bera.sns.dto.UserCreateDto;
import com.bera.sns.entity.user.User;
import com.bera.sns.mapper.UserMapper;
import com.bera.sns.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User userCreate(UserCreateDto userCreateDto) {
        User user = userMapper.toEntity(userCreateDto);
        return userRepository.save(user);
    }
}
