package com.sky.lol.control;

import java.util.Scanner;

import com.sky.lol.util.So;

public class Command {
	
	static public String getCommand(String guide) {
		So.p(guide + ":");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	// 키보드 입력을 받게 하기 위한 객체 생성
		// sc.next() 함수가 호출되면 키보드 입력 대기 상태가 됨. (실행흐름이 여기서 잠시 멈춤)		
		String cmd = sc.next();	
		// 입력 후 엔터를 쳐서 입력이 끝나야 실행 흐름이 다시 시작됨.
		return cmd;
	}

}