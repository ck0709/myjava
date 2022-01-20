package com.sky.lol.data.monster;

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
		System.out.print("[<"+name+">("+currentHp+"/"+maxHp+")]");
	}	
}