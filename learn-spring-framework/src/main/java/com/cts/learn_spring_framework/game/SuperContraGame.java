package com.cts.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("Move Up");
	}
	
	public void down() {
		System.out.println("Move down");
	}
	
	public void right() {
		System.out.println("Shoot");
	}
	
	public void left() {
		System.out.println("Move Left");
	}
}
