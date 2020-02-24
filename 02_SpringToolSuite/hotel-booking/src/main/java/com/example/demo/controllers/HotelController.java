package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Hotel;
import com.example.demo.repos.HotelRepository;

import lombok.Setter;

@Controller
@Setter
public class HotelController {
	
	@Autowired
	private Hotel hotel;
	
	@Autowired
	private HotelRepository repo;
	
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping(path="/")
	public ModelAndView init() {
		mdlView.setViewName("index");
		mdlView.addObject("mainHeading","Sai Travel Agency");
		return mdlView;
	}
	
	@GetMapping(path = "/addHotel")
	public String initForm(Model model) {
		model.addAttribute("command", hotel);
		return "addHotel"; // Name of the file to be returend on

	}

	@PostMapping(path = "/addHotel")
	public String initSubmit(@Valid @ModelAttribute("command") Hotel hotel) {
		repo.save(hotel);
		return "success";

	}
	

}
