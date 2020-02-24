package com.synechron.car_rental.controllers;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.synechron.car_rental.entity.User;
import com.synechron.car_rental.repository.UserLoginRepository;

@Controller
public class UserLoginController {
	
	@Autowired
	private User user;
	
	@Autowired
	private ModelAndView modelView;
	
	@Autowired
	private UserLoginRepository userRepo;
	
	@Autowired
	private HttpSession session;
	
	@GetMapping(path = "/")
	public ModelAndView init(Model model) {
		modelView.setViewName("login");
		modelView.addObject("mainHeading","Sai Travel Agency");
		model.addAttribute("command", user);
//		session.invalidate();
		return modelView;
	}
	
	
	@GetMapping("/login")
	public String initUserLogin(Model model) {
		User usr = (User)session.getAttribute("loggedUser");
		if(usr != null) {
			model.addAttribute("command", usr);
			System.out.println(usr);
		} else {
			model.addAttribute("command", user);
			session.invalidate();
		}
		return "success";
	}
	
	
	@PostMapping("/login")
	public String userLogin(@ModelAttribute("command") User user, HttpSession session) {
		String response;
		Optional<User> foundUser = userRepo.findById(user.getLoginId());
		if(foundUser.isPresent()) {
			User usr = foundUser.get();
			modelView.addObject("loggedUser", usr);
			modelView.addObject("fullname", usr.getUserName());	
			session.setAttribute("loggedUser",  usr);
			response = "success";
		} else {
			session.invalidate();
			response = "login";
		}		
		return response;
	}
}
