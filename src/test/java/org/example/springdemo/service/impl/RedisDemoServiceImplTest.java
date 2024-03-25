package org.example.springdemo.service.impl;

import org.example.springdemo.SpringDemoApplicationTests;
import org.example.springdemo.service.RedisDemoService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

class RedisDemoServiceImplTest extends SpringDemoApplicationTests {

    @Resource
    private RedisDemoService redisDemoService;

    private static final String key = "redis_test";

    @Test
    void setKeyValues() {
        this.redisDemoService.setKeyValues(key, "testRedisBase");
    }

    @Test
    void getValueByKey() {
        System.out.print(this.redisDemoService.getValueByKey(key));
    }
}