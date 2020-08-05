package com.test01;

import java.util.Scanner;

public class IfTest01 {
	//public void testIf() {
		//if문
		//조건식의 결과 값이 true면 {  } 안에 있는 코드 실행
		//조건식의 결과 값이 false면 {   } 안에 있는 코드를 무시하고 넘어감
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 한개 입력: ");
//		int num = sc.nextInt();
//		
//		//짝수인지 조건을 확인
//		if(num%2 == 0) {
//			System.out.println("짝수 입니다.");
//		} 
//		
//		if (num%2 !=0) {
//			System.out.println("홀수 입니다.");
//		} 
//
//		System.out.println("프로그램 종료");
//		}
	
	public void testIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int num2 = sc.nextInt();
		
		if(num2%2 == 0) { 
			System.out.println("입력하신 숫자는 짝수 입니다.");
		} else { 
			System.out.println("입력하신 숫자는 홀수 입니다.");
		}
		
		System.out.println("프로그램 종료.");
		
	}
	

}
