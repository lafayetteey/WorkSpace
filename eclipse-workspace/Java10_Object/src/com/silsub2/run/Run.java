package com.silsub2.run;

import com.silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pr = new Product();
		
		pr.setPName("����Ĩ");
		pr.setPrice(3000);
		pr.setBrand("������");
		
		System.out.println(pr.info());
	}

}
