package com.silsub2.person.controller;

import java.util.Scanner;

import com.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		Person pr[] = new Person[5];
		Scanner sc = new Scanner(System.in);

//		System.out.print("ù��° ����� ���� �Է� : ");
//		pr[0] = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
//		System.out.print("�ι�° ����� ���� �Է� : ");
//		pr[1] = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
//		System.out.print("����° ����� ���� �Է� : ");
//		pr[2] = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
//		System.out.print("�׹�° ����� ���� �Է� : ");
//		pr[3] = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
//		System.out.print("�ټ���° ����� ���� �Է� : ");
//		pr[4] = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
//		System.out.println();
		
		for(int i=0; i<pr.length; i++) {
			pr[i] = new Person();
			System.out.print("�̸� : ");
			pr[i].setName(sc.next());
			System.out.print("����: ");
			pr[i].setAge(sc.nextInt());
			System.out.print("����: ");
			pr[i].setGender(sc.next().charAt(0));
			System.out.print("Ű: ");
			pr[i].setHeight(sc.nextDouble());
			System.out.print("������: ");
			pr[i].setWeight(sc.nextDouble());
			System.out.println("---------------");
		}
		
		
		System.out.println("��� ��: " + pr.length);
		
		double avg1 = 0;
		double avg2 = 0;
		double avg3 = 0;
		
		for (int i =0; i < pr.length; i++) {
			 avg1 += pr[i].getAge() / 5.0;
			 avg2 += pr[i].getHeight()/ 5.0;
			 avg3 += pr[i].getWeight() / 5.0;
		}
		 System.out.println("���� ��� : " + avg1);
		 System.out.println("Ű ��� : " +avg2);
		 System.out.println("������ ��� : " + avg3);
		
	}
}
