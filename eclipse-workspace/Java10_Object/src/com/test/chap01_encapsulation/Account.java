package com.test.chap01_encapsulation;

public class Account {
	// 필드
	private String name = "김승진";
	private String accNo = "0151444545366";
	private String pw = "12345";
	private int bankcode = 20;
	private int balance = 0;

	// 생성자 (constructor)
	public Account() {

	}

	// 입금을 위한 메소드
	public void deposit(int money) {
		if (money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원 입금");
		} else {
		System.out.println("잘못된 금액 입력입니다.");	
		}
	}

	// 출금
	public void withdraw(int money) {
		if(money <balance ) {
			balance -= money;
			System.out.println(name + "님의 계좌에 " + money + "원 출금");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}

	// 잔액조회
	public void displayBalance() {
		System.out.println(name +"님의 현재 잔액은 " + balance + " 원 입니다.");
		System.out.println();
	}

}
