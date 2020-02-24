package com.example.demo.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tour {

	@Range(min=1, max=1000, message = "Tour Id should be 1 to 1000")
	private long tourId;
	
	@Length(min=3, max=10, message = "Tour Name should be 3 to 10")
	private String tourName;
	private int duration;
	private double price;
}
