package com.example.demo.entity;

import lombok.Data;

@Data
public class User {
	
	private String userId;
	private String userName;
	private String userPassword;
	private boolean isAdmin;

}
