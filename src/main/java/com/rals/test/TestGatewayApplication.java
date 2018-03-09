package com.rals.test;

import filters.filterGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@EnableZuulProxy
@SpringBootApplication
public class TestGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestGatewayApplication.class, args);
	}

	@Bean
	public filterGateway filterGateway() {
		return new filterGateway();
	}

}
