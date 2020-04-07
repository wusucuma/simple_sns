package com.bera.sns.user;

import com.bera.sns.dto.UserCreateDto;
import com.bera.sns.entity.user.User;
import com.bera.sns.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

  @Autowired private UserService userService;

  @Test
  public void 회원등록_서비스_테스트() {
      UserCreateDto userCreateDto = UserCreateDto.builder().userName("윤정식").build();
      User user = userService.userCreate(userCreateDto);

      Assertions.assertEquals("윤정식", user.getUserName());
  }
}
