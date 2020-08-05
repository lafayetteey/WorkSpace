package com.poly.silsub1.shape.model.vo;

public class ICircle implements IShape {
	private double radius;
	public static double PI = Math.PI;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	public static void setPi(double pi) {
		PI = pi;
	}
	
	public ICircle() {
		
	}
	public ICircle(double radius) {
		this.radius = radius;
		
	}

	@Override
	public double area() {
		return radius * radius * PI;
	}

	@Override
	public double perimeter() {
		return radius * 2 * PI;
	}

}
