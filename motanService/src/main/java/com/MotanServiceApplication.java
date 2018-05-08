package com;

import com.starter.config.RegistryConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:motan_server.xml"})
public class MotanServiceApplication {

	public static void main(String[] args) {

		ApplicationContext ac=SpringApplication.run(MotanServiceApplication.class, args);

		RegistryConfigProperties rp=(RegistryConfigProperties)ac.getBean("registryConfigProperties");
		System.out.println(rp.getAddress());
	}
}
