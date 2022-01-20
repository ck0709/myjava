package com.google;

import java.util.ArrayList;
import java.util.Scanner;

import com.google.sky.data.Member;
import com.google.sky.data.MemberReg;
import com.google.sky.data.MemberList;
import com.google.sky.data.MemberDel;
import com.google.sky.data.MemberEdit;
import com.google.sky.data.Exit;
import com.google.sky.display.Title;

public class Sky {
	void proc() {
		// 회원정보 입력
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("홍길동", "010-1234-5678", "남자"));
		members.add(new Member("이순신", "010-1234-5678", "남자"));
		members.add(new Member("강감찬", "010-1234-5678", "남자"));
		members.add(new Member("정약용", "010-1234-5678", "남자"));
		members.add(new Member("임꺽정", "010-1234-5678", "남자"));
		members.add(new Member("이이", "010-1234-5678", "남자"));
		members.add(new Member("이성계", "010-1234-5678", "남자"));

		System.out.println(Title.TITLE);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean isNotEnd = true;
		while (isNotEnd) {
			System.out.print("명령을 입력: (1.회원 추가 / 2.회원목록 보기 / 3.회원삭제 / 4.회원수정 / e.프로그램 종료)");
			String cmd = sc.next();
			switch (cmd) {
			case "1": // 회원등록
				MemberReg memberReg = new MemberReg();
				memberReg.proc(members);
				break;
			case "2": // 회원목록
				MemberList memberList = new MemberList();
				memberList.proc(members);				
				break;
			case "3": // 회원삭제
				MemberDel memberDel = new MemberDel();
				memberDel.proc(members);	
				break;
			case "4": // 회원수정
				MemberEdit memberEdit = new MemberEdit();
				memberEdit.proc(members);	
				break;
			case "e": // 프로그램 종료
				Exit exit = new Exit();
				exit.proc();	
				
				isNotEnd = false;	// 종료를 위한 변수 전달
				break;
			default:
				System.out.println("잘못된 명령입니다.");
				break;
			}
		}		
	}

}