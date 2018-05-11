package com.MotanClientBoot.service;

import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/8.
 */
@RestController
public class WebController {

    @MotanReferer
    com.motanService.demo.service.FooService fooService;

    @RequestMapping("/hi")
    public String hiBrave(@RequestParam String content){
        return fooService.hello(content);
    }
}
