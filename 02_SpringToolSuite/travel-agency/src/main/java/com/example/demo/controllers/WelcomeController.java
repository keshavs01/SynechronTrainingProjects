package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@Autowired
	private ModelAndView mdlView;

	@GetMapping("/")
	public ModelAndView init() {
		mdlView.setViewName("index");
		mdlView.addObject("mainHeading", "Sai Travel Agency");
		return mdlView;
	}

}
