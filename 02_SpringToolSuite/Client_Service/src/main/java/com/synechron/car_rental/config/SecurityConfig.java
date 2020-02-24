package com.synechron.car_rental.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class SecurityConfig {
	
	@Bean
	public RequestInterceptor basicAuthRequestInterceptor(){
		return new BasicAuthRequestInterceptor("india","india");
	}
	
}

