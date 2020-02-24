package com.example.demo.config;

import java.time.LocalDate;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter.DataWithMediaType;

import com.example.demo.domains.Address;
import com.example.demo.domains.Payment;
import com.example.demo.domains.PaymentRegister;
import com.example.demo.domains.Tour;
import com.example.demo.domains.TouristGuid;

@Configuration
public class AppConfig {

	// Setter Dependency Injection
	@Bean
	public Tour malaysia() {
		Tour malaysia = new Tour();
		malaysia.setTourId(101);
		malaysia.setPrice(2300);
		malaysia.setTourName("Malaysia Tour");
		malaysia.setDuration(4);
		return malaysia;

	}

	// Constructor Dependency Injection
	@Bean
	public Tour thailand() {
		// Passing Reference of One Bean to Another Bean -- Earlier using ref in old
		// version
		return new Tour(201, "Thailand", 21, 65300.9, tourGuide());
	}

	@Bean
	public TouristGuid tourGuide() {
		return new TouristGuid(33, "Aman Singh", 96752222);
	}

	@Bean
	public Address billingAddress() {
		Address address = new Address();
		address.setAddressLine1("Rajiv Street");
		address.setAddressLine2("New Balewadi bridge");
		address.setCity("Chennai");
		address.setPinCode(411006);
		return address;
	}

	@Bean
	public Address shippingAddress() {
		Address address = new Address();
		address.setAddressLine1("Vishrantwadi");
		address.setAddressLine2("Pune");
		address.setCity("Pune");
		address.setPinCode(411006);
		return address;
	}

	@Bean
	public Payment hexaware() {
		return new Payment(10, "Hexaware", 450000, LocalDate.of(2020, 1, 1));
	}

	@Bean
	public Payment siemens() {
		return new Payment(11, "Siemens", 750000, LocalDate.of(2010, 5, 22));
	}

	@Bean(autowireCandidate = false) // Bean wont be included in list of autowired
	public Payment ibm() {
		return new Payment(12, "IBM", 855000, LocalDate.of(2020, 11, 25));
	}

	@Bean
	public PaymentRegister register() {
		PaymentRegister register = new PaymentRegister();
		register.setId(111);
		register.setPeriod("2012-30");
		return register;
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		//Builder Pattern is used
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	public JdbcTemplate template() {
//		Passing reference of One bean to another
		return new JdbcTemplate(dataSource());
		
	}

}
