package com.yh.consumer.controller;

import com.yh.dubbo_interface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String hello() {
        return userService.hello();
    }
}
