package com.practice2;

import java.util.Scanner;

public class If {
//	1. 정수 두개를 입력받아, 두수의 산술연산을 처리해서 출력하세요
//	단, 두 수 모두 반드시 1~100사이의 값이어야함
//	입력받은 두개의 숫자 중 하나라도 범위에 속하지 않으면
//	"값은 1부터 100사이어야 합니다" 라고 출력
	public void IfExam() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int b = sc.nextInt();
		
		if(a<100 && 1 < a && b <100 && 1< b) {
			System.out.println("더하기 값: " + (a + b));
			System.out.println("빼기 값: " + (a - b));
			System.out.println("곱하기 값: " + (a * b));
			System.out.println("나누기 값: " + (a / b));
			System.out.println("나머지 값: " + (a % b));
		}else { 
			System.out.println("1~100까지의 정수값만 유효합니다.");
		}
	}
	 //점수를 하나 입력 받아 등급을 나누어 점수와 등급을 출력
	//90점 이상은 A등급 
	//90점 미만 80점 이상 B등급  
	//80점 미만 70점 이상 C등급 
	//70점 미만 60점 이상은 D 등급
	//60점 미만은 F등급
	public void IfExam01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		char ch = ' ';
		
		
		if(score >= 90) {
			ch = 'A';
		} else if (score <90 && score >80) { 
			ch = 'B';
		} else if (score <80 && score > 70) {
			ch = 'C';
		} else if (score < 70 && score > 60) { 
			ch = 'D';
		} else {
			ch = 'F';
		}
		System.out.printf("당신의 점수는 %d 이고, 등급은 %c 입니다." , score , ch);
	}
}
