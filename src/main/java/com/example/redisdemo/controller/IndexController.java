package com.example.redisdemo.controller;

import com.example.redisdemo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    protected RedisUtil redis;

    @RequestMapping("/redis")
    public Object redis() {
         redis.set("uc","263499118");
        return redis.get("uc");
    }
}