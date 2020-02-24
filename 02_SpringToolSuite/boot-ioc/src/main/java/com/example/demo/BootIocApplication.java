package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.daos.TourDao;
import com.example.demo.domains.PaymentRegister;
import com.example.demo.domains.Tour;
import com.example.demo.domains.TouristGuid;
import com.example.demo.domains.TravelAgency;

@SpringBootApplication
public class BootIocApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIocApplication.class, args);
		Tour malaysia = ctx.getBean("malaysia",Tour.class);
		System.out.println(malaysia);
		Tour thailand = ctx.getBean("thailand",Tour.class);
		System.out.println(thailand);

		TravelAgency agency = ctx.getBean("agency",TravelAgency.class);
		System.out.println(agency);
		
		PaymentRegister pregister = ctx.getBean(PaymentRegister.class);
		System.out.println(pregister.getPeriod());
		pregister.getPaymentList().forEach(System.out::println);
		
		TourDao dao = ctx.getBean(TourDao.class);
		System.out.println(dao.findAll());
		
		System.out.println("Insert into Tour*****************");
		TouristGuid tguide = ctx.getBean("tourGuide", TouristGuid.class);
		System.out.println(dao.add(new Tour(21, "Dubai", 22, 50000, tguide)));
		System.out.println(dao.add(new Tour(22, "Malaysia", 42, 5000, tguide)));
		System.out.println(dao.add(new Tour(23, "Rajasthan", 1, 450000, tguide)));
		System.out.println(dao.add(new Tour(24, "america", 32, 5440000, tguide)));
		
		System.out.println("Remove Tour*****************");
		System.out.println(dao.remove(new Tour(22, "Dubai", 22, 50000, tguide)));
		
		System.out.println("Update Tour*****************");
		System.out.println("Total Updated Rows = "+dao.update(new Tour(21, "Dubai Dubai", 22, 50000, tguide)));
		
		ctx.close();
	}

}
