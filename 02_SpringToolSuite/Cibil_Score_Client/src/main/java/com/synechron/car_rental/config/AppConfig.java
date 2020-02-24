package com.synechron.car_rental.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.synechron.car_rental.client.CibilScore;
import com.synechron.car_rental.client.FindCibilScore;

@Configuration
public class AppConfig {

	@Bean
	public RestTemplate template() {
		RestTemplate template = new RestTemplate();
		template.getInterceptors().add(interceptor());
		return template;
	}
	
	@Bean
	public FindCibilScore scoreFinder() {
		return new FindCibilScore();
	}
	
	@Bean
	public BasicAuthenticationInterceptor interceptor() {
		return new BasicAuthenticationInterceptor("india", "india");
	}
	
	@Bean
	public CibilScore score() {
		return new CibilScore();
	}
	

}
