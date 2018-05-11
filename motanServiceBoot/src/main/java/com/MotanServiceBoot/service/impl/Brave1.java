package com.MotanServiceBoot.service.impl;

import com.MotanServiceBoot.service.BraveEnough;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * Created by Administrator on 2018/5/8.
 */
//@MotanService(group = "you_are_fucking_stupid")
//@MotanService
public class Brave1 implements BraveEnough {
    @Override
    public String ha(String content) {
        return "be brave! "+content;
    }
}
