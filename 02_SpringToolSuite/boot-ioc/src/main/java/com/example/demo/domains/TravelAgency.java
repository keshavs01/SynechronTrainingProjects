package com.example.demo.domains;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("agency")
public class TravelAgency {
	
	@Value("Thomas Cook")
	private String agencyName;
	@Value("Thomas")
	private String owner;
	@Value("9854745230")
	private long mobileNumber;
	private LocalDate startDate;
	
	@Autowired
	@Qualifier("billingAddress")
	private Address address;

}
