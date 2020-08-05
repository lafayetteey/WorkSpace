package com.silsub1.point.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	public Rectangle(int x, int y, int width , int height) {
		super(x , y);
		this.height = height;
		this.width = width;
	}
	//01-1692-6265
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		double sum = width * height;
		System.out.println("면적 : " + Math.round(sum) *10 / 10.0);
		double sum1 = 2 * (width + height);
		System.out.println("둘레 : " + Math.round(sum1) * 10 / 10.0 );
		super.draw();
		
	}
	
	
}
