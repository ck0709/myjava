package test.data.proc;

import java.util.ArrayList;
import java.util.Scanner;

import test.data.Menu;

public class MenuDel {
	public void proc(ArrayList<Menu> menus) {
		System.out.println("삭제할 메뉴 이름을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String delName = sc.next();
		int delIndex = -1;
		for(int i = 0; i<menus.size();i++) {
			if(menus.get(i).getName().equals(delName)) {
				delIndex = i;
				break;
			}
		}
		if(delIndex == -1) {
			System.out.println(delName + " 메뉴는 없습니다.");
		} else {
			menus.remove(delIndex);	// 삭제
			System.out.println(delName + " 메뉴 정보가 삭제되었습니다.");
		}
	}
}
