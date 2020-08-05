package com.practice2;

import java.util.Scanner;

public class If01 {
	public void testIfElseIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		String grade = " ";
		
		if(score>=90) {
			grade = "A";
			if(score>=95) {
				grade += "+";
			} 
		} else if (score >=80) {
			grade = "B";
			if(score >= 85) {
				grade += "+";
			}
		} else if(score >=70) {
			grade = "C" ;
			if(score  >=75) {
				grade += "+";
			}
		} else if ( score >=60) {
			grade = "D";
			if(score >=65) {
				grade += "+";
			}
		} else {
			grade = "F";
		}
		System.out.printf("당신의 점수는 %d 이고 등급은 %s 입니다.", score,grade);
	}
}
