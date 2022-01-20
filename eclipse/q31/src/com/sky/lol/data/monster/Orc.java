package com.sky.lol.data.monster;

import com.sky.lol.data.user.User;
import com.sky.lol.util.Dice;
import com.sky.lol.util.So;

public class Orc {
	String name;
	int currentHp;
	int maxHp;
	int atk;

	public Orc(String name, int currentHp, int maxHp, int atk) {
		super();
		this.name = name;
		this.currentHp = currentHp;
		this.maxHp = maxHp;
		this.atk = atk;
	}

	public void info() {
		So.p("[<"+name+">("+currentHp+"/"+maxHp+")]");
	}
	
	public void attack() {
		int damage = Dice.getDice(atk);	//랜덤 데미지 계산
		User.currentHp -= damage;	//데미지 처리
		So.pl(name + " 이" + User.name + " 에게" + damage + " 피해를 입혔습니다."); //출력
	}	
}