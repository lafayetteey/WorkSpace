package com.test01;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
	//	Practice.gugudan();
		Practice.gugudan2();
	}
	//정수를 하나 입력 받아 그 수가 양수 일때만 그수의 구구단을 출력;
	//양수가 아니면 "반드시 1~9사이의 양수를 입력!! 이라고 출력
	public static void gugudan() {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		num = sc.nextInt();
		if(num>0 && num <= 9) {
			for(int i=1; i <10; i++) {
				System.out.println(num * i);
			}
		} else {
			System.out.println();
		}
	}
	
	public static void gugudan2() {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i*j);
			}
			System.out.println();
		}
	}
}
