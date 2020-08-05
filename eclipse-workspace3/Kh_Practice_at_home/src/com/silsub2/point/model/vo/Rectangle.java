package com.silsub2.point.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	public Rectangle(int x , int y , int width , int height) {
		super(x , y);
		this.width = width;
		this.height = height;
	}
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
		System.out.printf("면적은 : %.1f" , (double)(2 * (width + height)));
		System.out.printf("둘레는 : %.1f", (double)(width * height));
		System.out.println();
		super.draw();
		
	}
	
}
