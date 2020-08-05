package com.silsub3.run;

import com.silsub3.model.vo.Circle_01;

public class Run_01 {
	public static void main(String[] args) {
		Circle_01.setRadius(10);
		System.out.println("원의 넓이 : " + Circle_01.getRadius() * Circle_01.getRadius() * Circle_01.PI);
		System.out.println("원의 둘레 : " + Circle_01.getRadius() * 2 * Circle_01.PI);

		Circle_01 test = new Circle_01();
		
		test.incremnetRadius();
		System.out.println("원의 넓이 : " + Circle_01.getRadius() * Circle_01.getRadius() * Circle_01.PI);
		System.out.println("원의 둘레 : " + Circle_01.getRadius() * 2 * Circle_01.PI);
	}
}
