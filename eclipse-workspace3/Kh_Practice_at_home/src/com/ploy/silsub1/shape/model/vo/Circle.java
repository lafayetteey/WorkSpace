package com.ploy.silsub1.shape.model.vo;

public class Circle implements IShape {
	
	private static double PI = Math.PI;
	private double radius;
	
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	public static void setPi(double pi) {
		PI = pi;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double area = radius * radius * PI;
		return area;
	}

	@Override
	public double perimeter() {
		return (radius*2) * PI;
	}

}
