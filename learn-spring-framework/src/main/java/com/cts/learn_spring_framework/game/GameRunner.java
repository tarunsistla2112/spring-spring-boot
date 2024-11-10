package com.cts.learn_spring_framework.game;

public class GameRunner {

	GamingConsole m;
	
	public GameRunner(GamingConsole m){
		this.m = m;
	}
	
	public void run() {
		System.out.println("Running Game:"+ m);
		m.up();
		m.down();
		m.left();
		m.right();
	}
}
