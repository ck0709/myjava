package test.data.proc;

import java.util.ArrayList;
import java.util.Scanner;
import test.data.Menu;

public class MenuReg {
	public void proc(ArrayList<Menu> menus) {
		Scanner sc = new Scanner(System.in);
		System.out.println("　　　　　　　　　　메 뉴 추 가");
		System.out.println("메뉴이름을 입력하세요");
		String name = sc.next();
		System.out.println("메뉴종류를 입력하세요");
		String tel = sc.next();
		System.out.println("메뉴가격을 입력하세요");
		String sex = sc.next();
		Menu tempMember = new Menu(name,sex,tel);
		menus.add(tempMember);
		System.out.println("메뉴가 추가되었습니다");
	}
}