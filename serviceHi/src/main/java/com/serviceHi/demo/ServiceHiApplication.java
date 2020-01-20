package com.serviceHi.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class ServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}


	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	@HystrixCommand(fallbackMethod = "hiError")
	public String home(@RequestParam String name) {
		return restTemplate.getForObject("http://localhost:8989/himiya", String.class);
	}

	@RequestMapping("/hizone")
	@HystrixCommand(fallbackMethod = "hiError")
	public String hizone(@RequestParam String name) {
		return "hizone,name:"+name+",port:"+port;
	}

	@RequestMapping("/hi2")
	@HystrixCommand(fallbackMethod = "hiError2")
	public String home2(@RequestParam String name) {
		return restTemplate.getForObject("http://localhost:8989/himiya", String.class);
	}

	@RequestMapping("/hi3")
	@HystrixCommand(fallbackMethod = "hiError2")
	public String home3() {
		return restTemplate.getForObject("http://localhost:8989/himiya", String.class);
	}

	@RequestMapping("/hi4")
	@HystrixCommand(fallbackMethod = "hiError2")
	public String home4() {
		return "kk";
	}

	public String hiError(String name) {
		return "hi,"+name+",sorry,error!";
	}

	public String hiError2(String name) {
		return "hi,"+name+",sorry,error222!";
	}
	public String hiError2() {
		return "hi,null~~~~~,sorry,error222!";
	}



//	private static final Logger LOG = Logger.getLogger(ServiceHiApplication.class.getName());
//
//
	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
//
//	@RequestMapping("/hisha")
//	@ResponseBody
//	public String callHome(){
//		LOG.log(Level.INFO, "calling trace service-hi  ");
//		return restTemplate.getForObject("http://localhost:8989/miyaInfo", String.class);
//	}
//	@RequestMapping("/infosha")
//	@ResponseBody
//	public String info(){
//		LOG.log(Level.INFO, "calling trace service-hi ");
//
//		return "i'm service-hi";
//
//	}
//
//	@Bean
//	public AlwaysSampler defaultSampler(){
//		return new AlwaysSampler();
//	}
}
