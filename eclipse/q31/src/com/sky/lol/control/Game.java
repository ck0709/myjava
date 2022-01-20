package com.sky.lol.control;

import com.sky.lol.data.monster.Goblin;
import com.sky.lol.data.monster.Orc;
import com.sky.lol.data.string.Str;
import com.sky.lol.data.user.User;
import com.sky.lol.img.Entrance;
import com.sky.lol.util.So;

public class Game {
	Goblin goblin1;
	public void start() {
		Entrance.show();
		//케릭터 이름 입력
		User.name = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		//케릭터 성별 입력
		User.sex = Command.getCommand(Str.CMD_GUIDE_CHARACTER_SEX_INPUT);
		//케릭터 직업 입력
		User.job = Command.getCommand(Str.CMD_GUIDE_CHARACTER_CLAS_INPUT);
		//케릭터 정보 출력
		String s = String.format("당신의 이름은 %s 입니다~\n", User.name);
		s += String.format("당신의 성별은 %s 입니다~\n", User.sex);
		s += String.format("당신의 직업은 %s 입니다~", User.job);
		So.pl(s);
		
		//몹 생성
		Orc orc1 = new Orc("오크전사",100,100,10);
		Orc orc2 = new Orc("오크전사",100,100,10);
		goblin1 = new Goblin("고블린병사",50,50,5);
		Goblin goblin2 = new Goblin("고블린병사",50,50,5);
		Goblin goblin3 = new Goblin("고블린병사",50,50,5);
		orc1.info();
		orc2.info();
		goblin1.info();
		goblin2.info();
		goblin3.info();
		System.out.println("");
		
		gameRun();
	}
	
	private void gameRun() {
		
		//게임 시작
		boolean isNotEnd = true;
		while(isNotEnd) {
			//유저 정보 출력
			User.info();
			String cmd = Command.getCommand("");
			switch(cmd) {
			case "exit":
				isNotEnd = false;
				break;
			case "쳐":
				procBattle();
				break;
			}
		}
		
		gameOver();
	}
	
	private void procBattle() {

		goblin1.attack();	//고블린1의 공격처리

		User.attack(goblin1);
	}

	private void gameOver() {
		So.p(Str.MSG_GAME_OVER);
	}
}