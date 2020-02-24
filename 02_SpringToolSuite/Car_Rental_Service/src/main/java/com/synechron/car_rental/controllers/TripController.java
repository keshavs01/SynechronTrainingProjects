package com.synechron.car_rental.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.synechron.car_rental.entity.Driver;
import com.synechron.car_rental.entity.Payment;
import com.synechron.car_rental.entity.Trip;
import com.synechron.car_rental.entity.User;
import com.synechron.car_rental.repository.TripRepository;

@Controller
public class TripController {
	
//	@Autowired
//	private Trip trip;
	
	@Autowired
	private ModelAndView modelView;
	
	@Autowired
	 private HttpSession session;
	
	@Autowired
	private TripRepository tripRepo;
	
	@Autowired
	private PaymentController paymntController;
	
	@Autowired
	private CarController carController;
	
	@Autowired
	private Payment payment;
	
	
	
	@GetMapping("/addUpdateTrip")
	public ModelAndView intiTripForm(@Valid @ModelAttribute Trip trip, @RequestParam("tripid") Optional<Integer> tripid) {
		
		if(tripid.isPresent()) {
			System.out.println("++++++++++++++++++"+tripid);
			trip = tripRepo.getOne(tripid.get());
			payment.setAmount(trip.getPayment().getAmount());
			payment.setDiscount(trip.getPayment().getDiscount());
			modelView.addObject("isEdit", true);
		}
		trip.setPayment(payment);
		trip.setUser((User)session.getAttribute("loggedUser"));
		System.out.println("++++++++++++++++++"+payment);
		System.out.println("++++++++++++++++++"+trip);
		modelView.setViewName("addUpdateTrip");
		modelView.addObject("command", trip);
		modelView.addObject("carCategory", carController.getAllCars());
		return modelView;
	}
	
	@PostMapping("/addUpdateTrip")
	public String addTripDetails(@ModelAttribute Trip trip) {
		String response;
		
		if((User)session.getAttribute("loggedUser") != null) {
			System.out.println("****************************");
			if(trip.getPayment() != null) { // Edit case
				payment.setPaymentId(trip.getPayment().getPaymentId());
			}			
			payment.setDiscount(trip.getPayment().getDiscount());
			payment.setAmount(trip.getPayment().getAmount());
			payment.setTrip(trip);
			paymntController.addPayment(payment);
			
			trip.setUser((User)session.getAttribute("loggedUser"));		
			trip.setPayment(payment);
			
//			tripRepo.flush();
			tripRepo.saveAndFlush(trip);
			
			response = "redirect:/viewTrips";
		} else {
			
			response = "redirect:";
		}
		return response;
		
	}	
	
	@GetMapping("/viewTrips")
	public String initTripDetails(Model model) {
		List<Trip> foundTripsList = tripRepo.findAll();
		model.addAttribute("tripsList", foundTripsList);
		return "viewTrips";
	}
	
	@GetMapping("/deleteTrip")
	public String deleteTrip(Trip trip, @RequestParam("tripid") Optional<Integer> tripid) {
		if(tripid.isPresent()) {
			trip = tripRepo.getOne(tripid.get());
		}
		tripRepo.delete(trip);
		return "redirect:/viewTrips";
	}

}
