package com.test.chap03_myException;

public class MyException extends Exception {
	//Exception ��ӹ޾� ����Ŭ������ ����
	public MyException() {
		System.out.println("���� ���� ���� Ŭ����");
	}
	public MyException(String msg) {
		super(msg);
	}
}
