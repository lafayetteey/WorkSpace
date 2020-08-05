package com.test.chap5_method.test02;

public class Run {
	public static void main(String[] args) {
//		NonStaticMethodTest test = new NonStaticMethodTest();
//		//매개변수와 반환값이 없는 메소드
//		test.method1();
//		//매개변수가 없고 반환값이 있는 메소드
//		//반환값이 있는 경우 (return) 의 경우 동일한 타입의 변수 선언 후 해당 값에 메소드를 호출해준다.
//		String res = test.method2();
//		System.out.println(res);
//		
//		
//		//출력문 괄호안에 호출도 가능
//		System.out.println(test.method2());
//		
//		//매개변수가 있고 반환값이 없는 메소드 호출
//		test.method(10, 20);
//		
//		//매개변수와 반환값 모두 있는 메소드
//		int res1 = test.method4(10, 20);
		
		//static 메소드 호출 시에는 객체를 생성 하지 않는다
		StaticMethodTest.staticMethod1();
		System.out.println("10과 20의 합: " + StaticMethodTest.staticMethod2());
		StaticMethodTest.staticmethod3("홍길동");
		
		System.out.println(StaticMethodTest.staticmethod4("이순신"));
	}
}
