package com.silsub2.person.controller;

import java.util.Scanner;

import com.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		Person pr[] = new Person[5];
		Scanner sc = new Scanner(System.in);

//		System.out.print("첫번째 사람의 정보 입력 : ");
//		pr[0] = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
//		System.out.print("두번째 사람의 정보 입력 : ");
//		pr[1] = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
//		System.out.print("세번째 사람의 정보 입력 : ");
//		pr[2] = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
//		System.out.print("네번째 사람의 정보 입력 : ");
//		pr[3] = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
//		System.out.print("다섯번째 사람의 정보 입력 : ");
//		pr[4] = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
//		System.out.println();
		
		for(int i=0; i<pr.length; i++) {
			pr[i] = new Person();
			System.out.print("이름 : ");
			pr[i].setName(sc.next());
			System.out.print("나이: ");
			pr[i].setAge(sc.nextInt());
			System.out.print("성별: ");
			pr[i].setGender(sc.next().charAt(0));
			System.out.print("키: ");
			pr[i].setHeight(sc.nextDouble());
			System.out.print("몸무게: ");
			pr[i].setWeight(sc.nextDouble());
			System.out.println("---------------");
		}
		
		
		System.out.println("사람 수: " + pr.length);
		
		double avg1 = 0;
		double avg2 = 0;
		double avg3 = 0;
		
		for (int i =0; i < pr.length; i++) {
			 avg1 += pr[i].getAge() / 5.0;
			 avg2 += pr[i].getHeight()/ 5.0;
			 avg3 += pr[i].getWeight() / 5.0;
		}
		 System.out.println("나이 평균 : " + avg1);
		 System.out.println("키 평균 : " +avg2);
		 System.out.println("몸무게 평균 : " + avg3);
		
	}
}
