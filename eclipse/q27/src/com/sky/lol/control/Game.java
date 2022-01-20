package com.sky.lol.control;

import com.sky.lol.data.string.Str;
import com.sky.lol.data.user.User;
import com.sky.lol.img.Entrance;

public class Game {
	String cmd = "";
	public void start() {
		Entrance.show();
		//케릭터 이름 입력
		User.characterName = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		//케릭터 성별 입력
		User.characterSex = Command.getCommand(Str.CMD_GUIDE_CHARACTER_SEX_INPUT);
		//케릭터 직업 입력
		User.characterClas = Command.getCommand(Str.CMD_GUIDE_CHARACTER_CLAS_INPUT);
		//케릭터 정보 출력
		String s = String.format("당신의 이름은 %s 입니다~\n", User.characterName);
		s += String.format("당신의 성별은 %s 입니다~\n", User.characterSex);
		s += String.format("당신의 직업은 %s 입니다~", User.characterClas);
		System.out.println(s);
	}
}