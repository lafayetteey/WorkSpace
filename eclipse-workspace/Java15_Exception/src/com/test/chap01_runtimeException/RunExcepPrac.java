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
			System.out.print("나눌수를 입력 : ");
			int no = sc.nextInt();

			if(no==0) {	
				System.out.println("0이 아닌 값을 입력하세요.");
			} else {
			res = ran / (double) no;
			System.out.println(ran + " / " + no + " = " + res);
			}
		}	
	}

	public void ClassNArrayEx() {
		//ClassCastException
		//(AutoBoxing) 다형성 적용
//		Object obj = 'a';
//		System.out.println(obj);
//		//Character객체를  String 으로 변환 시도
//		String str = (String)obj;
		
		//ArrayIndexOutOfBoundsException
//		int[] arr = new int[2];
//		arr[0] = 1;
//		arr[1] = 2;
//		
//		arr[2] = 3;
//		System.out.println("출력문이 실행 될까요?");
		
		
		try {
		//NullPointerException
		String str = null;
		int len = str.length();
		System.out.println(len);
		} catch (NullPointerException e) {
			System.out.println("널포인터 익셉션 입니다.");
			e.printStackTrace();
			//e.printStackTrace(); //에러코드들을 출력
		} finally {
			System.out.println("프로그램 종료");
		}
		
//		int[] arr = new int[2];
//		arr[0] = 1;
//		arr[1] = 2;
//		
//		try {
//		arr[2] = 3;
//		} catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
//			System.out.println("어레이 인덱스 or 널포인터 익셉션");
//		} finally {
//			System.out.println("프로그램 종료");
//		}
	}
}
