package com.cts.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

record Person(String name, int age, Address address) {}
record Address(String address, String State) {}
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Chari";
	}
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public Person person() {
		return new Person("Tarun", 24, new Address("Charminar", "Hyderabad"));
	}
	
	@Bean
	public Person person2(String name, int age, @Qualifier("present address")Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person3() {
		return new Person(name(), age(), address2());
	}
	
	@Bean
	@Primary
	public Address address() {
		return new Address("DNo: 43-107/28H-1, Vasistha Colony, Ajith Singh Nagar", "Andhra Pradesh");
	}
	
	@Bean
	@Qualifier("present address")
	public Address address2() {
		return new Address("Karapakkam", "Chennai");
	}
	
}
