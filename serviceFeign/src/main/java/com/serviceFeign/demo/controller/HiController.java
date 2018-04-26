package com.serviceFeign.demo.controller;

import com.serviceFeign.demo.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/25.
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hiFeign")
    public String sayHi(@RequestParam(value="name") String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
