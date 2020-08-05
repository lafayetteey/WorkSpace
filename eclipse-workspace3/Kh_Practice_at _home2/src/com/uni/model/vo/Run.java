package com.uni.model.vo;

public class Run {

	public static void main(String[] args) {
		Student[] iarr = {
				new Student("홍길동" , 15 , 171 , 81 , "201101" , "영문"),
				new Student("한사람" , 13 , 183 , 72 , "201102" , "건축"),
				new Student("임걱정" , 16 , 175 , 65 , "201103" , "무용"),
		};
		for(int i=0; i<iarr.length; i++) {
			System.out.println(iarr[i].prnInfo());
		}
 	}

}
