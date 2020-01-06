package com.example.redisdemo;

import com.example.redisdemo.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisDemoApplicationTests {

    @Autowired
    RedisUtil redisUtil;

    @Test
    void contextLoads() {

    }

}
