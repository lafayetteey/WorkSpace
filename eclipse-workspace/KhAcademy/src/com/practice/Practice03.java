package com.practice;

import java.util.Scanner;

public class Practice03 {
//	1. ���� ���� ����
//	  2. Ű����� ���� ���� �ϳ� �Է¹���
//	  3. �Է¹��� ������ ����̸� "�����." ���
//	     ����� �ƴϸ� "����� �ƴϴ�." ���
	public void sample3() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: " );
		num = sc.nextInt();
		String str = (num>0)? "���" : "����ƴ�" ;
		
		System.out.println(str);
	}
//	 1. ���� ���� ����
//	   2. ���ڿ� ���� ����
//	   3. Ű����� ���� ������ �ϳ� �Է� ����	
//	   4. �Է¹��� ������ ¦���̸� "¦����" �� ���ڿ������� ����ϰ�,
//	     ¦���� �ƴϸ� "Ȧ����"�� ���ڿ������� ����ϰ� 
//		���ڿ����� �� �����
	public void sample4() {
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		num = sc.nextInt();
		str = (num%2 == 0)? "¦��" : " Ȧ��";
		System.out.println(str);
	}
	
}
