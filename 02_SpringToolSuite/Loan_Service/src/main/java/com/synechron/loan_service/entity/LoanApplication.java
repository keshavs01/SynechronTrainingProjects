package com.synechron.loan_service.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="loanapplication")
public class LoanApplication {
	
	@Id
	public String loanId;
	public String customerName;
	public long phoneNumber;
	public Date applicationDate;
	public Double loanAmount;
	public String pandNumber;
	public String status;

}
