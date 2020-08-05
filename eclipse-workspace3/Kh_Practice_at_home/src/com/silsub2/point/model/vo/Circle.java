package com.silsub2.point.model.vo;

public class Circle extends Point {
	private int radius;
	
	public Circle() {
		
	}
	public Circle(int x , int y , int radius) {
		super(x , y);
		this.radius =radius;
	}
	@Override
	public void draw() {
		System.out.printf("원의 면적은 : %.1f", (Math.PI * radius * radius));
		System.out.printf("원의 둘레는 : %.1f" , (2 * Math.PI * radius));
		System.out.println();
		super.draw();
	}
}
