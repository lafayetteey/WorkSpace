package com.poly.silsub1.shape.model.vo;

public class Circle extends Shape {
	private static final double PI = Math.PI;
	private double radius;
	
	public Circle() {}
	public Circle( double radius) {
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getPi() {
		return PI;
	}
	@Override
	public double area() {
		double sum = radius * radius * PI;
		return sum;
	}

	@Override
	public double perimeter() {
		double sum2 = (radius * 2) * PI;
		return sum2;
	}

}
