package com.synechron.car_rental.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Offer {
	
	@Id
	@Column(name = "offerid")
	private int offerId;
	
	@Column(name = "offerdetails")
	private String offerDetails;
	
	@Column(name = "offercode")
	private String offerCode;

}
