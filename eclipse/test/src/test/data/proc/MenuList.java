package test.data.proc;

import java.util.ArrayList;

import test.data.Menu;

public class MenuList {
	public void proc(ArrayList<Menu> menus) {
		for (Menu m : menus) 
			m.info();
		}	
}