package com.silsub1.example_0401;

import java.util.Scanner;

public class ForWhileCheating {
	public void selectMenu() {
		Scanner sc = new Scanner(System.in);
		String answer = " " ;
		String menu = " ";
		String str = " ";
		int sum =0;
		int total=0;
		int count =0;
		int price = 0;
	
		do {
			System.out.println("***�޴��� �����ϼ���***");
			System.out.println();
			System.out.println("�ܹ��� ******************");
			System.out.println("1. �Ұ�� ����	3500��");
			System.out.println("2. ġŲ ����		3200��");
			System.out.println("�߰� ********************");
			System.out.println("3. ����Ƣ��		1000��");
			System.out.println("4. ġ�� ��ƽ		400��");
			System.out.println("5. ������		2000��");
			System.out.println("����� ******************");
			System.out.println("6. �ݶ�		700��");
			System.out.println("7. ���̵�		1200��");
			System.out.println("8. Ŀ��		1000��");
			System.out.println("**************************");
			System.out.print("�޴� ����(��ȣ�� �Է�) : ");
			
			int num1 = sc.nextInt();
				switch(num1) {
				case 1 :
					menu = "�Ұ�� ����";
					str += "�Ұ�� ����";
					price = 3500;
					break;
				case 2 : 
					menu = "ġŲ ����";
					str += "ġŲ����";
					price = 3200;
					break;
				case 3 : 
					menu = "����Ƣ��";
					str += "����Ƣ��";
					price = 1000;
					break;
				case 4 : 
					menu = "ġ�ƽ";
					str += "ġ�ƽ";
					price = 400;
					break;
				case 5 :
					menu = "������";
					str += "������";
					price = 2000;
					break;
				case 6 :
					menu = "�ݶ�";
					str += "�ݶ�";
					price = 700;
					break;
				case 7 :
					menu = "���̵�";
					str += "���̵�";
					price = 1200;
					break;
				case 8 :
					menu = "Ŀ��";
					str += "Ŀ��";
					price = 1000;
					break;				
			}
			
				System.out.println(menu + " ��(��) ���� �ϼ̽��ϴ�.");
				System.out.print("������? : ");
				count = sc.nextInt();
				System.out.println(count + "�� �ֹ� �ϼ̽��ϴ�.");
				sum = price * count;
				
				str += " : " + count + " �� - " + sum + "��\n";
				total += sum;
				System.out.println("��� �ֹ� �Ͻðڽ��ϱ�? (y/n)");
				answer = sc.next();
			
				System.out.println("* �ֹ��Ͻ� ������ ������ �����ϴ�.");
				System.out.println("-----------------------------------------------------------");
				System.out.println(str);
				System.out.println("-----------------------------------------------------------");
				System.out.println("�� ����: " + total);
			
		} while (answer.equals("Y") || answer.equals("y") );
	}
}
