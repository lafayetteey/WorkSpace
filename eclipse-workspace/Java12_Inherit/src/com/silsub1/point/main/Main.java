package com.silsub1.point.main;



import com.silsub1.point.model.vo.Circle;
import com.silsub1.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle[] c = {
			new Circle(10, 10 , 1),
			new Circle(20,20,50),
			new Circle(30, 30, 30)
	};

		Rectangle[] r = {
				new Rectangle(10 , 10, 12 , 35) ,
				new Rectangle(20 , 21 ,45, 56),
				new Rectangle(15 , 11 ,53, 32)
		};
		
		for(int i=0; i<c.length; i++) {
			c[i].draw();
			System.out.println("----------------------");
		}
		for(int i=0; i<r.length; i++) {
			r[i].draw();
			System.out.println("----------------------");
		}
		


		
		
		
		
		
		
		
		
	}

}
