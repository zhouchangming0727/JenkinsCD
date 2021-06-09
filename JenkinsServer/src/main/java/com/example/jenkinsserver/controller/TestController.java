package com.example.jenkinsserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zcm
 * @Data: 2021/6/9
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public StudentBean  test(){
        return new StudentBean("周常明","蓝亮");
    }


}
