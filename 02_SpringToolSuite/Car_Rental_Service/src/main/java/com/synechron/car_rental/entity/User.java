package com.synechron.car_rental.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Table(name="logindetails")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Id
	@Column(name = "loginid")
	private String loginId;
	
	@Column(name = "fullname")
	private String userName;
	
	@Column(name = "emailid")
	private String emailId;
	
	@Column(name = "isadmin", columnDefinition = "boolean default false")
	private Boolean isAdmin;
	
	@Column(name = "mobile")
	private long mobileNo;
	
	@Column(name = "password")
	private String password;	

}
