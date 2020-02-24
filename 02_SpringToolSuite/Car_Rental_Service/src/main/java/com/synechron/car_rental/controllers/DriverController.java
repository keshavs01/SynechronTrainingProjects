package com.synechron.car_rental.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.synechron.car_rental.entity.Driver;
import com.synechron.car_rental.repository.DriverRepository;

@Controller
public class DriverController {
	
	@Autowired
	private ModelAndView modelView; 
	
	@Autowired
	private DriverRepository driverRepo;
	
	
	@GetMapping("/addUpdateDriver")
	public ModelAndView updateDariver(@Valid @ModelAttribute Driver driver, @RequestParam("driverid") Optional<Integer> driverid) {
		if(driverid.isPresent()) {
			driver = driverRepo.getOne(driverid.get());
			modelView.addObject("isEdit", true);
		}
		modelView.setViewName("addUpdateDriver");
		modelView.addObject("command", driver);
		System.out.println("*******===INITIAL DATA===+++"+driver);
		return modelView;		
	}
	
	@PostMapping("/addUpdateDriver")
	public String addDriver(@ModelAttribute Driver driver) {
		driverRepo.save(driver);
		return "redirect:/viewDrivers";
	}
	
	@GetMapping("/viewDrivers")
	public String viewDrivers(Model model) {
		String response;		
		List<Driver> foundDriversList = driverRepo.findAll();
		if(foundDriversList.size() > 0 ) {
			model.addAttribute("driversList", foundDriversList);
//			model.addAttribute("isSearch",false);
			response = "viewDrivers";
		} else {
			response = "viewDrivers";
		}
		return response;
	}
	
	@GetMapping("/deleteDriver")
	public String deleteDriver(Driver driver, @RequestParam("driverid") Optional<Integer> driverid) {
		if(driverid.isPresent()) {
			driver = driverRepo.getOne(driverid.get());
		}
		driverRepo.delete(driver);
		return "redirect:/viewDrivers";
	}
	
	@PostMapping("/searchDriver")
	public String searchDriverByCity(Model model,@RequestParam("search") String city) {
//		System.out.println("City"+city);
		List<Driver> drvr = driverRepo.findByCityContaining(city);
		model.addAttribute("driversList", drvr);
		return "viewDrivers";
	}
	
	@GetMapping("/searchDriver")
	public String searchDriverByCity(Model model, @ModelAttribute("command") List<Driver> drvr) {
		System.out.println(drvr);
		model.addAttribute("driversList", drvr);
//		model.addAttribute("isSearch",true);
		return "viewDrivers";
	}	
}
