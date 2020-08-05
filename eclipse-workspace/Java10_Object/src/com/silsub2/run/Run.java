package com.silsub2.run;

import com.silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pr = new Product();
		
		pr.setPName("감자칩");
		pr.setPrice(3000);
		pr.setBrand("오리온");
		
		System.out.println(pr.info());
	}

}
