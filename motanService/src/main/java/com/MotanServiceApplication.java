package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:motan_server.xml"})
public class MotanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotanServiceApplication.class, args);
	}
}
