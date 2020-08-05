package com.poly.test.test01;

public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("¸Û¸Û");
	}

	
	public void eat(String animal) {
		super.eat(animal);
		System.out.println("dog eat");
	}
}
