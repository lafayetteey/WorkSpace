package com.poly.test.test04;

public class MTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.eat("ÂüÄ¡");
		
		Dog dog = new Dog();
		dog.bark();
		dog.bite();
		dog.eat("°³²­");
		
		Eagle eagle = new Eagle();
		
		eagle.bark();
		eagle.fly();
		eagle.eat("»ıÁã");
	}

}
