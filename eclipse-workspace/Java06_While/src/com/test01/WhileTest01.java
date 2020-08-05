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
		
		// 조건식이 없다면 무한 반복된다.
		while(i<10) {
			System.out.println(i +" 번째 반복문 수행");
			i++; //while의 증감식은 while 문이 끝나는 시점에 적는다.
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
		//1부터 입력받은 수까지 정수들의 합을 구함
		//ex) 1 +2+3+4+5
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
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
		//키보드로 4를 입력받을때까지 반복
		//4를 입력받을때 while 문이 종료되게 함.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 입력: ");
			int i = sc.nextInt();
			
			if ( i == 4) {
				System.out.println("4입력 프로그램 종료");
				break;
			}
		}
	}

}
