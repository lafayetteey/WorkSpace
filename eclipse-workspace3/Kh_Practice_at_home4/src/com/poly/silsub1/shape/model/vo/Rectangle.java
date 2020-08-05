package com.poly.silsub1.shape.model.vo;

public class Rectangle extends Shape {
	private double width , height;
	
	public Rectangle() {}
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		double sum = width * height;
		return sum;
	}

	@Override
	public double perimeter() {
		double sum2 = 2 *(width + height);
		return sum2;
	}

}
