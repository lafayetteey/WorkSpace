package com.practice;

import java.util.Scanner;

public class Practice02 {
//	���� �����ϰ�, Ű����� �Է¹��� ������ ������ ����ϰ�
//	�������� ȭ�鿡 ��� Ȯ����
//	������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ���ó����
//	3�г� 2�� 24�� ���л� ȫ�浿�� ������ 95.55�̴�.
	public void sample2() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��̸�: ");
		String name = sc.nextLine();
		System.out.print("�г�: ");
		int grade = sc.nextInt();
		System.out.print("��: ");
		int classNum = sc.nextInt();
		System.out.print("��ȣ: ");
		int num = sc.nextInt();
		System.out.print("����: ");
		char ch = sc.next().charAt(0);
		String gender = (ch == 'm' || ch == 'M')? "���л�" : "���л�";
		System.out.print("����: ");
		double point = sc.nextDouble();
		
		System.out.println(grade + "�г� " + classNum + "�� " + num + "�� " + gender + " " +  name + "�� ������ " + point + "�̴�" );
		
		
		
		
	}
}
