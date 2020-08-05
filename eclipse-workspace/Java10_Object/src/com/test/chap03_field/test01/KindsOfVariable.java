package com.test.chap03_field.test01;

public class KindsOfVariable { // 클래스 영역의 시작
	// field // 클래스 영역에 작성하는 변수를 필드라 한다.
	// 필드 == 멤버변수 or 전역변수
	// 멤버변수 ( 클래스가 가지는 멤버라는 의미)
	// 전역변수 ( 클래스 전역에서 사용할 수 있는 변수라는 의미)
	private int globalNum;

	public void test(int num) {
		// 메소드 영역에서 작성하는 변수를 " 지역변수 " 라고 한다. (메소드밖에서는 사용불가능)
		// 메소드 선인 시 괄호 안에 선언하는 변수를 "매개개변수" 라고 한다.(메소드밖에서는 사용불가능)
		int localNum = 0;

		// 매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요없다.
		System.out.println(num);

		// 지역변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화가 되어 있어야함
		System.out.println(localNum);

		
		//클래스 전역에서 사용가능한 변수
		System.out.println(globalNum);

	} // 메소드 영역의 끝
	
	public void testmethod2() {
		// 다른 메소드에서 지역변수로 사용된 localNum 은 다른 메소드에서는 사용불가
		//System.out.println(localNum);
		System.out.println(globalNum);
		
		
		
		
	}

} // 클래스 영역의 끝
