package com.google.sky.data;

import java.util.ArrayList;

public class MemberList {
	public void proc(ArrayList<Member> members) {
		for (Member m : members) {
			m.info();
		}		
	}

}
