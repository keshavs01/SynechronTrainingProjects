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
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tripdetails")
@NoArgsConstructor
@AllArgsConstructor
public class Trip {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tripid")
	private int tripId;

	@Column(name = "triporigin")
	private String tripOrigin;

	@Column(name = "tripdestination")
	private String tripDestination;

	@OneToOne(targetEntity = User.class)
	@JoinColumn(name = "userid", referencedColumnName = "id")
	private User user;

	@OneToOne(targetEntity = Car.class)
	@JoinColumn(name = "carid", referencedColumnName = "carid")
	private Car car;

	@Autowired
	@OneToOne(targetEntity = Driver.class)
	@JoinColumn(name = "driverid", referencedColumnName = "driverid")
	private Driver driver;

	@OneToOne(targetEntity = Payment.class, cascade=CascadeType.REMOVE)
	@JoinColumn(name = "paymentid", referencedColumnName = "paymentid")
	private Payment payment;
	
	@Transient
	private Category category;
	
	@Transient	
	private double amount = 0;
	
	@Transient
	private double discount = 0;

}
