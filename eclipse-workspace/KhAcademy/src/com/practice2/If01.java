package com.practice2;

import java.util.Scanner;

public class If01 {
	public void testIfElseIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
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
		System.out.printf("����� ������ %d �̰� ����� %s �Դϴ�.", score,grade);
	}
}
