package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class ObjectTest {

	public static void main(String[] args) {
		//1. Book class 객체 3개 생성
		Book b1 = new Book("자바의 정석" , "홍길동" , "나무" , 27000);
		Book b2 = new Book("C언어의 정석" , "김승진" , "KH" , 13000);
		Book b3 = new Book("프로그래밍", "이순신", "케이에이치" ,5500);
		
		
		
		//출력
//		System.out.println(b1.info());
//		System.out.println(b2.info());
//		System.out.println(b3.info());
		
		//도서검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목 입력: ");
		String sTitle = sc.nextLine();
		
		if(b1.getTitle().equals(sTitle)) {
			System.out.println(b1.info());
		} else if(b2.getTitle().equals(sTitle)) {
			System.out.println(b2.info());
		} else if(b3.getTitle().equals(sTitle) ) {
			System.out.println(b3.info());
		}
		
	}

}
