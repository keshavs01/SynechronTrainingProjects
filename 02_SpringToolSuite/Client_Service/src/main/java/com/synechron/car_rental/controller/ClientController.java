package com.synechron.car_rental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.car_rental.entity.CibilScore;
import com.synechron.car_rental.feign.CibilScoreClient;

@RestController
@CrossOrigin(origins="*")
public class ClientController {
	
	@Autowired
	public CibilScoreClient clientService;
	
	@GetMapping(path="/scores")
	public List<CibilScore> getScores(){
		return this.clientService.getAll();
	}

}
