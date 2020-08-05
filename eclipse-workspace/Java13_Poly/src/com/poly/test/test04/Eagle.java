package com.poly.test.test04;

//추상클래스와 인터페이스 동시에 상속 가능
public class Eagle extends Animal implements Bird {

	@Override
	public void fly() {
		System.out.println("파닥파닥");
	}

	@Override
	public void bark() {
		System.out.println("독수독수");
	}

	
}
