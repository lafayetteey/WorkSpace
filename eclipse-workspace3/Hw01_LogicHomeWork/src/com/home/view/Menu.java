package com.home.view;

import java.util.Scanner;

import com.home.controller.Function;

public class Menu {
	public static void displayMenu() {
		//do-while문으로 작성
		Scanner sc = new Scanner(System.in);
		Function func = new Function();
		int num = 0;
		String answer = " ";
		
		do {
			
			int num1 = 0;
			System.out.println("***지역변수/연산자/제어문 연습 프로그램***");
			System.out.println();
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합계 구하기");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.println();
			
			System.out.print("메뉴 번호 입력: ");
			num1 = sc.nextInt();
			
			
			switch(num1) {
			case 1 :
				func.calculator();
				break;
			case 2 :
				func.totalcalculator();
				break;
			case 3 :
				func.profile();
				break;
			case 4 : 
				func.sungjuk();
				break;
			case 5 :
				func.printStarNumber();
				break;
			case 6 :
				func.sumRandomNumber();
				break;
			case 7 :
				func.continueGugudan();
				break;
			case 8 : 
				func.shutNumber();
				break;
			case 9 :
				System.out.println("프로그램 종료.");
				break;			
			}
			if(num1 < 9) {
			System.out.print("계속하시겠습니까? (y/n)");
			answer = sc.next();
			System.out.println();
				if(answer.equals("n") || answer.equals("N")) {
					System.out.println();
					System.out.println("프로그램 종료");
				}
			} else {
				System.out.println();
				break;
			}
		} while(answer.equals("Y") || answer.equals("y"));
		
	}
}
