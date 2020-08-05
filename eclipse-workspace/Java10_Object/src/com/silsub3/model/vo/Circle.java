package com.silsub3.model.vo;

public class Circle {
	public double PI = 3.14;
	private int radius;
	
	
	public Circle() {
	}

	public void I() {
	System.out.println("원의 둘레: " + 2 * radius * PI); 
	}
	public void S() {
		System.out.println("원의 넓이: " + radius * radius * PI);
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void incrementRadius() {
		radius += 1;
		System.out.println(2 * radius * PI);
		System.out.println(radius * radius * PI);
	}
	
	
}
