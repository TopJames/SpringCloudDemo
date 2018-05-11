package com.motanService.controller;

import com.motanService.demo.service.FooService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements FooService{

    @RequestMapping("/hello")
    @Override
    public String hello(@RequestParam String name) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello!"+name;
    }
}
