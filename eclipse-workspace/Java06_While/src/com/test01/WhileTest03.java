package com.test01;

public class WhileTest03 {

	public static void main(String[] args) {
	//WhileTest03.prn01();
	//WhileTest03.prn02();
	//WhileTest03.prn03();
		WhileTest03.prn04();
	}
	public static void prn01() {
		//1. 1~100������ ���ڸ� �������� ���
		int i = 100;
		
		while(i>0) {
			System.out.println(i + "��° ���");
			i--;
		}	
	}
	
	public static void prn02( ) {
		//2. 1~100������ ���� ��, 2�� ����� ���
		int a = 1;
		
		while(a <= 100) {
			if(a%2==0) {
				System.out.println(a);
			}
			a++;
		}
		
	}
	public static void prn03() {
		//3. 1~100������ ���� ��, 7�� ����� ������ �� ���� ���
		int sum = 0;
		int count =0;
		int b  = 1;
		
		while(b<=100) {
			if(b%7 ==0) {
				System.out.println("7�� ���: " + b)	;	
				System.out.println();
				//7�� ��� �հ踦 ���� ( if������ 7�� ��� ������ ���۵Ǿ����Ƿ� if������ ����������)
				sum += b;
				//7�� ����� �ϳ� ã�������� count �� ����
				count++;
				System.out.println("7�� ��� �� ���� : "  + count);
				System.out.println();
				System.out.println("7�� ��� �� ��: " + sum);
				System.out.println();
			}
			b++;			
		}		
	}
	
	public static void prn04() {
		int sum =0;
		int count = 0;
		int i = 1;
		
		while(i<=100) {
			if(i%3==0) {
				System.out.println("3�� ���: " + i);
				//if�ݺ����� �ѹ� ����ɶ����� count ������ �ݺ� Ƚ�� ���� (�ݺ�Ƚ�� = 3�� ����� ����)
				count++;
				sum += i;
				System.out.println("3�� ��� ����: " + count);
				System.out.println("3�� ����� ��: " + sum);
			}
			
			i++;
		}
	}
}
