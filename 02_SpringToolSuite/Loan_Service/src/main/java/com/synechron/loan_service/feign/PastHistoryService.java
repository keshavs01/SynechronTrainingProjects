package com.synechron.loan_service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("PAST-LOAN-SERVICE")
@Service
public interface PastHistoryService {

	@RequestMapping(path = "/api/loan/history/{id}", method = RequestMethod.GET)
	List<String> getHistory(@PathVariable("id") int id);

}
