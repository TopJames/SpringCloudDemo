package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath*:motan_client.xml"})
public class MotanClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotanClientApplication.class, args);
	}
}
