package com.test01;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		WhileTest04.testWhile02();
	}
	//1~100까지의 합계를 구하는 예제
	//짝수 와 홀수의 합을 구하는 예제
	public static void testWhile01() {
		
	}
	
	public static void testWhile02() {
		boolean stop = false;
		int num;
		while(!stop) {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 정수를 입력: ");			
			int num1 = sc.nextInt();
			System.out.print("두번째 정수를 입력: ");
			int num2 = sc.nextInt();
			num = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + num);
			System.out.print("계속 Y, 종료 N 입력: ");
			String str = sc.next();
			if (str.equals("Y") || str.equals("y")) {//Y 또는 y 입력 시 
				System.out.println("------------------------");
				continue;
			}
			if(str.equals("n") || str.contentEquals("N")) {
				
				break;
			}
		}
		System.out.println("시스템이 종료 되었습니다.");
	}
}
