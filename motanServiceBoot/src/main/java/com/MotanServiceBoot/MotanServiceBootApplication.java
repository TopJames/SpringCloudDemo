package com.MotanServiceBoot;

import com.MotanServiceBoot.starter.config.RegistryConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MotanServiceBootApplication {

	public static void main(String[] args) {

		ApplicationContext ac=SpringApplication.run(MotanServiceBootApplication.class, args);

//		RegistryConfigProperties rp=(RegistryConfigProperties)ac.getBean("registryConfigProperties");
//		System.out.println(rp.getAddress());
	}
}
