package com.MotanClientBoot.service;

import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/5/8.
 */
@RestController
public class WebController {

    @MotanReferer
    com.motanService.demo.service.FooService fooService;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hiBrave(@RequestParam String content){
        return fooService.hello(content);
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return restTemplate.getForObject("http://MOTAN-SERVICE-BOOT/hello?name="+name, String.class);
    }
}
