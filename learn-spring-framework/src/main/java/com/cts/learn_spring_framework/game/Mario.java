package com.cts.learn_spring_framework.game;

public class Mario implements GamingConsole {

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go into hole");
	}
	
	public void right() {
		System.out.println("Move Forward");
	}
	
	public void left() {
		System.out.println("Move Backward");
	}
}
