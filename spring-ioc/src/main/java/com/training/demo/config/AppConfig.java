package com.training.demo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.training.demo.domains.Product;

@Configuration
public class AppConfig {

	@Bean
//	@Lazy
//	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Product tv() {
		System.out.println("Factory Method Called");
		Product tv = new Product();
		tv.setProductId(1001);
		tv.setProductName("LG");
		tv.setImageRef("/images/lg.jpg");
		tv.setRatePerUnit(51000.00);
		return tv;
	}

}
