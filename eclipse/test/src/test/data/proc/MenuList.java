package test.data.proc;

import java.util.ArrayList;

import test.data.Menu;

public class MenuList {
	public void proc(ArrayList<Menu> menus) {
		System.out.println("　　　　　　　　　　메 뉴 목 록");
		for (Menu m : menus) 
			m.info();
		}	
}