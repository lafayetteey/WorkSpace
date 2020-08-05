package com.example2;

import java.util.Scanner;

public class CastingSample {
	
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력: " );
		
		char ch = sc.next().charAt(0);
		System.out.println("A is unicode: " + (int) ch);
			
	}
	
	public void CalculatorScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		double d1 = sc.nextDouble();
		System.out.print("영어: ");
		double d2 = sc.nextDouble();
		System.out.print("수학: ");
		double d3 = sc.nextDouble();
		
		System.out.println("총점: " +(int) (d1 + d2 + d3)) ;
		System.out.println("평균: " + (int) (d1 + d2 + d3) / 3);
		
	}
}
