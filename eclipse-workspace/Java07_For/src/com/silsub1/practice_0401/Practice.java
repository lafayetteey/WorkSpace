package com.silsub1.practice_0401;

import java.util.Scanner;

public class Practice {
	Scanner sc = new Scanner(System.in);
	
	public void pritnStar() {
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		if(num>0) {
			for(int i=1; i<=num; i ++) {
				for(int j = 0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} 
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	public void printStar2() {
		System.out.print("정수 입력: ") ;;
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=1; i<=num; i++) {
				for(int j =1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
		} else {
			for(int i =1; i <=Math.abs(num); i++) {
				for(int j = Math.abs(num); j>=i; j--  ) {
					System.out.print("*");
				}
				System.out.println();
				
			}
		}
		if(num ==0) {
			System.out.println("출력 기능이 없습니다.");
		}
	}
}

	