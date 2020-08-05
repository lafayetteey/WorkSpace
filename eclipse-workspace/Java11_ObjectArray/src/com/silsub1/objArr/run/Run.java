package com.silsub1.objArr.run;

import java.util.Scanner;

import com.silsub1.objArr.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//클래스명[] 변수 = { new 클래스명 () } ;
		//System.out.println(st[0].information) <--information 메소드가 생성이 되어있다면 호출
		Student[] st =  {
			new Student (3 , 2 , 24 , "김승진"),
			new Student (2 , 4 , 32 , "홍길동"), 
			new Student (1 , 3 , 11 , "이순신")
		};
		System.out.println(st[0].information());
		System.out.println(st[1].information());
		System.out.println(st[2].information());
		System.out.println();
		
		System.out.println("학생 수 : " + st.length);
		for(int i =0 ; i<st.length; i++) {
			System.out.println(st[i].information());
		}
		System.out.println();
		
		
		Student[] st1 = new Student[3];
		
//		st1[0] = new Student(1, 2, 32, "김승진");
//		st1[1] = new Student(2, 3, 21 , "홍길동");
//		st1[2] = new Student(3 , 3 , 22 , "이순신");
		
//		System.out.println(st[0].information());
//		System.out.println(st[1].information());
//		System.out.println(st[2].information());
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("검색할 학생 : ");
//		String str = sc.next();
//		for(int i=0; i<st1.length; i++) {
//			if(st1[i].getName().equals(str)) {
//				System.out.println(st1[i].information());
//			}
//		}
		
		
	}

}