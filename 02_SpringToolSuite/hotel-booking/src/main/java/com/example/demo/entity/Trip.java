package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="trip")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trip {
	
	@Id
	private long tripId;
	private String tripName;
	private double amount;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="client_ref") // It will refer to primary key of other table
	private Set<Client> clientList = new HashSet<>();
		

}
