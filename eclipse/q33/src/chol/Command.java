package chol;

import java.util.Scanner;

public class Command {
	static public String getCommand(String guide) {
		System.out.print(guide + ":");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();	
		return cmd;
		
	}

}
