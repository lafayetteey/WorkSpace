package com.test01.bbb;

import com.test01.aaa.AAA;

public class Test {

	public static void main(String[] args) {
		BBB b1 = new BBB();
		
		b1.setAbc(1);
		b1.setB(2);
		
		System.out.println(b1.getSum());
		System.out.println("------------------------");
		
		BBB b2 = new BBB(3);
		b2.setB(4);
		System.out.println(b2.getAbc() + "+" + b2.getB() + "=" + b2.getSum());
		System.out.println("------------------------");
		
		BBB b3 = new BBB(5, 6);
		System.out.println(b3.getAbc() + "+" + b3.getB() + "=" + b3.getSum());
		System.out.println("------------------------");
		
		AAA a1 = new AAA();
		BBB b = new BBB();
		
		a1.prn();
		
		//BBB클래스에서 재정의된 메소드만 실행된다.
		b.prn();
		
	}
	

}
