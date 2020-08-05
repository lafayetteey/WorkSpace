package com.kh.inputTest;

public class TestCommandLine {
	public static void main(String args[]) {
		String name = args[0];
		
		String genders = args[1];	
		char ch = genders.charAt(0);
		String ag = args[2];
		int age = Integer.parseInt(ag);
		String str = args[3];
		double height = Double.parseDouble(str);
		String str1 = args[4];
		double weight = Double.parseDouble(str1);
		
		for(int i=0; i<args.length; i++) {
			if(args[i] == name) {
				System.out.println("이름 : " + args[0]);
			} else if(args[i] == genders) {
				System.out.println("성별 : " + args[1]);
			} else if(args[i] == ag ) {
				System.out.println("나이 : " + args[2]);
			} else if(args[i] == str) {
				System.out.println("키 : " + args[3]);
			} else {
				System.out.println("몸무게 : " + args[4]);
			}
		}
	}
}	
