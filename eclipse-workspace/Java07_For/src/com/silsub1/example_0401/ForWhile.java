package com.silsub1.example_0401;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);
	
	public void printStar1() {
		System.out.print("정수 하나 입력: ") ;	
		int num =sc.nextInt();
		//바깥쪽 for문의 조건문에 따라 몇줄이 생성될지 결정
			for(int i = 1; i <=num; i++) {
				for(int j = 1; j<=num; j++) {
					if(num>0) {
						if(i == j) {
							System.out.print(j);
						} else {
							System.out.print("*");
						}
					} else {
						System.out.println("양수가 아닙니다.");
					}
				}
				System.out.println();
			}		
		}

	
	public void printStar1_1() {
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		if(num>0) {
			for(int r =1; r<=num; r++) {
				for(int j =1; j<=r; j++) {
					if(r==j) {
						System.out.print(j);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	public void printStar2() {
		System.out.print("숫자 하나 입력: ");
		int num = sc.nextInt();
	
		if(num>0) {
			for(int i =1; i<=num; i++) {
				for(int j =1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			for(int i= 1; i<=Math.abs(num); i++) {
				for(int j = Math.abs(num); j>=i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} 
		if(num==0) {
			System.out.println("출력 기능이 없습니다.");
		}	
	}
	
	public void selectMenu() {
		

	}
	public void countinputCharacter() {
	/*[문제 4]
			  : 문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
			   문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
			   단, 영문자만 입력받도록 함.
			 - 메소드명 : public void countInputCharacter(){}
				ex>
				문자열 입력 : application
				문자 입력 : p
				포함된 갯수 : 2 개
				====================
				문자열 입력 : apple_test123
				영문자가 아닙니다.*/
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("문자 입력: ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
				char ch1 = str.charAt(i);
				if (ch1==ch){
					count ++;			
				}
			} else {
				System.out.println("영문자가 아닙니다.");	
				break;
			}
		}
		System.out.println("포함된 갯수: " + count);	
	}
	
	public void countCharacters() {
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		System.out.print("문자 입력: ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		for(int i =0 ; i<str.length(); i++) {
			//유니코드
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z' ) {
				char ch1 = str.charAt(i);
				if(ch1 == ch) {
					count++;
				}
			} else {
				System.out.println("영문자가 아닙니다.");
				System.exit(0);
			}
			
		}
		
		System.out.println("포함된 갯수: " + count);
	}
	
}


