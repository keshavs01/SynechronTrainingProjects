package com.synechron.car_rental.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.synechron.car_rental.entity.Payment;
import com.synechron.car_rental.repository.PaymentRepository;

@Controller
public class PaymentController {
	
	@Autowired
	private ModelAndView modelView;
	
	@Autowired
	private PaymentRepository paymentRepo;
	
	@PostMapping(path = "/addPayment")
	public void addPayment(Payment pymnt) {
		paymentRepo.saveAndFlush(pymnt);
//		paymentRepo.save(pymnt);
//		return "success";		
	}
	
	public Payment getPaymentById(int paymentId) {
		return paymentRepo.getOne(paymentId);
	}
	
	public Payment getPaymentByTripId(Integer tripId) {
		return paymentRepo.findByTripTripId(tripId);
	}
	
	
	@GetMapping(path = "/viewPayments")
	public String viewPayment(Payment pymnt) {
		String response;
		List<Payment> foundPaymentList = paymentRepo.findAll()
				.stream()
				.filter((eachPayment)->eachPayment.getUser().getId() == pymnt.getUser().getId())
				.collect(Collectors.toList());
		if(foundPaymentList.size() > 0 ) {
			modelView.addObject("PaymentList", foundPaymentList);	
			response = "viewPayments";
		} else {
			response = "viewPayments";
		}		
		return response;
	}

}
