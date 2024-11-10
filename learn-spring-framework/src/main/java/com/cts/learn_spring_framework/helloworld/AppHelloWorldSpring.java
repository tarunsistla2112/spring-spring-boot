package com.cts.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {

	public static void main(String[] args) {
		// Step-1: Launch a spring context
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		// Step-2: Configure the things that we want spring to manage - @Configuration
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean(Address.class));
		}
		
	}
}
