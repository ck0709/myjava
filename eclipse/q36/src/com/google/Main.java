package com.google;

import com.google.sky.display.Title;
import com.google.sky.data.Member;


public class Main {
	
	public static void main(String[] args) {
		Title.show();
		
		Member m1 = new Member(" 두부"," 010-1234-1234"," 남");
		Member m2 = new Member(" 콩이"," 010-1111-2222"," 여");
		
		m1.info();
		m2.info();
		m1.setName(" 비지");
		m1.setSex(" 남");
		m1.setTel(" 010-2222-3333");
		m1.info();
		
		System.out.println("게터로 찍은거\n"+"이름:"+m1.getName()
							+" 전화번호:"+m1.getTel()
							+" 성별:"+m1.getSex());
	}

}
