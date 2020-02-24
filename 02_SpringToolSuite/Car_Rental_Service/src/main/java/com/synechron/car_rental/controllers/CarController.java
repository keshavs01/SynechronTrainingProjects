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

import com.synechron.car_rental.entity.Car;
import com.synechron.car_rental.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	private CarRepository carRepo;
	
	@Autowired
	private CarCategoryController categoryController;
	
	@Autowired
	private ModelAndView modelView;
	
	public Optional<Car> getCar(Integer id) {
		return carRepo.findById(id);
	}
	
	public List<Car> getAllCars() {
		return carRepo.findAll();
	}
	
	@GetMapping("/addUpdateCar")
	public ModelAndView updateCar(@Valid @ModelAttribute Car car, @RequestParam("carid") Optional<Integer> carid) {
		
		if(carid.isPresent()) {
			car = carRepo.getOne(carid.get());
			modelView.addObject("isEdit", true);	
		}		
		modelView.setViewName("addUpdateCar");
		modelView.addObject("command", car);
		modelView.addObject("category", categoryController.getAllCategory());
		System.out.println("*******===INITIAL DATA===+++"+car);
		return modelView;		
	}
	
	@PostMapping("/addUpdateCar")
	
	
	public String addCar(@ModelAttribute Car car) {
		System.out.println(car);
		carRepo.save(car);
		return "redirect:/viewCars";
	}
	
	@GetMapping("/viewCars")
	public String viewCars(Model model) {		
		List<Car> foundCarsList = carRepo.findAll();
		model.addAttribute("isSearch",false);
		model.addAttribute("carsList", foundCarsList);
		return "viewCars";
	}
	
	@GetMapping("/deleteCar")
	public String deleteCar(Car car, @RequestParam("carid") Optional<Integer> carid) {
		if(carid.isPresent()) {
			car = carRepo.getOne(carid.get());
		}
		System.out.println(car);
		carRepo.delete(car);
		return "redirect:/viewCars";
	}
}
