package com.ploy.silsub1.shape.controller;


import com.ploy.silsub1.shape.model.vo.Circle;
import com.ploy.silsub1.shape.model.vo.IShape;
import com.ploy.silsub1.shape.model.vo.Rectangle;
import com.ploy.silsub1.shape.model.vo.Shape;
import com.ploy.silsub1.shape.model.vo.Triangle;


public class ShapeManager {
	public void calcShape() {
		Shape s; 
//		
//		s = new Circle(15.5);
//		System.out.println("�� ������ : "+ s.area());
//		System.out.println("�� �ѷ� : " + s.perimeter());
//	
//		
//		s = new Rectangle(34.5 , 42.7);
//		System.out.println("�簢������: " + s.area());
//		System.out.println("�簢���ѷ�: " + s.perimeter());
			
	}
	public void calcShapeArray() {
		IShape[] iarr = new IShape[5];
		
		iarr[0] = new Circle(15.2);
		iarr[1] = new Rectangle(11.3 ,21.5);
		iarr[2] = new Triangle(12.3 , 11.2);
		iarr[3] = new Circle(5.12);
		iarr[4] = new Triangle(22.1 , 10.5);
		
		for(int i=0; i<iarr.length; i++) {
			if(iarr[i] instanceof Circle ) {
				System.out.println("�������� : " + String.format("%.2f", iarr[i].area()));
				System.out.println("�� �ѷ��� : " +String.format("%.2f", iarr[i].perimeter()));
			} else if(iarr[i] instanceof Rectangle) {
				System.out.println("�簢���� ������ : " + String.format("%.2f",iarr[i].area()));
				System.out.println("�簢���� �ѷ��� : " + String.format("%.2f",iarr[i].perimeter()));
			} else if(iarr[i] instanceof Triangle) {
				System.out.println("�ﰢ���� ������ : "  + String.format("%.2f",iarr[i].area()));
				System.out.println("�ﰢ���� �ѷ��� : "  + String.format("%.2f",iarr[i].perimeter()));
				System.out.println("�ﰢ���� ������ : "  + String.format("%.2f",((Triangle)iarr[i]).getHypotenuse()));
			}
			System.out.println("---------------------------------------");
		}
	}
}
