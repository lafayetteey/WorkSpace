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
			System.out.println("**** ���� ���� �޴� ****");
			System.out.print("1. ���� ���� �߰� ");
			int input = sc.nextInt();
			
			
			System.out.print("2. ��� ��� ");
			int output = sc.nextInt();
			
			
			System.out.print("7. ������");
			int returntoMain = sc.nextInt();
			if(returntoMain == 7) {
				break;
			}
			System.out.print("��� �Ͻðڽ��ϱ�? ");
			answer = sc.next();
			
		} while(answer.equals("y") || answer.equals("Y"));
	}
	public void bookInput() {
		Book bk = new Book();
		
		
	}
	public void bookAllOutput() {
		
	}
}
