package com.practice;

import java.util.Scanner;

public class Practice01 {
//	����(����), ����(����), ����(����), ����(����), ���(�Ǽ�) ���� �����ϰ�,
//	�� ������ Ű����� �Է¹ް�,
//	�հ�(����+����+����)�� ���(�հ�/3.0)�� ����ϰ�,
//	�� ������ ������ ����� ������ �հ� ���� ó����
//	�հ��� ���� : �� ������ ������ ���� 40���̻��̸鼭,
//	����� 60�� �̻��̸� �հ�, 
//	�ƴϸ� ���հ� ó����
	public void sample() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int korea = sc.nextInt();
		System.out.print("����: ");
		int eng = sc.nextInt();
		System.out.print("����: ");
		int math = sc.nextInt();
		
		int sum = (korea + eng + math);
		double avg = sum / 3.0;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		String str = (korea<40 && eng < 40 && math < 40 && avg < 60)? "���հ�" : "�հ�";
		System.out.println(str);
		
	}
}
