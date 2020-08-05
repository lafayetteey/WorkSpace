package com.test01;

import java.util.Scanner;

public class IfTest02 {
	public void testIf01() {
		int i = 20;
		
		if(i<=10) {
			System.out.println(i + "은 10보다 작거나 같습니다.");
		} else {
			System.out.println(i + "은 10보다 크거나 같습니다.");
		}
	}
	
	public void testIfElse2_1() {
		//50보다 큰 수라면 "50보다 큰수"
		//50보다 작은 수라면 "50보다 작은수"
		Scanner sc = new Scanner(System.in);
		System.out.print("0보다 큰 정수 입력: ");
		int no = sc.nextInt();
		
		if(no >= 50) { 
			if(no%2==0)  {
				System.out.println("50보다 큰 짝수");
			} else {
				System.out.println("50보다 큰 홀수");
			}
		} else { 
			System.out.println("50보다 작은 수");
			
		}
	}
	
	public void testIfElse2_2() {
		//숫자를 하나 입력 받아 양수인지 음수 인지 출력
		//단 ,  0 이면 "0입니다" 라고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		if(num != 0) {
			if(num>0) {
				System.out.println("양수 입니다.");
			} else {
				System.out.println("음수 입니다.");
			}
				
		} else { 
			System.out.println("0입니다.");
		}
	} 
	
	public void testIfElse3() {
		//정수 두개를 입력받아, 두수의 산술연산을 처리해서 출력하세요
		//단, 두 수 모두 반드시 1~100사이의 값이어야함
		// 입력받은 두개의 숫자 중 하나라도 범위에 속하지 않으면
		//"값은 1부터 100사이어야 합니다" 라고 출력
		//&&(그리고, ~면서) A && B : 두개의 값 모두 true 일 경우에만 true 리턴 
		//|| (또는, ~거나) A || B  : 두개의 값 모두 false일 경우에만 false 리턴
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int b= sc.nextInt();
		
		//if (a >= 1 && a <=100) && (b >=1 && b <=100) {		
		if(a >= 1 && a <= 100 ) {
			if(b > 1 && b < 100) {
				System.out.println("더하기 값: " + (a + b));
				System.out.println("빼기 값: " + (a - b));
				System.out.println("곱하기 값: " + (a * b));
				System.out.println("나누기 값: " + (a / b));
				System.out.println("나머지 값: " + (a % b));				
			} else { 
				System.out.println("값은 1부터 100사이어야 합니다.");
			}
		} else {
			System.out.println("값은 1부터 100 사이어야 합니다.");
		}
	}
}
