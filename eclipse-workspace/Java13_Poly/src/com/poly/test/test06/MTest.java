package com.poly.test.test06;

public class MTest {

	public static void main(String[] args) {
		Area ar = new Circle();
		
		ar.make();
		ar.print();
		
		ar = new Triangle();
		ar.make(); 
		ar.print();
	}

}
