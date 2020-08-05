package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.vo.Circle;
import com.poly.silsub1.shape.model.vo.IShape;
import com.poly.silsub1.shape.model.vo.Rectangle;
import com.poly.silsub1.shape.model.vo.Triangle;

public class ShapeManager {

	public void calcShape() {
//		IShape s;
//		
//		s = new Circle(15.5);
//		System.out.println("원 면적 : " +String.format("%.2f", s.area()));
//		System.out.println("원 둘레 : " +String.format("%.2f", s.perimeter()));
//		
//		s= new Rectangle(34.5 , 42.7);
//		System.out.println("사각형 면적 : " + String.format("%.2f", s.area()));
//		System.out.println("사각형 둘레 : " + String.format("%.2f", s.perimeter()));

		IShape[] iarr = new IShape[5];
		iarr[0] = new Rectangle(34.5, 42.7);
		iarr[1] = new Circle(15.5);
		iarr[2] = new Triangle(34.1, 55.1);
		iarr[3] = new Circle(20.2);
		iarr[4] = new Triangle(12.4, 20.5);

		for (int i = 0; i < iarr.length; i++) {
			if(iarr[i] instanceof Circle) {
				System.out.println("원 면적 : " +String.format("%.2f", iarr[i].area()));
				System.out.println("원 둘레 : " +String.format("%.2f", iarr[i].perimeter()));
				System.out.println();
			} else if (iarr[i] instanceof Rectangle) {
				System.out.println("사각형 면적 : " +String.format("%.2f", iarr[i].area()));
				System.out.println("사각형 둘레 : " +String.format("%.2f", iarr[i].perimeter()));
				System.out.println();
			} else if (iarr[i] instanceof Triangle) {
				System.out.println("삼각형 면적 : " +String.format("%.2f", iarr[i].area()));
				System.out.println("삼각형 둘레 : " +String.format("%.2f", iarr[i].perimeter()));
				System.out.println("삼각형 빗변길이 : " +String.format("%.2f", ((Triangle)iarr[i]).getHypotenuse()));
				System.out.println();
			}
		}
	}
}
