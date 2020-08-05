package com.silsub.main;

import java.util.Scanner;

public class Munjae {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math);
		double avg = sum / 3.0;
		
		if(kor>40 && eng >40 && math > 40 && avg > 60) {
			System.out.println("합계: " + sum);
			System.out.println("평균: " + avg);
		} else {
			System.out.println("불합격");
		}
		
	}

	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 초기 메뉴 ***");
		System.out.println("1. 입력: " );
		System.out.println("2. 수정: ");
		System.out.println("3. 조회: ");
		System.out.println("4. 삭제: ");
		System.out.println("7. 종료: ");
		
		int a = sc.nextInt();
		
		switch (a) {
		case 1 : 
			System.out.println("입력메뉴가 선택되었습니다.");
			break;
		case 2 : 
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		case 3 : 
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
		case 4 : 
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		case 7 : 
			System.out.println("프로그램이 종료되었습니다..");
			break;	
		default : 
			System.out.println("번호 입력이 잘못 되었습니다.");
		}
	}

	public void test3() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		num = sc.nextInt();
		if(num>0) {
			System.out.println("양수");
		} else {
			System.out.println("양수 아님");
		}
	}
	
	public void test4() {
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		num = sc.nextInt();
		str = (num%2==0) ? "짝수다" : "홀수다" ;
		System.out.println(str);
	}

	public void inputTest() {
		String name;
		int age;
		double height;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("키: ");
		height = sc.nextDouble();
		if(name != null && age>0 && height>0) {
			System.out.printf(
					"%s 의 나이는 %d 이고, 키는 %.1f 이다." , name , age , height);		
		} else {
			System.out.println();
		}
	}

	public void test6() {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		num2 = sc.nextInt();
		
		if(num1>0 && num2 > 0) {
			System.out.println("더하기 값: " + (num1 + num2) );
			System.out.println("빼기 값: " + (num1 - num2) );
			System.out.println("곱하기 값: " + (num1 * num2) );
			System.out.println("나누기 값: " + (num1 - num2) );
			System.out.println("나머지 값: " + (num1 % num2) );
			
		} else {
			System.out.println();
		}
	}

	public void test7() {
		int num;
		char grade = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요: ");
		num = sc.nextInt();
		if(num>0) {
			if(num>=90) {
				grade = 'A';
			} else if(num<90 && num>=80) {
				grade = 'B';
			} else if(num<80 && num >=70) {
				grade = 'C';
			} else if (num <70 && num >=60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		}
		System.out.printf("당신의 점수는 %d 이고 등급은 %c 입니다.", num , grade);
	}
}


