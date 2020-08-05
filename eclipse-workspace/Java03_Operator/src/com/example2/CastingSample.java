package com.example2;

import java.util.Scanner;

public class CastingSample {
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력: ");
		char ch = sc.next().charAt(0);
		System.out.println("A is uniCode: " + (int) ch);
		
	}
	
	public void calculatorScores() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int a = sc.nextInt();
		System.out.print("영어: ");
		int b = sc.nextInt();
		System.out.print("수학: ");
		int c = sc.nextInt();
		
		System.out.println("총점: " + (double) (a + b +c) );
		System.out.println("평균: " + (double) (a + b + c) /3.0 );
	}
	
	public void printBitCount() {
		
	}
}	


