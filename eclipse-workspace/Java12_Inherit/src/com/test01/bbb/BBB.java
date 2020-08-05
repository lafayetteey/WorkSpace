package com.test01.bbb;

import com.test01.aaa.AAA;

public class BBB extends AAA {
	private int b;
	
	public BBB() {
		//super();  //何葛狼 积己磊 ---> AAA() // 积帆啊瓷
		System.out.println("BBB狼 积己磊");	
	}
	
	public BBB(int b) {
		super(b);
		this.b = b;
		System.out.println("BBB 积己(b 罐酒辑 积己)");
	}
	public BBB(int abc , int b) {
		super(abc);
		this.b = b;
		System.out.println("BBB 积己(abc, b 罐酒辑 积己)");
	}
	
	//getter , setter 
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getSum() {
		int sum = super.getAbc() + this.getB();
		return sum;
	}
	
	@Override
	public void prn() {
		super.prn();
		System.out.println("BBB class狼 prn( )");
	}
		
	
}
