package org.example.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis/demo")
public class RedisDemoController {

    private static final String key = "pdt_1001";


}
