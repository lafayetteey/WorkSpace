package com.test01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
			//WhileTest02.testDoWhile();
			//WhileTest02.testDoWhile02();
			//WhileTest02.testDoWhile03();
	}
	public static void testDoWhile() {
		int i =1;
		//do=while ���� ��� while() ���� �ݵ�� ; �����ݷ� �ٿ���� �Ѵ�.
		do { 
			System.out.println(i);
			i++;
		} while(i<10);		
	}
	
	public static void testDoWhile02() {
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		do { 
			
			System.out.print("���ڿ� �Է�: ");
			str = sc.next();
			System.out.println("str : " + str);
			//exit�� �ԷµǸ� while�� ����ǰ� �Ѵ�.		
		} while(!str.equals("exit"));
	}
	
	public static void testDoWhile03() {
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		do { 
					System.out.print("���ڿ� �Է�: ");
					str = sc.next();
					if(str.equals("exit")) {
						System.out.println("����!!");
						break;
					}
					System.out.println("str: " + str);
		} while(true) ;
	}
}

