package com.silsub3.model.vo;

public class Circle_01 {
	//�ǽ������� ������ �׾��� ������ static
	public static final double PI = 3.14;
	private static int radius;
	
	public Circle_01() {
		
	}
	public static int getRadius() {
		return radius;
	}
	//static setter 
	public static void setRadius(int radius) {
		Circle_01.radius = radius;
	}
	public void incremnetRadius() {
		Circle_01.radius ++;
	}

}
