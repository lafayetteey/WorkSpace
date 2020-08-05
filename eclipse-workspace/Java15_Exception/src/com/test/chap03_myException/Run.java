package com.test.chap03_myException;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		//Exception 상속받아 예외클래스로 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		try {
			checkNum(sc.nextInt());
		} catch (MyException e) {
			System.out.println("마이익셉션 예외 발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void checkNum(int num) throws MyException {
		if(num<10) {
//			MyException me = new MyException();
//			throw me;
			throw new MyException(num+"은(는) 10보다 작습니다.");
		} else {
			System.out.println(num + "은(는) 10보다 크거나 같은 수 ");
		}
	}

}
