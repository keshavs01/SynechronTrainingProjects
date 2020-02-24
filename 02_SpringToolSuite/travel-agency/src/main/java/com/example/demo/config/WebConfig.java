package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Payment;
import com.example.demo.entity.Tour;

@Configuration
public class WebConfig {
	
	@Bean
	public ModelAndView mdlView() {
		return new ModelAndView();
	}
	
	@Bean
	public Tour tour() {
		return new Tour();
	}
	
	@Bean
	public Payment payment() {
		return new Payment();
	}

}
