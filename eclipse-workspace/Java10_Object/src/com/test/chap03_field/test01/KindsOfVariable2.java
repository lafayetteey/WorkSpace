package com.test.chap03_field.test01;

public class KindsOfVariable2 {
	//전역변수
	public static int staticNum;
	
	//상수필드 : static 과 final 키워드를 함께 사용 하는필드
	//상수 필드는 반드시 선언 시 초기화 해주어야함
	public final static int STATIC_NUM =1;
	
	public static final int STATIC_NUM2 = 2;
	
	public void methodTest() {
		//non=static 메소드안에서 static 변수 사용 불가능하다.
		//static int localStaticNum;
		
		
	}
}
