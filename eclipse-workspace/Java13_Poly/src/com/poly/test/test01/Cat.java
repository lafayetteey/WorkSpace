package com.poly.test.test01;

public class Cat extends Animal {
	
	@Override 
	public void bark() {
		System.out.println("�߿�");
	}
	
	@Override
	public void eat(String animal) {
		super.eat(animal);
	}

}
