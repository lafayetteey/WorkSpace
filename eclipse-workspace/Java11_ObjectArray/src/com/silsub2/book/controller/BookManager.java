package com.silsub2.book.controller;

import java.util.Scanner;

import com.test01.model.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);
	Book[] bar = null;
	private static int count;
	
	public BookManager() {
		bar=new Book[10];
		for(int i=0; i<bar.length; i++) {
			bar[i] =new Book();
		}
	}
	public void menu() {
		String answer = " ";
		
		do {
			System.out.println("**** 도서 관리 메뉴 ****");
			System.out.print("1. 도서 정보 추가 ");
			int input = sc.nextInt();
			
			
			System.out.print("2. 모두 출력 ");
			int output = sc.nextInt();
			
			
			System.out.print("7. 끝내기");
			int returntoMain = sc.nextInt();
			if(returntoMain == 7) {
				break;
			}
			System.out.print("계속 하시겠습니까? ");
			answer = sc.next();
			
		} while(answer.equals("y") || answer.equals("Y"));
	}
	public void bookInput() {
		Book bk = new Book();
		
		
	}
	public void bookAllOutput() {
		
	}
}
