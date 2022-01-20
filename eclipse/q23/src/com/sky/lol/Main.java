package com.sky.lol;

import com.sky.lol.control.Game;
import com.sky.lol.img.Entrance;

public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
		Entrance.show();
	}
	

}
