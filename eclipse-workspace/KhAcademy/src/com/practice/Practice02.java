package com.practice;

import java.util.Scanner;

public class Practice02 {
//	변수 선언하고, 키보드로 입력받은 값들을 변수에 기록하고
//	변수값을 화면에 출력 확인함
//	성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력처리함
//	3학년 2반 24번 남학생 홍길동은 성적이 95.55이다.
	public void sample2() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름: ");
		String name = sc.nextLine();
		System.out.print("학년: ");
		int grade = sc.nextInt();
		System.out.print("반: ");
		int classNum = sc.nextInt();
		System.out.print("번호: ");
		int num = sc.nextInt();
		System.out.print("성별: ");
		char ch = sc.next().charAt(0);
		String gender = (ch == 'm' || ch == 'M')? "남학생" : "여학생";
		System.out.print("성적: ");
		double point = sc.nextDouble();
		
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + gender + " " +  name + "은 성적이 " + point + "이다" );
		
		
		
		
	}
}
