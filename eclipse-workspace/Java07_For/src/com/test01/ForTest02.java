package com.test01;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		//ForTest02.testFor1();
		//ForTest02.testFor2();
		//ForTest02.testFor3();
		//	ForTest02.testFor4();
			ForTest02.testFor5();
	}
	//��ø for ��
	//i �� 1 �϶� j �� 0~9���� �ݺ� , i �� 2 �϶��� j�� 0~9 �ݺ�
	public static void testFor1() {
		for(int i =0 ; i<10 ; i++ ) {
			
			for( int j =0;  j<10; j++) {
				System.out.println("i= " + i +","  + " j= " + j) ;
			}
			System.out.println();
			
		}		
	}
	public static void testFor2() {
		//������ 2�� ���� 9�ܱ��� ���	
		//�ٱ��� for���� 2�� �ݺ��Ҷ� ���� num �� 1~9���� �ݺ��ȴ�.
		//�ٱ��� for���� 3�� �ݺ��Ҷ��� ���� num �� 1~9���� �ݺ�
			for(int dan = 2; dan < 10 ; dan++) {
				for(int num = 1; num < 10; num ++) {
					System.out.println(dan  +"*"  + num + "=" + (dan * num) );
				}
				System.out.println();
		}
	}
	
	public static void testFor3() {
		for(int hour = 0 ; hour <24 ; hour ++) {
			for(int min = 0; min <60;  min++) {
				
					System.out.println(hour + " �� " + min + " ��");			
			}
		}
	}
	public static void testFor4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� ���� ��: ");
		int row = sc.nextInt();
		for(int i =1; i<=row; i++) {
			for(int c = 1; c<=5 ; c++ ) {
			System.out.print("*");
			}
			System.out.println();
		}			
	}
	
	public static void testFor5() {
		/*
		���ٿ� ��ǥ���ڸ� �Էµ� �ټ��� ĭ�� ��ŭ ���
		1*****
		*2****
		**3***
		***4**
		****5*
		*****6
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: " );
		int num = sc.nextInt();
		
		for( int i=1; i<=num; i++) {
			for (int j =1; j <= num; j++) {
				if(i == j) {
					System.out.print(j);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.print("�� ��: ");
		int row = sc.nextInt();
		System.out.print("ĭ ��: ");
		int col = sc.nextInt();
		
		for(int r = 1; r <= row; r++) {
			for(int c =1; c <= col; c++) {
				if(r == c ) {
					System.out.print(c);
				} else {
					System.out.print("*");
				}			
			}		
			System.out.println();
		}
	}

	
	public static void testFor5_5() {
		
	}
}

	

