package com.sky.lol.control;

import java.util.Scanner;

public class Game {
	String cmd = "";
	public void start() {
		System.out.println("명령을 입력해주세요:");
		try (Scanner sc = new Scanner(System.in)) {
			cmd = sc.next();
		}
		System.out.println(cmd);
	}

}

