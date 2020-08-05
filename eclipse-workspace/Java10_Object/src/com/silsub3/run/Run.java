package com.silsub3.run;

import com.silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.setRadius(10);
		c.getRadius();
		c.I();
		c.S();
		
		c.incrementRadius();
	}

}
