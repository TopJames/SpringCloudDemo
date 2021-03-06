package com.serviceFeign.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/4/25.
 */
@FeignClient(value="SERVICE-HI",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value="name") String name);

    @RequestMapping("/hizone")
    String hizone(@RequestParam(value="name") String name);
}
