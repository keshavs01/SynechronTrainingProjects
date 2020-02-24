package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Client;
import com.example.demo.entity.Hotel;
import com.example.demo.entity.Trip;

@Configuration
public class WebConfig {
	
	@Bean
	public ModelAndView mdlView() {
		return new ModelAndView();
	}
	
	@Bean
	public Hotel hotel() {
		return new Hotel();
	}
	
	@Bean
	public Client ram() {
		return new Client(101, "Ram");
	}
	
	@Bean
	public Client shyam() {
		return new Client(102, "Shyam");
	}
	
	@Bean
	public Trip trip() {
		Trip x =  new Trip();
		x.setAmount(11);
		x.setTripId(22);
		x.setTripName("Malaysia");
		return x;
	}
}
