package com.example2;

import java.util.Scanner;

public class CastingSample {
	
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: " );
		
		char ch = sc.next().charAt(0);
		System.out.println("A is unicode: " + (int) ch);
			
	}
	
	public void CalculatorScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		double d1 = sc.nextDouble();
		System.out.print("����: ");
		double d2 = sc.nextDouble();
		System.out.print("����: ");
		double d3 = sc.nextDouble();
		
		System.out.println("����: " +(int) (d1 + d2 + d3)) ;
		System.out.println("���: " + (int) (d1 + d2 + d3) / 3);
		
	}
}
