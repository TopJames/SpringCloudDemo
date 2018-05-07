package com.motanClient.demo.controller;

import com.motanService.demo.service.FooService;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/5/3.
 */
@RestController
@Order(10)
public class Enter {

    @Resource(name = "remoteService")
    FooService fooService;

   @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return fooService.hello(name);
    }

}
