package com.silsub.main;

import java.util.Scanner;

public class Munjae {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int kor = sc.nextInt();
		System.out.print("����: ");
		int eng = sc.nextInt();
		System.out.print("����: ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math);
		double avg = sum / 3.0;
		
		if(kor>40 && eng >40 && math > 40 && avg > 60) {
			System.out.println("�հ�: " + sum);
			System.out.println("���: " + avg);
		} else {
			System.out.println("���հ�");
		}
		
	}

	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** �ʱ� �޴� ***");
		System.out.println("1. �Է�: " );
		System.out.println("2. ����: ");
		System.out.println("3. ��ȸ: ");
		System.out.println("4. ����: ");
		System.out.println("7. ����: ");
		
		int a = sc.nextInt();
		
		switch (a) {
		case 1 : 
			System.out.println("�Է¸޴��� ���õǾ����ϴ�.");
			break;
		case 2 : 
			System.out.println("�����޴��� ���õǾ����ϴ�.");
			break;
		case 3 : 
			System.out.println("��ȸ�޴��� ���õǾ����ϴ�.");
			break;
		case 4 : 
			System.out.println("�����޴��� ���õǾ����ϴ�.");
			break;
		case 7 : 
			System.out.println("���α׷��� ����Ǿ����ϴ�..");
			break;	
		default : 
			System.out.println("��ȣ �Է��� �߸� �Ǿ����ϴ�.");
		}
	}

	public void test3() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		num = sc.nextInt();
		if(num>0) {
			System.out.println("���");
		} else {
			System.out.println("��� �ƴ�");
		}
	}
	
	public void test4() {
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		num = sc.nextInt();
		str = (num%2==0) ? "¦����" : "Ȧ����" ;
		System.out.println(str);
	}

	public void inputTest() {
		String name;
		int age;
		double height;
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");
		name = sc.nextLine();
		System.out.print("���� : ");
		age = sc.nextInt();
		System.out.print("Ű: ");
		height = sc.nextDouble();
		if(name != null && age>0 && height>0) {
			System.out.printf(
					"%s �� ���̴� %d �̰�, Ű�� %.1f �̴�." , name , age , height);		
		} else {
			System.out.println();
		}
	}

	public void test6() {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է�: ");
		num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է�: ");
		num2 = sc.nextInt();
		
		if(num1>0 && num2 > 0) {
			System.out.println("���ϱ� ��: " + (num1 + num2) );
			System.out.println("���� ��: " + (num1 - num2) );
			System.out.println("���ϱ� ��: " + (num1 * num2) );
			System.out.println("������ ��: " + (num1 - num2) );
			System.out.println("������ ��: " + (num1 % num2) );
			
		} else {
			System.out.println();
		}
	}

	public void test7() {
		int num;
		char grade = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ���: ");
		num = sc.nextInt();
		if(num>0) {
			if(num>=90) {
				grade = 'A';
			} else if(num<90 && num>=80) {
				grade = 'B';
			} else if(num<80 && num >=70) {
				grade = 'C';
			} else if (num <70 && num >=60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		}
		System.out.printf("����� ������ %d �̰� ����� %c �Դϴ�.", num , grade);
	}
}


