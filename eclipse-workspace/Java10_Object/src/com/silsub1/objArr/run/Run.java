package com.silsub1.objArr.run;

import java.util.Scanner;

import com.silsub1.objArr.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//배열 객체 생성
		//클래스명[] 변수명 = new 클래스명[]
		//선언과 초기화를 동시에
		//클래스명[] 변수명 = { new 클래스명(  ) };
		
		Student[] st = { 
				new Student(1 , 2, 23 , "김승진"),
				new Student(3 , 1 , 31 , "홍길동"),
				new Student (2 , 3 , 15 , "임꺽정"),
				new Student (2 , 1 , 11 , "이순신"),
				new Student (3 , 2 , 37 , "일리단")
				};
		System.out.println(st[0].information());
		System.out.println(st[1].information());
		System.out.println(st[2].information());
		System.out.println(st[3].information());
		System.out.println(st[4].information());
		
		System.out.println();
		
		
		
		System.out.println("학생수 : " + st.length);
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i].information());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름 검색: ");
		String str = sc.next();
		for(int i=0; i<st.length; i++) {
			if(st[i].getName().equals(str)) {
				System.out.println(st[i].information());
			}
		}
		
		
		
	}

}
