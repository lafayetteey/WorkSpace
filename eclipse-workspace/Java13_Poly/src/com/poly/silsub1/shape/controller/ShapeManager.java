package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.vo.ICircle;
import com.poly.silsub1.shape.model.vo.IRectangle;
import com.poly.silsub1.shape.model.vo.IShape;
import com.poly.silsub1.shape.model.vo.Triangle;

public class ShapeManager {
	public void calcShape() {
		IShape s;
//		Shape s;
//		
//		s = new Rectangle(10.0,15.0);
//		System.out.println("사각형 면적 : " + s.area());
//		System.out.println("사각형 둘레 : " +s.perimeter());
//		
//		s = new Circle(10.0);
//		System.out.println("원 면적 : " + s.area());
//		System.out.println("원 둘레 : " +s.perimeter());
//		
		
		s = new IRectangle(10.0,15.0);
		System.out.println("사각형 면적 : " + s.area());
		System.out.println("사각형 둘레 : " +s.perimeter());
		
		s = new ICircle(10.0);
		System.out.println("원 면적 : " + s.area());
		System.out.println("원 둘레 : " +s.perimeter());
	}

	public void calcShapeArray() {
		
		IShape[] arr = new IShape[5];
		arr[0] = new IRectangle(10.0, 15.0);
		arr[1] = new ICircle(15.0);
		arr[2] = new Triangle(5.0 , 6.0);
		arr[3] = new Triangle(7.0 , 8.0);
		arr[4] = new ICircle(8.00);
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] instanceof IRectangle) {
				System.out.println(String.format("%.2f", arr[i].area()));
				System.out.println(String.format("%.2f", arr[i].perimeter()));
				System.out.println();
			}
			if (arr[i] instanceof ICircle) {
				System.out.println(String.format("%.2f", arr[i].area()));
				System.out.println(String.format("%.2f", arr[i].perimeter()));
				System.out.println();
			}
			 if(arr[i] instanceof Triangle) {
				System.out.println(String.format("%.2f", arr[i].area()));
				System.out.println(String.format("%.2f", arr[i].perimeter()));
				System.out.println(((Triangle)arr[i]).getHypotenuse());
				System.out.println();
			}
		
		}
	
	}
}




