package com.sky.lol.control;

import com.sky.lol.img.Entrance;

public class Game {
	String cmd = "";
	public void start() {
		Entrance.show();
		
		String cmd = Command.getCommand("명령을 입력해주세요:");
		
		System.out.println(cmd);
	}

}

