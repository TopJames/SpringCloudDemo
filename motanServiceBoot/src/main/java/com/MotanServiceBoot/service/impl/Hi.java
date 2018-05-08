package com.MotanServiceBoot.service.impl;

import com.MotanServiceBoot.service.FooService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

//@MotanService
public class Hi implements FooService {
    @Override
    public String hello(String name) {
        return "Hi!!!!!"+name;
    }
}
