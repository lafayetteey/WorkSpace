package com.home.view;

import java.util.Scanner;

import com.home.controller.Function;

public class Menu {
	public static void displayMenu() {
		//do-while������ �ۼ�
		Scanner sc = new Scanner(System.in);
		Function func = new Function();
		int num = 0;
		String answer = " ";
		
		do {
			
			int num1 = 0;
			System.out.println("***��������/������/��� ���� ���α׷�***");
			System.out.println();
			System.out.println("1. ���� ����");
			System.out.println("2. ���������� ū������ �հ豸�ϱ�");
			System.out.println("3. �Ż����� Ȯ���ϱ�");
			System.out.println("4. �л����� Ȯ���ϱ�");
			System.out.println("5. ���� ���� ����ϱ�");
			System.out.println("6. ���������� �հ� ���ϱ�");
			System.out.println("7. ������");
			System.out.println("8. �ֻ��� ���� �˾Ƹ��߱� ����");
			System.out.println("9. ���α׷� ����");
			System.out.println();
			
			System.out.print("�޴� ��ȣ �Է�: ");
			num1 = sc.nextInt();
			
			
			switch(num1) {
			case 1 :
				func.calculator();
				break;
			case 2 :
				func.totalcalculator();
				break;
			case 3 :
				func.profile();
				break;
			case 4 : 
				func.sungjuk();
				break;
			case 5 :
				func.printStarNumber();
				break;
			case 6 :
				func.sumRandomNumber();
				break;
			case 7 :
				func.continueGugudan();
				break;
			case 8 : 
				func.shutNumber();
				break;
			case 9 :
				System.out.println("���α׷� ����.");
				break;			
			}
			if(num1 < 9) {
			System.out.print("����Ͻðڽ��ϱ�? (y/n)");
			answer = sc.next();
			System.out.println();
				if(answer.equals("n") || answer.equals("N")) {
					System.out.println();
					System.out.println("���α׷� ����");
				}
			} else {
				System.out.println();
				break;
			}
		} while(answer.equals("Y") || answer.equals("y"));
		
	}
}
