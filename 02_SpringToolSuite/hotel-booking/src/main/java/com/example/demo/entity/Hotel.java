package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="hotel")
@Data

public class Hotel {
	
	@Id
	private int hotelCode;
	private String hotelName;
	private String image;
	
}
