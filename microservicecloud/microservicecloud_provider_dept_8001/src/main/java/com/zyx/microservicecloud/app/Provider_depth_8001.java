package com.zyx.microservicecloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@ComponentScan(basePackages = { "com.zyx.microservicecloud.controller" })
public class Provider_depth_8001 {
	public static void main(String[] args)
	{
		SpringApplication.run(Provider_depth_8001.class, args);
	}
}
