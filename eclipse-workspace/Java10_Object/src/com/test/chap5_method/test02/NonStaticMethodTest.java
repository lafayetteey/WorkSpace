package com.test.chap5_method.test02;


//�Ű����� ������ ��ȯ�� ������ ���� �޼ҵ� ����
public class NonStaticMethodTest {
	//static : Ŭ������.�޼ҵ��
	//non_static : new ������
		//1. �Ű����� ���� ��ȯ�� ���� �޼ҵ�
		public void method1() {
			//�޼ҵ� ���븸 ���� �� ���ϰ� ���� ȣ��� �޼ҵ�� ���ư���.
			System.out.println("�Ű������� ��ȯ���� �� �� ���� �޼ҵ� ");
		}
		//2. �Ű����� ���� ��ȯ�� �ִ� �޼ҵ�
		public String method2() {
			return "�Ű������� ������ ��ȯ���� �ִ� �޼ҵ�";
		}
		//3 �Ű������� �ְ� ��ȯ�� ���� �޼ҵ�
		public void method(int num1 , int num2) {
			int sum = num1 + num2;
			System.out.println("sum : " + sum);
		}
		//4. �Ű����� �� ��ȯ�� ��� �ִ� �޼ҵ�	
		public int method4(int num1 , int num2) {
			return num1 + num2;
		}
	
	
	
}
