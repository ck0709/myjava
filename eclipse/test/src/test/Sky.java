package test;

import java.util.ArrayList;
import java.util.Scanner;

import test.data.Menu;
import test.data.proc.MenuExit;
import test.data.proc.MenuEdit;
import test.data.proc.MenuList;
import test.data.proc.MenuDel;
import test.data.proc.MenuReg;
import test.display.Title;

public class Sky {
	void proc() {
		// 회원정보 입력
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(new Menu("아메리카노", "2500원","cafe"));
		menus.add(new Menu("카페라떼", "3500원", "cafe"));
		menus.add(new Menu("카푸치노", "3500원", "cafe"));
		menus.add(new Menu("카페모카", "3500원", "cafe"));
		menus.add(new Menu("에스프레소", "2500원", "cafe"));
		menus.add(new Menu("바닐라라떼", "4500원", "cafe"));
		menus.add(new Menu("카라멜마끼아또", "4500원", "cafe"));

		System.out.println(Title.TITLE);

		Scanner sc = new Scanner(System.in);
		boolean isNotEnd = true;
		while (isNotEnd) {
			System.out.print("명령을 입력: (1:메뉴목록 보기 / 2:메뉴추가 / 3:메뉴삭제 / 4:메뉴수정 / e:프로그램 종료)");
			String cmd = sc.next();
			switch (cmd) {
			case "1": // 회원목록
				MenuList menuMemberList = new MenuList();
				menuMemberList.proc(menus);				
				break;
			case "2": // 회원등록
				MenuReg menuMemberReg = new MenuReg();
				menuMemberReg.proc(menus);
				break;
			case "3": // 회원삭제
				MenuDel menuMemberDel = new MenuDel();
				menuMemberDel.proc(menus);	
				break;
			case "4": // 회원수정
				MenuEdit menuMemberEdit = new MenuEdit();
				menuMemberEdit.proc(menus);	
				break;
			case "e": // 프로그램 종료
				MenuExit menuExit = new MenuExit();
				menuExit.proc();	
				
				isNotEnd = false;	// 종료를 위한 변수 전달
				break;
			default:
				System.out.println("잘못된 명령입니다.");
				break;
			}
		}		
	}

}