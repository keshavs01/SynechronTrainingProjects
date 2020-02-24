package com.example.demo.domains;

import lombok.Data;

@Data
public class Address {
	
	private String addressLine1;
	private String addressLine2;
	private String city;
	private long pinCode;

}
