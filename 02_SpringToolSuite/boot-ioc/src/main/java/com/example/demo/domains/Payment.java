package com.example.demo.domains;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	private long txnId;
	private String customerName;
	private double amount;
	private LocalDate paymentDate;

}
