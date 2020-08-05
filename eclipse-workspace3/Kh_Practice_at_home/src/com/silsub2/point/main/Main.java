package com.silsub2.point.main;

import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle[] c = {
				new Circle(10, 5 , 15),
				new Circle(2 , 3, 10),
				new Circle(4 , 5 ,20)
		};
		for(int i=0; i<c.length; i++) {
			c[i].draw();
		}
		
		Rectangle[] r = {
				new Rectangle(2 ,3 , 15 ,20),
				new Rectangle(3, 5, 25 ,30),
				new Rectangle(4, 6 ,30 , 35)
		};
		for(int i=0; i<r.length; i++) {
			r[i].draw();
		}
	}

}
