package com.example.demo.domains;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TouristGuid {
	
	private int touristId;
	private String touristName;
	private int phone;

}
