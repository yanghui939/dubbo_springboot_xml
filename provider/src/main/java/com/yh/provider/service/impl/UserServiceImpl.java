package com.yh.provider.service.impl;

import com.yh.dubbo_interface.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String hello() {
        return "hello springboot_dubbo_xml";
    }
}
