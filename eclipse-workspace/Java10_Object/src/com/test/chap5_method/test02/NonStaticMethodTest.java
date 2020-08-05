package com.test.chap5_method.test02;


//매개변수 유무와 반환값 유무에 따른 메소드 구분
public class NonStaticMethodTest {
	//static : 클래스명.메소드명
	//non_static : new 연산자
		//1. 매개변수 없고 반환값 없는 메소드
		public void method1() {
			//메소드 내용만 수행 후 리턴값 없이 호출된 메소드로 돌아간다.
			System.out.println("매개변수와 반환값이 둘 다 없는 메소드 ");
		}
		//2. 매개변수 없고 반환값 있는 메소드
		public String method2() {
			return "매개변수가 없지만 반환값이 있는 메소드";
		}
		//3 매개변수가 있고 반환값 없는 메소드
		public void method(int num1 , int num2) {
			int sum = num1 + num2;
			System.out.println("sum : " + sum);
		}
		//4. 매개변수 와 반환값 모두 있는 메소드	
		public int method4(int num1 , int num2) {
			return num1 + num2;
		}
	
	
	
}
