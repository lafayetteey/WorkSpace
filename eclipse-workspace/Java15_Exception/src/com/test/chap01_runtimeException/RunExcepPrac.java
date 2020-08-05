package com.test.chap01_runtimeException;

import java.util.Scanner;

public class RunExcepPrac {
	Scanner sc = new Scanner(System.in);

	// RuntimeException --> ArithmeticException
	public void ArithEx() {
		int ran = 0;
		double res = 0.0;

		while (true) {
			ran = (int) (Math.random() * 10) + 1;
			System.out.print("�������� �Է� : ");
			int no = sc.nextInt();

			if(no==0) {	
				System.out.println("0�� �ƴ� ���� �Է��ϼ���.");
			} else {
			res = ran / (double) no;
			System.out.println(ran + " / " + no + " = " + res);
			}
		}	
	}

	public void ClassNArrayEx() {
		//ClassCastException
		//(AutoBoxing) ������ ����
//		Object obj = 'a';
//		System.out.println(obj);
//		//Character��ü��  String ���� ��ȯ �õ�
//		String str = (String)obj;
		
		//ArrayIndexOutOfBoundsException
//		int[] arr = new int[2];
//		arr[0] = 1;
//		arr[1] = 2;
//		
//		arr[2] = 3;
//		System.out.println("��¹��� ���� �ɱ��?");
		
		
		try {
		//NullPointerException
		String str = null;
		int len = str.length();
		System.out.println(len);
		} catch (NullPointerException e) {
			System.out.println("�������� �ͼ��� �Դϴ�.");
			e.printStackTrace();
			//e.printStackTrace(); //�����ڵ���� ���
		} finally {
			System.out.println("���α׷� ����");
		}
		
//		int[] arr = new int[2];
//		arr[0] = 1;
//		arr[1] = 2;
//		
//		try {
//		arr[2] = 3;
//		} catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
//			System.out.println("��� �ε��� or �������� �ͼ���");
//		} finally {
//			System.out.println("���α׷� ����");
//		}
	}
}
