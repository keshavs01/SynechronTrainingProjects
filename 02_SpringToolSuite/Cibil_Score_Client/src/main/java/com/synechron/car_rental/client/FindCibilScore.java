package com.synechron.car_rental.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class FindCibilScore {

	@Autowired
	private RestTemplate template;
	
	private String url = "http://localhost:2020/api/v1/cibilscore/";

	public String getScores() {
		String resp = template.getForObject(url, String.class);
		return resp;
	}
	
	public String addScore(CibilScore score) {
		//Object return only Object itself
//		CibilScore resp = template.postForObject(url, score, CibilScore.class);
		
		//Response is returned from which we have to get the body
		//It returns others things like response code
		CibilScore resp = template.postForEntity(url, score, CibilScore.class).getBody();
		return resp.toString();
	}

}
