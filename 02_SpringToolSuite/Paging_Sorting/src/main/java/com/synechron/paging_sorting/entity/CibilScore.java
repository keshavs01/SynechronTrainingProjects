package com.synechron.paging_sorting.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cibilscore")
public class CibilScore {

	@Id
	private String panNumber;
	private String cardHolderName;
	private long pinCode;
	private long score;

}
