package com.sky.lol.control;

import com.sky.lol.data.string.Str;
import com.sky.lol.data.user.User;
import com.sky.lol.img.Entrance;
import com.sky.lol.data.monster.Goblin;
import com.sky.lol.data.monster.Orc;


public class Game {
	public void start() {
		Entrance.show();
		//케릭터 이름 입력
		User.characterName = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		//케릭터 성별 입력
		User.characterSex = Command.getCommand(Str.CMD_GUIDE_CHARACTER_SEX_INPUT);
		//케릭터 직업 입력
		User.characterJob = Command.getCommand(Str.CMD_GUIDE_CHARACTER_CLAS_INPUT);
		//케릭터 정보 출력
		String s = String.format("당신의 이름은 %s 입니다~\n", User.characterName);
		s += String.format("당신의 성별은 %s 입니다~\n", User.characterSex);
		s += String.format("당신의 직업은 %s 입니다~", User.characterJob);
		System.out.println(s);
		
		//todo
		//월드 준비
		
		//몹 생성
		Orc orc1 = new Orc("오크전사",100,100,10);
		Orc orc2 = new Orc("오크전사",100,100,10);
		Goblin goblin1 = new Goblin("고블린병사",50,50,5);
		Goblin goblin2 = new Goblin("고블린병사",50,50,5);
		Goblin goblin3 = new Goblin("고블린병사",50,50,5);
		orc1.info();
		orc2.info();
		goblin1.info();
		goblin2.info();
		goblin3.info();
		
		System.out.println("");
		
		//유저 정보 출력
		User.info();
		
		//todo
		//게임 시작
		boolean isNotEnd = true;
		while(isNotEnd) {
			String cmd = Command.getCommand("");
			switch(cmd) {
			case "exit":
				isNotEnd = false;
				break;
			}
		}
		
		gameOver();
	}
	
	private void gameOver() {
		System.out.println(Str.MSG_GAME_OVER);
	}
	
}
