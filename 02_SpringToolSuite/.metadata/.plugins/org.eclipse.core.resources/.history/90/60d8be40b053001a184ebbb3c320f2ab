package com.synechron.car_rental.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.synechron.car_rental.entity.CibilScore;


@FeignClient("CIBIL-SCORE-SERVICE")
@Service
public interface CibilScoreClient {
	
	
	@RequestMapping(path="/api/v1/cibilscore", method=RequestMethod.GET)
	List<CibilScore> getAll();

}
