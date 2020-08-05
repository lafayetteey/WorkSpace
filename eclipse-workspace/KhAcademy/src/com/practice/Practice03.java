package com.practice;

import java.util.Scanner;

public class Practice03 {
//	1. 정수 변수 선언
//	  2. 키보드로 부터 정수 하나 입력받음
//	  3. 입력받은 정수가 양수이면 "양수다." 출력
//	     양수가 아니면 "양수가 아니다." 출력
	public void sample3() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: " );
		num = sc.nextInt();
		String str = (num>0)? "양수" : "양수아님" ;
		
		System.out.println(str);
	}
//	 1. 정수 변수 선언
//	   2. 문자열 변수 선언
//	   3. 키보드로 부터 정수를 하나 입력 받음	
//	   4. 입력받은 정수가 짝수이면 "짝수다" 를 문자열변수에 기록하고,
//	     짝수가 아니면 "홀수다"를 문자열변수에 기록하고 
//		문자열변수 값 출력함
	public void sample4() {
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		str = (num%2 == 0)? "짝수" : " 홀수";
		System.out.println(str);
	}
	
}
