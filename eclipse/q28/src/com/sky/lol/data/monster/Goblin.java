package com.sky.lol.data.monster;

public class Goblin {
	String name;
	int currentHp;
	int maxHp;
	int atk;
	
	public Goblin(String name, int currentHp, int maxHp, int atk) {
		this.name = name;
		this.currentHp = currentHp;
		this.maxHp = maxHp;
		this.atk = atk;
	}

	public void info() {
		System.out.print("[<"+name+">("+currentHp+"/"+maxHp+")]");
	}
}
