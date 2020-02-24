package com.synechron.loan_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class WebConfig {
	
	@Bean
	public RequestInterceptor basicAuthRequestInterceptor(){
		return new BasicAuthRequestInterceptor("india","india");
	}

}
