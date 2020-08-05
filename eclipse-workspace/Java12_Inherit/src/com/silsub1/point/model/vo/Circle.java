package com.silsub1.point.model.vo;

public class Circle extends Point{
	private int radius;
	
	public Circle() {
		
	}
	public Circle(int x, int y, int radius) {
		super(x , y);
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		double sum = (Math.PI * radius * radius);
		double sum1 = (2 * Math.PI * radius);
		
		
		System.out.println("원 면적 = " + Math.round(sum) * 10 / 10.0);
		System.out.println("원 둘레 = " + String.format("%.1f", (sum1)));
		System.out.printf("원 면적 printf : %.1f", (radius * radius * Math.PI));
		
//		super.draw();
		
	}
}
