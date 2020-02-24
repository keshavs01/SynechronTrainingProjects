package com.synechron.loan_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CibilScore {

	private String panNumber;
	private String cardHolderName;
	private long pinCode;
	private long score;

}
