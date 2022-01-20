package com.sky.lol;

import com.sky.lol.control.Game;
import com.sky.lol.util.Dice;

public class Main {

	public static void main(String[] args) {
		System.out.println("주사위를 굴려서 "+Dice.getDice(6)+"이 나왔습니다.");
		Game game = new Game();
		game.start();
	}

}