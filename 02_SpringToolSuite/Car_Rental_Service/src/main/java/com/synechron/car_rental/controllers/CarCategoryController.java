package com.synechron.car_rental.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.synechron.car_rental.entity.Category;
import com.synechron.car_rental.entity.User;
import com.synechron.car_rental.repository.CarCategoryRepository;

@Controller
public class CarCategoryController {
	
	@Autowired
	private CarCategoryRepository categoryRepo;
	
	@Bean
	public List<Category> getAllCategory() {
		return categoryRepo.findAll();
	}
	
	public Category getCategory(int id, @SessionAttribute("users") User user) {
		return categoryRepo.getOne(id);
		
	}

}
