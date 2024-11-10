package com.cts.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

import com.cts.learn_spring_framework.game.*;


public class App01GamingBasic {
	
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		context.getBean(Mario.class).up();
	}


}