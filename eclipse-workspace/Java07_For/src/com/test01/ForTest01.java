package com.test01;

import java.util.Scanner;

public class ForTest01 {
	public static void main(String[] args) {
		//	ForTest01.testFor();
		//	ForTest01.testFor2();
		//ForTest01.testFor2_2();
		//	ForTest01.testFor2_3();
		//ForTest01.testFor3();
		//ForTest01.testFor4();
		ForTest01 test = new ForTest01();
		test.testFor05();
		
	}
	public static void testFor() {
		//0~10 ���'
		 for(int i =0 ;i<=10; i++) {
			 System.out.println(i + " ��° �ݺ�");
		 }
	}
	public static void testFor2() {
		//1~100 ���� ���� ���
		for(int i =100; i>0; i--) {
			//10���� ���������� �������� 0�̶�� �ٹٲ�
			if(i%10 ==0) {
				System.out.println();
			}
			System.out.print(" " + i );
			
		}
	}
	
	public static void testFor2_2() {
		//������ (2 �� ����)
		for(int i=0; i<100; i++) {
			if(i%2==0) {
				System.out.print(" " + i);
			}
		}
		for(int i= 1; i<10; i+=2) {
			System.out.println( i + " ��° ���");
		}	
		//�ʱ�İ� �������� 1�� �̻� ���԰���
		for(int i=0,j=10;i<10 && j >0; i++, j--) {
			 System.out.println(i + " ��° i ���");
			 System.out.println(j+ " ��° j ���");
		}
		
		System.out.println();
		
		//int �� �ƴ� char �ʱⰪ ����
		for( char ch = 'a' ; ch <='z' ; ch++ ) {
			System.out.println(ch);
		}
	}
	
	public static void testFor2_3() {
		/*
		 * int  i = 1;
		
		// ���ǽ��� ���ٸ� ���� �ݺ��ȴ�.
		while(i<10) {
			System.out.println(i +" ��° �ݺ��� ����");
			i++; //while�� �������� while ���� ������ ������ ���´�.
		}
	}
	*/
		int i =1;
		for(  ;   ; ) {
			System.out.print(i + " " );
			i++;
			if(i == 10) {
				break;
			}
		}
	
	}
	
	public static void testFor3() {
		//������ �ϳ� �Է� �޾� �� ���� ��� �϶��� �׼��� �������� ���;
		//����� �ƴϸ� "�ݵ�� 1~9������ ����� �Է�!! �̶�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ���: ");
		int num = sc.nextInt();
		if(num>0 && num <=9) {
			for(int i = 1; i<10; i++) {
				System.out.println(num + " * " + i + "= " + (num * i));
			}
		} else {
			System.out.println("�ݵ�� 1~9������ ��� �Է�!!");
		}
	}
	
	public static void testFor4() {
		//1~100���� ������ �������� �������� �հ踦 ���Ͽ� ���
		//Math.random() = return double
		//������ ���ϱ� ���� +1�� ���ش�.
		int random = (int) ( Math.random() * 100 ) +1;
		int sum = 0;
		
		for(int i=0; i<=random; i++) {
			sum += i;
		}
		System.out.println("1���� " +"random : " +  random + " ������ �������� �հ�: " + sum);
		
		
	}
	public void testFor05() {
		//���� �ΰ� �Է� ��
		//������ ~ ū�� ������ ��
		//���� 3�� , �Է¹��� ���� 2�� ���� 5���� int ���� �ʿ�
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int min = 0;
		int max = 0;
		System.out.print("ù��° ���� �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է�: ");
		int num2 = sc.nextInt();
		if(num1>num2) {
			max = num1;
			min = num2;
			for(int i = min ; i <= max; i++) {
				sum += i;
			}
		}	else {
			max = num2;
			min = num1;
			for(int i = min ; i <= max; i++) {
				sum += i;
			}
		}
		System.out.println(min + " ����" + max + " ������ �������� ��: " + sum);

		
		
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
