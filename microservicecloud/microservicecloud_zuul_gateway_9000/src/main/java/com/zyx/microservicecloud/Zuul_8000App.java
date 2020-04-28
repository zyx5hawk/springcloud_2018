package com.zyx.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_8000App {

	public static void main(String[] args) {
		SpringApplication.run(Zuul_8000App.class, args);
	}

}
