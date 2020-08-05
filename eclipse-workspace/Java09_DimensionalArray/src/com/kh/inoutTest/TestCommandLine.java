package com.kh.inoutTest;

public class TestCommandLine {

	public static void main(String[] args) {
		String name = args[0];
		String gender = args[1];
		char ch = gender.charAt(0);
		String age1 = args[2];
		int age = Integer.parseInt(age1);
		String height = args[3];
		double hei = Double.parseDouble(height);
		String weight = args[4];
		double wei = Double.parseDouble(weight);
		
		for(int i =0; i<args.length; i++) {
			if(i==0) {
				System.out.println("이름: " + args[0]);
			} else if(i==1) {
				System.out.println("성별: " + args[1]);
			} else if (i == 2) {
				System.out.println("나이: " + args[2]);
			} else if (i==3) {
				System.out.println("키 : " + args[3]);
			} else {
				System.out.println("몸무게: " + args[4]);
			}
		}
	}
}
