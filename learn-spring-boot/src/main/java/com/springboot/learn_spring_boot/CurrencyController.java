package com.springboot.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

	@Autowired
	private CurrencyConfiguration configuration;
	
	@RequestMapping("/currency-service")
	public CurrencyConfiguration getService() {
		return configuration;
	}

}
