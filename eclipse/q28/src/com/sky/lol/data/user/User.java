package com.sky.lol.data.user;

public class User {
		static public String characterName = "";
		public static String characterSex;
		public static String characterJob;
		public static int currentHp = 200;
		public static int maxHp = 200;
		public static int atk = 12;
		static public void info() {
			System.out.print("[<"+characterName+">("+currentHp+"/"+maxHp+")]");
		}	
	}