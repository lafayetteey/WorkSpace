package com.test.chap01_encapsulation;

public class Main {

	public static void main(String[] args) {
		//°´Ã¼ »ý¼º
		Account a = new Account();
		
		a.deposit(1000000);
		a.displayBalance();
		a.deposit(1500000);
		a.displayBalance();
		a.withdraw(500000);
		a.displayBalance();
		
	}
}
