package com.synechron.car_rental.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "paymentid")
	private int paymentId;
	
	private double amount;
	private double discount;
	
	@OneToOne(targetEntity = User.class)
	@JoinColumn(name = "userid", referencedColumnName = "id")
	private User user;
	
	@OneToOne(targetEntity = Trip.class)
	@JoinColumn(name = "tripid", referencedColumnName = "tripid")
	private Trip trip;
	
	@OneToOne(targetEntity = Driver.class)
	@JoinColumn(name = "driverid", referencedColumnName = "driverid")	
	private Driver driver;

	
	@OneToOne(targetEntity = Offer.class)
	@JoinColumn(name = "offerid", referencedColumnName = "offerid")	
	private Offer offer;


	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", discount=" + discount + ", user=" + user
				+ ", driver=" + driver + ", offer=" + offer + "]";
	}

}
