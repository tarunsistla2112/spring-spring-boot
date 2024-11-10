package com.cts.learn_spring_framework;

import com.cts.learn_spring_framework.game.*;


public class AppGamingBasic {
	
	public static void main(String[] args) {
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}


}