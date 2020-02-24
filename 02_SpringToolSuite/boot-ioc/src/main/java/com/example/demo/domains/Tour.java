package com.example.demo.domains;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tour {
	
	private long tourId;
	@Length(min =3, max = 10)
	private String tourName;
	private int duration;
	private double price;
	
	private TouristGuid guide;

}
