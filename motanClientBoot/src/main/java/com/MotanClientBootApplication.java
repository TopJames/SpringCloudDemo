package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MotanClientBootApplication {

	public static void main(String[] args) {

		ApplicationContext ac=SpringApplication.run(MotanClientBootApplication.class, args);

//		RegistryConfigProperties rp=(RegistryConfigProperties)ac.getBean("registryConfigProperties");
//		System.out.println(rp.getAddress());
	}
}
