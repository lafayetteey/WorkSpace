package com.test02;

public class Student {

	public static void main(String[] args) {
		String name = "김승진";
		int korea = 90;
		int eng = 90;
		int math = 100;
		
		Score sc = new Score();
		
		//Score클래스 메소드에서 선언된 리턴 타입인 double avg에 값을 초기화 한 후 출력ㅣ
		double avg = sc.getAvg(korea, eng, math);
		//System.out.println(avg);
		
		String str = sc.getGrade(avg);
		System.out.println(name + "님의 등급은 " + str + "입니다.");
	}

}
