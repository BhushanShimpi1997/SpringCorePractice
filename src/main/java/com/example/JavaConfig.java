package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class JavaConfig {

	@Bean
	public Address address() {
		Address address = new Address();
		address.setCityName("Thalner");
		address.setPinCode(425421);
		address.setStreetName("Gov hospital near bus stand");
		
		return address;
	}
}
