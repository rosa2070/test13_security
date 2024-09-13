package com.example.test13_security.service;

import com.example.test13_security.entity.User;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

@SpringBootTest
@Transactional
@Commit
public class UserServiceTest {
    @Autowired private UserService userService;

    @Test
    void save() {
        userService.save(new User(0L, "hello", "1234", "MEMBER"));
    }

    @Test
    void isMember() {
        boolean result = userService.isMember("hello", "1234");
        System.out.println("result:" + result);
    }
}
