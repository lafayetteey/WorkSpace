package com.poly.test.test04;

//�߻�Ŭ������ �������̽� ���ÿ� ��� ����
public class Eagle extends Animal implements Bird {

	@Override
	public void fly() {
		System.out.println("�Ĵ��Ĵ�");
	}

	@Override
	public void bark() {
		System.out.println("��������");
	}

	
}
