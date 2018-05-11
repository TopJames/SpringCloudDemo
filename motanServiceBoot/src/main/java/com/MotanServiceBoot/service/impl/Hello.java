package com.MotanServiceBoot.service.impl;


import com.motanService.demo.service.FooService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;
import org.springframework.stereotype.Service;


//@MotanService(export = "8888",group = "iiiiii",interfaceClass = FooService.class)
@MotanService
public class Hello implements FooService {
    @Override
    public String hello(String name) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello!"+name;
    }
}
