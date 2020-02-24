package com.example.demo.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.daos.TourDao;
import com.example.demo.entity.Payment;
import com.example.demo.entity.Tour;

@Controller
public class TourController {

	@Autowired
	private Tour tour;

	@Autowired
	private TourDao dao;

	@Autowired
	private Payment payment;

	@GetMapping(path = "/addtrip")
	public String initForm(Model model) {
		model.addAttribute("command", tour);
		return "addTrip"; // Name of the file to be returend on

	}

	@PostMapping(path = "/addtrip")
	public String onSubmit(@Valid @ModelAttribute("command") Tour tour, BindingResult result) {

		String nextPage = "failure";
		if (result.hasErrors()) {
			nextPage = "addTrip";
		} else {
			long count = this.dao.add(tour);
			if (count == 1) {
				nextPage = "success";// Name of the file in which we have to go
			}
		}
		return nextPage;
	}

	@GetMapping(path = "/viewtrip")
	public String findAll(Model model) {
		List<Map<String, Object>> record = dao.findAll();
		model.addAttribute("tourList", record);
		return "viewtour";
	}

	@GetMapping(path = "/addPayment")
	public String initPayment(Model model) {
		model.addAttribute("command", payment);
		return "addPayment";
	}

	@PostMapping(path = "/addPayment")
	public String savePayment(@Valid @ModelAttribute("command") Payment paymnt, BindingResult results) {

		String nextPage = "failure";
//		System.out.println("++++++" + results.hasErrors());
		if (results.hasErrors()) {
			nextPage = "addPayment";
		} else {
			long count = this.dao.addPayment(paymnt);
			if (count == 1) {
				nextPage = "success";// Name of the file in which we have to go
			}
		}
		return nextPage;
	}

}
