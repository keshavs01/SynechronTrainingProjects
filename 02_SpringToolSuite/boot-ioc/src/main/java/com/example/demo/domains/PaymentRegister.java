package com.example.demo.domains;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class PaymentRegister {
	
	private long id;
	private String period;
	
	@Autowired
	private List<Payment> paymentList;

}
