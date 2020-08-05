
package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		//객체 배열 선언 및 할당
		//클래스명 배열명 = new 클래스명[];
		
//		Book[] bk = new Book[3];
//		초기화
//		배열안에는 클래스명의 객체만 들어갈수잇다.
//		bk[0] = new Book();
//		bk[1] = new Book();
//		bk[2] = new Book();
		
		
		//선언 및 할당과 동시에 초기화
		Book[] bk = { 
				new Book("자바의 정석", "홍길동" ,"나무" , 10000), 				
				new Book("C언어의 정석", "김승진" , "KH", 210000) , 				
				new Book("프로그래밍" , "이순신" , "케이에이치" , 3000) 
				};
		
		
		//출력
//		System.out.println(bk);
//		System.out.println(bk[0]);
//		System.out.println(bk[0].getTitle());
//		System.out.println(bk[1]);
//		System.out.println(bk[1].getTitle());
		
		
		//도서출력
		System.out.println("도서 갯수 : " + bk.length);
		//도서정보 출력
		for(int i=0; i<bk.length; i++) {
		System.out.println(bk[i].info());
		}
		
		//도서검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목 : ");
		String sTitle = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(sTitle)) {
				System.out.println(bk[i].info());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
