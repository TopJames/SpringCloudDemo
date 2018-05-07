package com.motanService.demo.service.impl;

import com.motanService.demo.service.FooService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * Created by Administrator on 2018/5/2.
 */
//@MotanService
public class Hello implements FooService {
    @Override
    public String hello(String name) {
        return "hello!"+name;
    }
}
