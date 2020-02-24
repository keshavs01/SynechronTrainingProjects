package com.synechron.car_rental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CarRentalServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CarRentalServiceApplication.class, args);
		
		
//		TripController ctr = ctx.getBean(TripController.class);
//		CarController carCtr = ctx.getBean(CarController.class);
//		DriverController dvrCtr = ctx.getBean(DriverController.class);
//		PaymentController pymntCtr = ctx.getBean(PaymentController.class);
//		
//		UserLoginRepository userCtr = ctx.getBean(UserLoginRepository.class);
//		
//		User usr = new User();
//		usr.setLoginId("1234");
//		usr.setPassword("1234");
//		usr  = userCtr.findById("1234").get();
//		
//		Optional<Car> car = carCtr.getCar(1);
//		
//		
//		Driver dvr = new Driver();
//		
//		
//		
//		dvr.setDriverId(2);
//		dvr.setDriverName("Chanda");
//		dvr.setRating(5);
//		dvr.setCity("Wagholi");
//		dvr.setMobile(909090);
//		
//		System.out.println("USER*************");
//		System.out.println(usr);
//		System.out.println("CAR*************");
//		System.out.println(car);
//		System.out.println("DRIVER*************");
//		System.out.println(dvr);
//		
//		
//		
//		
//		Payment pymnt = new Payment();
//		System.out.println("*********Payment ID******"+pymnt.getPaymentId());
//		pymnt.setAmount(100);	
//		pymnt.setUser(usr);		
//		System.out.println("Payment CALLED================"+pymnt);
		
		System.out.println("++++++++++++   +++++++++++++++");
//		System.out.println(dvrCtr.searchDriverByCity("pune"));
		
	}

}
