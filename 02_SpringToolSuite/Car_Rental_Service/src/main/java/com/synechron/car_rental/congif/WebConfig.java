package com.synechron.car_rental.congif;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.synechron.car_rental.entity.Driver;
import com.synechron.car_rental.entity.Payment;
import com.synechron.car_rental.entity.Trip;
import com.synechron.car_rental.entity.User;

@Service
public class WebConfig {		
	@Bean
	public ModelAndView modelView() {
		return new ModelAndView();
	}
	
	@Bean
	public User user() {
		return new User();
	}
	
	@Bean
	public Trip trip() {
		return new Trip();
	}
	
	@Bean
	public Payment payment() {
		return new Payment();
	}
	
	@Bean
	public Driver driver() {
		return new Driver();
	}
}
