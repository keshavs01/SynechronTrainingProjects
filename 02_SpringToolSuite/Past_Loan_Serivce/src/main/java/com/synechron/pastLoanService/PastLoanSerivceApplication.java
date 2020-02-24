package com.synechron.pastLoanService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class PastLoanSerivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PastLoanSerivceApplication.class, args);
	}
	
	@Bean
	public RequestInterceptor basicAuthRequestInterceptor(){
		return new BasicAuthRequestInterceptor("india","india");
	}

}
