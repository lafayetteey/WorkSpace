package com.test.chap5_method.test02;

public class StaticMethodTest {
	//static 메소드 
	public static void staticMethod1() {
	int num = 10;
	int num2 = 20;
	System.out.println("10과 20의 합은 " + (num+num2) + "입니다.");
	}
	//리턴타입이 있는 static 메소드
	public static int staticMethod2() {
		int num = 10;
		int num2 = 25;
		return num+num2;
	}
	
	//매개변수만 있는 static 메소드
	public static void staticmethod3(String name) {
		System.out.println(name + "님의 방문을 환영합니다.");
	}
	
	//매개변수와 리턴타입도 있는 메소드
	public static String staticmethod4(String name) {
		return name + "님의 방문을 환영합니다.";
	}
	
	
	
	
	
	
	
	
	
}
