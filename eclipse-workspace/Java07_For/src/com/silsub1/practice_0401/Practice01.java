package com.silsub1.practice_0401;

import java.util.Scanner;

public class Practice01 {
	Scanner sc = new Scanner(System.in);
	
	public void selectMenu() {
		String menu = " ";
		String str = " ";
		String answer = " ";
		int price = 0;
		int sum = 0;
		int count = 0;
		int total = 0;
		
		do {
			System.out.println("***�޴��� �����ϼ���***");
			System.out.println();
			System.out.println("�ܹ��� *******************");
			System.out.println("1. �Ұ�����  3500��");
			System.out.println("2. ġŲ����  3200��");
			System.out.println("�߰� *******************");
			System.out.println("3. ����Ƣ��  1000��");
			System.out.println("4. ġ�ƽ  400��");
			System.out.println("5. ������  2000��");
			System.out.println("����� *******************");
			System.out.println("6. �ݶ�  700��");
			System.out.println("7. ���̵�  1200��");
			System.out.println("8. Ŀ��  1000��");
			System.out.println("*****************************");
			
			System.out.print("�޴� ����: ");
			int num1 = sc.nextInt();
			
			switch(num1) {
			case 1 : 
				menu = "�Ұ�����";
				str += "�Ұ�����";
				price = 3500;
				break;
			case 2 :
				menu = "ġŲ����";
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
			}
				System.out.println(menu + "��(��) �����ϼ̽��ϴ�.");
				System.out.print("������? : ");
				count = sc.nextInt();
				System.out.println(count + "�� �ֹ��ϼ̽��ϴ�.");
				sum = price * count;
				
				str += ":" + count + "�� - " + sum + "��\n";
				
				total += sum;
				
				System.out.print("�߰� �ֹ��Ͻðڽ��ϱ�? (y/n)");
				answer = sc.next();
				
				System.out.println("* �ֹ��Ͻ� ������ ������ �����ϴ�. * ");
				
				System.out.println("----------------------------------------------");
				System.out.println(str);
				System.out.println("----------------------------------------------");
				System.out.println("�� ����: " + total);
				
			
		} while(answer.equals("Y") || answer.equals("y"));
	}

	public void countInputCharacter() {
		System.out.print("���ڿ� �Է�: ");
		String str = sc.next();
		System.out.print("���� �Է�: ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		for(int i =0 ; i<str.length(); i++) {
			//A unicode65���� ũ�ų� z unicod���� ������
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z' ) {
				char ch1 = str.charAt(i);
				if(ch1 == ch) {
					count++;
				}
			} else {
				System.out.println("�����ڰ� �ƴմϴ�.");
				break;
			}
			
		} 
		System.out.println("���Ե� ����: " + count);
	}
}
