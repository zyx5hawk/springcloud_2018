package com.zyx.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.zyx.microservicecloud"})
@ComponentScan("com.zyx.microservicecloud")
public class Dept_Consumer_81_FeignApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Dept_Consumer_81_FeignApp.class, args);
	}

}
