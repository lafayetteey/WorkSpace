package com.test01;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		WhileTest04.testWhile02();
	}
	//1~100������ �հ踦 ���ϴ� ����
	//¦�� �� Ȧ���� ���� ���ϴ� ����
	public static void testWhile01() {
		
	}
	
	public static void testWhile02() {
		boolean stop = false;
		int num;
		while(!stop) {
			Scanner sc = new Scanner(System.in);
			System.out.print("ù��° ������ �Է�: ");			
			int num1 = sc.nextInt();
			System.out.print("�ι�° ������ �Է�: ");
			int num2 = sc.nextInt();
			num = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + num);
			System.out.print("��� Y, ���� N �Է�: ");
			String str = sc.next();
			if (str.equals("Y") || str.equals("y")) {//Y �Ǵ� y �Է� �� 
				System.out.println("------------------------");
				continue;
			}
			if(str.equals("n") || str.contentEquals("N")) {
				
				break;
			}
		}
		System.out.println("�ý����� ���� �Ǿ����ϴ�.");
	}
}
