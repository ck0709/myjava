package com.google;

import java.util.ArrayList;

import com.google.sky.data.Member;


public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("두부", "010-1111-2222", "남"));
		members.add(new Member("콩이", "010-2222-3333", "남"));
		members.add(new Member("비지", "010-3333-4444", "남"));
		members.add(new Member("냥이", "010-4444-5555", "남"));
		members.add(new Member("펀치", "010-5555-6666", "남"));
		members.add(new Member("멍이", "010-6666-7777", "남"));
		members.add(new Member("살구", "010-7777-8888", "남"));
		members.add(new Member("멍뭉", "010-8888-9999", "남"));
		
	
		for(Member m:members) {
			m.info();
		}
		
	}
}
