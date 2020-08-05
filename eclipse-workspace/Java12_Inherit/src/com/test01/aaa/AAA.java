package com.test01.aaa;

public class AAA {
	private int abc;

	
	public AAA() {
		System.out.println("AAA의 생성자");
	}
	
	//매개변수 생성자
	public AAA(int abc) {
		System.out.println("AAA 생성(abc 받아서)");
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
		System.out.println("AAA의 prn 메소드");
	}
}
