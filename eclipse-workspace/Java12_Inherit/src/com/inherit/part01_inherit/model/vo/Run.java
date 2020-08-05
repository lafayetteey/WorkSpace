package com.inherit.part01_inherit.model.vo;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		//객체 생성과 동시에 생성자 매개값 초기화
		Television tv = new Television("삼성" , "03", "T123" , "삼성TV " , 500000 , new Date() , 46);
		
		System.out.println(tv.prnInfo());
		System.out.println();
		
		Desktop d = new Desktop("삼성" ,"77" , "S-0123" , "매직스테이션" , 
				1000000, new Date() , "intel" , 500 , 8 , "windows7" , false) ;
		
		System.out.println(d.prnInfo());
		System.out.println();
		
		SmartPhone s = new SmartPhone("애플" , "12" , "I-333", "아이폰8플러스" , 960000,
				new Date(), "IOS" , 256 , 6 , "애플" , "KT");
		System.out.println(s.prnInfo());
		
		System.out.println(s.getBrand());
	}

}
