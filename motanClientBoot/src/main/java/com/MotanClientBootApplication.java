package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MotanClientBootApplication {

	public static void main(String[] args) {

		ApplicationContext ac=SpringApplication.run(MotanClientBootApplication.class, args);

//		RegistryConfigProperties rp=(RegistryConfigProperties)ac.getBean("registryConfigProperties");
//		System.out.println(rp.getAddress());
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
