package com.sky.lol.control;

import com.sky.lol.img.Entrance;
import com.sky.lol.data.string.Str;

public class Game {
	String cmd = "";
	public void start() {
		Entrance.show();
		
		String cmd = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		
		System.out.println(cmd);
	}

}

