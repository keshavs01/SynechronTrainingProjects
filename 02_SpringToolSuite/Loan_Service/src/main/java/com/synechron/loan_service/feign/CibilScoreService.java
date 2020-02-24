package com.synechron.loan_service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.synechron.loan_service.entity.CibilScore;

@FeignClient("CIBIL-SCORE-SERVICE")
@Service
public interface CibilScoreService {
	
	@RequestMapping(path="/api/v1/cibilscore", method=RequestMethod.GET)
	List<CibilScore> getAll();
	
	@RequestMapping(path="/api/v1/cibilscore/{panId}", method=RequestMethod.GET)
	CibilScore getScoreByPanId(@PathVariable("panId") String panId);

}
