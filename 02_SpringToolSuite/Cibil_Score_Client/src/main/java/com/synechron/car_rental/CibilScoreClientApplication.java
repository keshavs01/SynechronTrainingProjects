package com.synechron.car_rental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.synechron.car_rental.client.CibilScore;
import com.synechron.car_rental.client.FindCibilScore;

@SpringBootApplication
public class CibilScoreClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CibilScoreClientApplication.class, args);
		FindCibilScore scoreFinder = ctx.getBean(FindCibilScore.class);
		CibilScore score = ctx.getBean(CibilScore.class);
		score.setPanNumber("FPPPS123");
		score.setCardHolderName("Subhas Pandey");
		score.setPinCode(12333);
		
		System.out.println(scoreFinder.getScores());
		System.out.println(scoreFinder.addScore(score));
		ctx.close();
		
		
	}

}
