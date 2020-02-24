package com.example.demo.entity;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	
	@NotBlank(message="Customer ID cannot be blank")
	private String customerId;
	private String paymentMode;
	
	@Range(min=1, message = "Amount cannot be zero or less")
	private double amount;
	private LocalDate paymentDate;
	
}
