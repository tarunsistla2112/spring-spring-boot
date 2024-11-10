package com.cts.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole mario() {
		return new Mario();
	}
	
}
