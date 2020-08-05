package com.test.chap01_encapsulation;

public class Account {
	// �ʵ�
	private String name = "�����";
	private String accNo = "0151444545366";
	private String pw = "12345";
	private int bankcode = 20;
	private int balance = 0;

	// ������ (constructor)
	public Account() {

	}

	// �Ա��� ���� �޼ҵ�
	public void deposit(int money) {
		if (money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "�� �Ա�");
		} else {
		System.out.println("�߸��� �ݾ� �Է��Դϴ�.");	
		}
	}

	// ���
	public void withdraw(int money) {
		if(money <balance ) {
			balance -= money;
			System.out.println(name + "���� ���¿� " + money + "�� ���");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
	}

	// �ܾ���ȸ
	public void displayBalance() {
		System.out.println(name +"���� ���� �ܾ��� " + balance + " �� �Դϴ�.");
		System.out.println();
	}

}
