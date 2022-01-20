package com.sky.lol.control;

import com.sky.lol.data.string.Str;
import com.sky.lol.data.user.User;
import com.sky.lol.img.Entrance;



public class Game {
	String cmd = "";
	public void start() {
		Entrance.show();
		User.characterName = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		String s = String.format("당신의 이름은 %s 입니다~", User.characterName);
		System.out.println(s);
	}

}

