package com.MotanServiceBoot.starter.runner;

import com.MotanServiceBoot.starter.config.RegistryConfigProperties;
import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Configuration
@Order(Ordered.LOWEST_PRECEDENCE)
public class MotanCommandLineRunner implements CommandLineRunner {

    @Autowired
    RegistryConfigProperties registryConfigProperties;


    @Override
    public void run(String... strings) throws Exception {
        if (!registryConfigProperties.getRegProtocol().toLowerCase().equals("local")) {
            // 开启注册中心
            MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
        }
    }
}
