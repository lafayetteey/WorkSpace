package com.test01.aaa;

public class AAA {
	private int abc;

	
	public AAA() {
		System.out.println("AAA�� ������");
	}
	
	//�Ű����� ������
	public AAA(int abc) {
		System.out.println("AAA ����(abc �޾Ƽ�)");
		this.abc = abc;
	}
	//getter
	public int getAbc() {
		return abc;
	}
	public void setAbc(int abc) {
		this.abc = abc;
	}
	
	public void prn() {
		System.out.println("AAA�� prn �޼ҵ�");
	}
}
