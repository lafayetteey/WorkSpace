package com.practice;

import java.util.Scanner;

public class PracticeExample {
	
	public void sample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int a = sc.nextInt();
		System.out.print("영어: ");
		int b = sc.nextInt();
		System.out.print("수학: ");
		int c = sc.nextInt();
		System.out.println("합계: " + (a + b + c) );
		double sum = (double) (a + b + c) / 3.0;
		System.out.println("평균: " + sum);
		
//		String res = (40>a && a<40)? "불합격" : "합격";
//		String res1 = (40>b&& b<40)? "불합격" : "합격";
//		String res2 = (40>c && c<40)? "불합격" : "합격";
//		String res3 = (60>sum && sum < 60) ? "불합격" : "합격";
		String res = (a >=40 && b >= 40 && c >=40 && sum >=60)? "합격" :  "불합격";
		System.out.println(res);
//		System.out.println(res1);
//		System.out.println(res2);
//		System.out.println(res3);
		
	}
	
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름: ");
		String name = sc.nextLine();
		System.out.print("학년: ");
		int grade = sc.nextInt();
		System.out.print("반: ");
		int roomNum = sc.nextInt();
		System.out.print("번호: ");
		int num = sc.nextInt();
		System.out.print("성별: ");
		char ch = sc.next().charAt(0);
		String gender = ( ch == 'M' || ch == 'm')? "남학생": "여학생";
		System.out.print("성적: ");
		double avg = sc.nextDouble();
		
		
		System.out.println(grade + "학년 " + roomNum + " 반 " + num + " 번 " + gender +" " + name +
				"은 성적이 " + avg + " 이다." );
				
	}
		public void sample3() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 하나 입력: ");
			int a = sc.nextInt();
			String res = (a>0) ? "양수다" : "양수가 아니다.";
			System.out.println(res);
		}
		
		public void sample4() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 하나 입력: ");
			int a1 = sc.nextInt();
			String res1 = (a1%2==0 && a1%1==0)? "짝수" : "홀수";
			System.out.println(res1);
		}
		public void sample05() {
			int num = 0;
			String str = "";
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수를 하나 입력: ");
			num = sc.nextInt();
			str = (num%2 == 0) ? "짝수": "홀수";
			System.out.println(str);
								
		}
}

