package com.home.controller;

import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);

	public void calculator() {
		int sum = 0;
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		System.out.print("연산 문자( +, - , x , / ): ");
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
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
	}

	public void totalcalculator() {
		int min = 0;
		int max = 0;
		int sum = 0;
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			max = num1;
			min = num2;
			for (int i = min; i <= max; i++) {
				sum += i;
			}
			System.out.println(num2 + "부터 " + num1 + "까지 정수들의 합계: " + sum);
		} else {
			max = num2;
			min = num1;
			for (int i = min; i <= max; i++) {
				sum += i;
			}
			System.out.println(num1 + "부터 " + num2 + "까지 정수들의 합계: " + sum);
		}

	}

	public void profile() {
		String name = "홍길동";
		System.out.println("이름 :" + name);
		int age = 26;
		System.out.println("나이: " + age + " 세");
		String gender = "남자";
		System.out.println("성별: " + gender);
		String personal = "고집불통";
		System.out.println("성격: " + personal);
	}

	public void sungjuk() {

		System.out.print("학생이름: ");
		String name = sc.next();
		System.out.print("학년: ");
		int grades = sc.nextInt();
		System.out.print("반: ");
		int classNum = sc.nextInt();
		System.out.print("번호: ");
		int num = sc.nextInt();
		System.out.print("성별: ");
		char ch = sc.next().charAt(0);
		String str = (ch == 'M' || ch == 'm') ? "남학생" : "여학생";
		System.out.print("성적: ");
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
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.1f이고, %c 학점 입니다.\n", grades, classNum, num, str, name, point,
				grade);
	}

	public void printStarNumber() {
		System.out.print("정수 하나 입력: ");
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
			System.out.println("양수가 아닙니다.");
			System.out.println();
		}
	}

	public void sumRandomNumber() {
		int num = (int) (Math.random() * 100) + 1;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + "random : " + num + " 까지의 정수들의 합계: " + sum);
	}

	public void continueGugudan() {
		System.out.print("입력할 정수: ");
		int dan = sc.nextInt();
		System.out.print("제외할 배수: ");
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
			System.out.println("양수가 아닙니다.");

		}

	}

	public void shutNumber() {

		int sum = 0;
		String answer = " ";

		do {
			System.out.print("입력된 수: ");
			int num = sc.nextInt();
			int num1 = 0, num2 = 0;
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			sum = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + sum);
			if (num == sum) {
				System.out.println("맞췄습니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
			System.out.println();
			System.out.print("8.계속하시겠습니까? (y/n) ");
			answer = sc.next();
			System.out.println();

		} while (answer.equals("Y") || answer.equals("y"));
	}
}
