package com.test01;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		//WhileTest01.testWhile03();
		//WhileTest01.testWhile04();
		//WhileTest01.testWhile04_2();
	}

	public static void WhileTest01() {
		int  i = 1;
		
		// ���ǽ��� ���ٸ� ���� �ݺ��ȴ�.
		while(i<10) {
			System.out.println(i +" ��° �ݺ��� ����");
			i++; //while�� �������� while ���� ������ ������ ���´�.
		}
	}
	public static void WhileTest02() {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(ch);
			i++;
		}		
	}	
	public static void testWhile03() {
		//1���� �Է¹��� ������ �������� ���� ����
		//ex) 1 +2+3+4+5
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		int i =1;
		while(i<=num) {
			sum += i;
			i ++;
		}
	
		System.out.println("sum: " + sum) ;
	}
	
	public static void testWhile04( ) {
		int i = 1;
		while(true) {
			System.out.println(i);
			i++;
			if(i==10) {
				break;
			}
		}		
	}
	
	public static void testWhile04_2() {
		//Ű����� 4�� �Է¹��������� �ݺ�
		//4�� �Է¹����� while ���� ����ǰ� ��.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���� �Է�: ");
			int i = sc.nextInt();
			
			if ( i == 4) {
				System.out.println("4�Է� ���α׷� ����");
				break;
			}
		}
	}

}
