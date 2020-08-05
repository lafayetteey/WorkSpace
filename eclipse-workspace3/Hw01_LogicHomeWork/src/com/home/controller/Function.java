package com.home.controller;

import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);

	public void calculator() {
		int sum = 0;
		System.out.print("ù��° ����: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ����: ");
		int num2 = sc.nextInt();
		System.out.print("���� ����( +, - , x , / ): ");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case '+':
			sum = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + sum);
			break;
		case '-':
			sum = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + sum);
			break;
		case 'x':
			sum = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + sum);
			break;
		case 'X':
			sum = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + sum);
			break;
		case '/':
			if (num2 > 0) {
				sum = num1 / num2;
				System.out.println(num1 + "/" + num2 + "=" + sum);
				break;
			} else {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		}
	}

	public void totalcalculator() {
		int min = 0;
		int max = 0;
		int sum = 0;
		System.out.print("ù��° ����: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ����: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			max = num1;
			min = num2;
			for (int i = min; i <= max; i++) {
				sum += i;
			}
			System.out.println(num2 + "���� " + num1 + "���� �������� �հ�: " + sum);
		} else {
			max = num2;
			min = num1;
			for (int i = min; i <= max; i++) {
				sum += i;
			}
			System.out.println(num1 + "���� " + num2 + "���� �������� �հ�: " + sum);
		}

	}

	public void profile() {
		String name = "ȫ�浿";
		System.out.println("�̸� :" + name);
		int age = 26;
		System.out.println("����: " + age + " ��");
		String gender = "����";
		System.out.println("����: " + gender);
		String personal = "��������";
		System.out.println("����: " + personal);
	}

	public void sungjuk() {

		System.out.print("�л��̸�: ");
		String name = sc.next();
		System.out.print("�г�: ");
		int grades = sc.nextInt();
		System.out.print("��: ");
		int classNum = sc.nextInt();
		System.out.print("��ȣ: ");
		int num = sc.nextInt();
		System.out.print("����: ");
		char ch = sc.next().charAt(0);
		String str = (ch == 'M' || ch == 'm') ? "���л�" : "���л�";
		System.out.print("����: ");
		double point = sc.nextDouble();

		char grade = ' ';

		if (point >= 90) {
			grade = 'A';
		} else if (point < 90 && point >= 80) {
			grade = 'B';
		} else if (point < 80 && point >= 70) {
			grade = 'C';
		} else if (point < 70 && point >= 60) {
			grade = 'D';
		} else {
			grade = 'F';

		}
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.1f�̰�, %c ���� �Դϴ�.\n", grades, classNum, num, str, name, point,
				grade);
	}

	public void printStarNumber() {
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					if (i == j) {
						System.out.print(j);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
			System.out.println();
		}
	}

	public void sumRandomNumber() {
		int num = (int) (Math.random() * 100) + 1;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1���� " + "random : " + num + " ������ �������� �հ�: " + sum);
	}

	public void continueGugudan() {
		System.out.print("�Է��� ����: ");
		int dan = sc.nextInt();
		System.out.print("������ ���: ");
		int num = sc.nextInt();
		int sum=0;

		if (dan > 0) {
			for (int i = 1; i < 10; i++) {
				sum = dan * i;
				if (num!=sum) {
					System.out.println(dan + "*" + i + "=" + (sum));
				} else {
					continue;
				}
			}
		} else {
			System.out.println("����� �ƴմϴ�.");

		}

	}

	public void shutNumber() {

		int sum = 0;
		String answer = " ";

		do {
			System.out.print("�Էµ� ��: ");
			int num = sc.nextInt();
			int num1 = 0, num2 = 0;
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			sum = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + sum);
			if (num == sum) {
				System.out.println("������ϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			System.out.println();
			System.out.print("8.����Ͻðڽ��ϱ�? (y/n) ");
			answer = sc.next();
			System.out.println();

		} while (answer.equals("Y") || answer.equals("y"));
	}
}
