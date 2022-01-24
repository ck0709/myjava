package test.data.proc;

import java.util.ArrayList;
import java.util.Scanner;

import test.data.Menu;

public class MenuEdit {
	
	public void proc(ArrayList<Menu>menus) {
		System.out.print("수정할 메뉴 이름을 입력:");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.next();
		int searchIndex = -1;
		//검색
		for(int i=0;i<menus.size();i++) {
			if(menus.get(i).getName().equals(searchName)) {
				searchIndex = i;
				break;
			}
		}				
		if(searchIndex == -1) {
			System.out.println(searchName + " 메뉴는 없습니다.");
		} else {
			//회원수정 처리
			//입력받기
			System.out.print("메뉴이름을 새로 입력해주세요:");
			String editName = sc.next();
			System.out.print("메뉴종류를 새로 입력해주세요:");
			String editSex = sc.next();
			System.out.print("메뉴가격을 새로 입력해주세요:");
			String editTel = sc.next();
			//입력 처리
			Menu m = menus.get(searchIndex);
			m.setName(editName);
			m.setSex(editSex);
			m.setTel(editTel);
			System.out.println(searchName + " 메뉴 정보가 수정되었습니다.");
		}				
	}
}