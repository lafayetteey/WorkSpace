package com.test.chap03_myException;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		//Exception ��ӹ޾� ����Ŭ������ ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		try {
			checkNum(sc.nextInt());
		} catch (MyException e) {
			System.out.println("�����ͼ��� ���� �߻�");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void checkNum(int num) throws MyException {
		if(num<10) {
//			MyException me = new MyException();
//			throw me;
			throw new MyException(num+"��(��) 10���� �۽��ϴ�.");
		} else {
			System.out.println(num + "��(��) 10���� ũ�ų� ���� �� ");
		}
	}

}
