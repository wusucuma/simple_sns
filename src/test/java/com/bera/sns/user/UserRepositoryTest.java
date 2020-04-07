package com.bera.sns.user;

import com.bera.sns.entity.user.User;
import com.bera.sns.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepositoryTest {

  @Autowired private UserRepository userRepository;

  @Test
  public void 회원등록() {
      User user = User.builder().userName("윤정식").build();
      userRepository.save(user);

      Assertions.assertEquals(1, userRepository.count());
  }
}
