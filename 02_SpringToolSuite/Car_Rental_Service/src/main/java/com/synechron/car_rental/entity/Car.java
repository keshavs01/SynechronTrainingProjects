package com.synechron.car_rental.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cardetails")
public class Car {

	@Id
	@Column(name = "carid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int carId;
	
	@Column(name = "carname")
	private String carName;
		
	private int rating;	

	@ManyToOne(targetEntity=Category.class)	
	@JoinColumn(name="categoryid", referencedColumnName = "categoryid") // name = your coulumn name
	private Category category;
	
	
}
