package com.synechron.car_rental.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="driverdetails")
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "driverid")
	private int driverId;
	
	@Column(name = "drivername")
	private String driverName;
	private int rating;
	private String city;
	private long mobile;
	

	@OneToOne(targetEntity = Payment.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "paymentid", referencedColumnName = "paymentid")
	private Payment paymentId;

}
