package com.google;

import java.util.ArrayList;
import java.util.Scanner;

import com.google.sky.display.Title;
import com.google.sky.data.Member;
import com.google.sky.data.MemberReg;
import com.google.sky.data.MemberList;
import com.google.sky.data.MemberDel;
import com.google.sky.data.Exit;
import com.google.sky.data.MemberEdit;



public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(Title.TITLE);

		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("두부", "010-1111-2222", "남"));
		members.add(new Member("콩이", "010-2222-3333", "남"));
		members.add(new Member("비지", "010-3333-4444", "남"));
		members.add(new Member("냥이", "010-4444-5555", "남"));
		members.add(new Member("펀치", "010-5555-6666", "남"));
		members.add(new Member("멍이", "010-6666-7777", "남"));
		members.add(new Member("살구", "010-7777-8888", "남"));
		members.add(new Member("멍뭉", "010-8888-9999", "남"));
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean isNotEnd = true;
		while (isNotEnd) {
			System.out.println("명령을 입력: (1.회원 추가 / 2.회원목록 보기 / 3.회원삭제 / 4.회원정보 수정 / e.프로그램 종료)");
			String cmd = sc.next();
			switch(cmd) {
			case "1":
				MemberReg memberReg = new MemberReg();
				memberReg.proc(members);
				break;
			case "2":
				MemberList memberList = new MemberList();
				memberList.proc(members);
			case "3":
				MemberDel memberDel = new MemberDel();
				memberDel.proc(members);
			case "4":
				MemberEdit memberEdit = new MemberEdit();
				memberEdit.proc(members);
			case "e":
				Exit exit = new Exit();
				exit.proc();
				
				isNotEnd = false;
				break;
			default:
				System.out.println("잘못된 명령입니다.");
				break;
			}
		}
		
		
	}
}
