package com.test.chap5_method.test02;

public class StaticMethodTest {
	//static �޼ҵ� 
	public static void staticMethod1() {
	int num = 10;
	int num2 = 20;
	System.out.println("10�� 20�� ���� " + (num+num2) + "�Դϴ�.");
	}
	//����Ÿ���� �ִ� static �޼ҵ�
	public static int staticMethod2() {
		int num = 10;
		int num2 = 25;
		return num+num2;
	}
	
	//�Ű������� �ִ� static �޼ҵ�
	public static void staticmethod3(String name) {
		System.out.println(name + "���� �湮�� ȯ���մϴ�.");
	}
	
	//�Ű������� ����Ÿ�Ե� �ִ� �޼ҵ�
	public static String staticmethod4(String name) {
		return name + "���� �湮�� ȯ���մϴ�.";
	}
	
	
	
	
	
	
	
	
	
}
