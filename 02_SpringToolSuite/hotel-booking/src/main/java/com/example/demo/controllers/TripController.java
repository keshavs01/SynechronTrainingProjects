package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Client;
import com.example.demo.entity.Trip;
import com.example.demo.repos.TripRepository;


@Controller
public class TripController {
	
	@Autowired
	private Trip trip;
	
	@Autowired
	private TripRepository repo;
	
	@Autowired
	@Qualifier("ram")
	private Client ram;
	
	@Autowired
	@Qualifier("shyam")
	private Client shyam;
	
	@GetMapping(path="/addTrip")
	public String addTrip() {
		System.out.println(this.trip.getClientList());
		this.trip.getClientList().add(ram);
		this.trip.getClientList().add(shyam);
		this.repo.save(this.trip);
		return "success";
	}
	

}
