package com.practice;

import java.util.Scanner;

public class Practice01 {
//	국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
//	각 점수를 키보드로 입력받고,
//	합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
//	세 과목의 점수와 평균을 가지고 합격 여부 처리함
//	합격의 조건 : 세 과목의 점수가 각각 40점이상이면서,
//	평균이 60점 이상이면 합격, 
//	아니면 불합격 처리함
	public void sample() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int korea = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int sum = (korea + eng + math);
		double avg = sum / 3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		String str = (korea<40 && eng < 40 && math < 40 && avg < 60)? "불합격" : "합격";
		System.out.println(str);
		
	}
}
