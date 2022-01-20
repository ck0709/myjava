package com.sky.lol.data.user;

import com.sky.lol.data.monster.Goblin;
import com.sky.lol.util.Dice;
import com.sky.lol.util.So;

public class User {
	static public String name = "";
	public static String sex;
	public static String job;
	public static int currentHp = 200;
	public static int maxHp = 200;
	public static int atk = 12;
	static public void info() {
		So.p("[<"+name+">("+currentHp+"/"+maxHp+")]");
	}
	static public void attack(Goblin goblin) {
		int damage = Dice.getDice(atk);	//랜덤 데미지 계산
		goblin.currentHp -= damage;	//데미지 처리
		So.pl(name + " 이(가) " + goblin.name + " 에게 " + damage + " 피해를 입혔습니다."); //출력
	}
}