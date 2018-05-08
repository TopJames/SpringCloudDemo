package com.MotanServiceBoot.service.impl;


import com.MotanServiceBoot.service.FooService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;
import org.springframework.stereotype.Service;


@MotanService
public class Hello implements FooService {
    @Override
    public String hello(String name) {
        return "hello!"+name;
    }
}
