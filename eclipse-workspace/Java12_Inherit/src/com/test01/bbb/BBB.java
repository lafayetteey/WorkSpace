package com.test01.bbb;

import com.test01.aaa.AAA;

public class BBB extends AAA {
	private int b;
	
	public BBB() {
		//super();  //�θ��� ������ ---> AAA() // ��������
		System.out.println("BBB�� ������");	
	}
	
	public BBB(int b) {
		super(b);
		this.b = b;
		System.out.println("BBB ����(b �޾Ƽ� ����)");
	}
	public BBB(int abc , int b) {
		super(abc);
		this.b = b;
		System.out.println("BBB ����(abc, b �޾Ƽ� ����)");
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
		System.out.println("BBB class�� prn( )");
	}
		
	
}
