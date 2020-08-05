package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		//Book객체 생성
		Book b1 = new Book("수학의 정석" , "나수학" , 100);
		Book b2 = new Book("이것이 자바다" , "김승진" , 17000);
		
		//toString() 은 객체 호출 시 자동으로 JVM이 뒤에 생성
		System.out.println("b1= " + b1.toString());
		System.out.println("b2= " + b2.toString());
		System.out.println("------------------------------------------------");
		////
		System.out.println("b1과 b2 는 같은 객체? : " + b1.equals(b2));
		
		
		//얕은 복사(주소값만 복사)
		Book b3 = b1;
		System.out.println("b1과 b3 는 같은 객체? : " + b1.equals(b3));
		
		
		Book b4 = new Book("수학의 정석", "나수학" , 100);
		System.out.println("b1과 b4는 같은 객체? : " + b1.equals(b4));
		
		
		//
		System.out.println("b1의 hashcode :" + b1.hashCode());
		System.out.println("b4의 hashcode :" + b4.hashCode());
		
	
		
	}

}
