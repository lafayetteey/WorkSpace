package com.silsub1.example_0401;

import java.util.Scanner;

public class ForWhileCheating {
	public void selectMenu() {
		Scanner sc = new Scanner(System.in);
		String answer = " " ;
		String menu = " ";
		String str = " ";
		int sum =0;
		int total=0;
		int count =0;
		int price = 0;
	
		do {
			System.out.println("***메뉴를 선택하세요***");
			System.out.println();
			System.out.println("햄버거 ******************");
			System.out.println("1. 불고기 버거	3500원");
			System.out.println("2. 치킨 버거		3200원");
			System.out.println("추가 ********************");
			System.out.println("3. 감자튀김		1000원");
			System.out.println("4. 치즈 스틱		400원");
			System.out.println("5. 샐러드		2000원");
			System.out.println("음료수 ******************");
			System.out.println("6. 콜라		700원");
			System.out.println("7. 에이드		1200원");
			System.out.println("8. 커피		1000원");
			System.out.println("**************************");
			System.out.print("메뉴 선택(번호로 입력) : ");
			
			int num1 = sc.nextInt();
				switch(num1) {
				case 1 :
					menu = "불고기 버거";
					str += "불고기 버거";
					price = 3500;
					break;
				case 2 : 
					menu = "치킨 버거";
					str += "치킨버거";
					price = 3200;
					break;
				case 3 : 
					menu = "감자튀김";
					str += "감자튀김";
					price = 1000;
					break;
				case 4 : 
					menu = "치즈스틱";
					str += "치즈스틱";
					price = 400;
					break;
				case 5 :
					menu = "샐러드";
					str += "샐러드";
					price = 2000;
					break;
				case 6 :
					menu = "콜라";
					str += "콜라";
					price = 700;
					break;
				case 7 :
					menu = "에이드";
					str += "에이드";
					price = 1200;
					break;
				case 8 :
					menu = "커피";
					str += "커피";
					price = 1000;
					break;				
			}
			
				System.out.println(menu + " 를(을) 선택 하셨습니다.");
				System.out.print("수량은? : ");
				count = sc.nextInt();
				System.out.println(count + "개 주문 하셨습니다.");
				sum = price * count;
				
				str += " : " + count + " 개 - " + sum + "원\n";
				total += sum;
				System.out.println("계속 주문 하시겠습니까? (y/n)");
				answer = sc.next();
			
				System.out.println("* 주문하신 정보는 다음과 같습니다.");
				System.out.println("-----------------------------------------------------------");
				System.out.println(str);
				System.out.println("-----------------------------------------------------------");
				System.out.println("총 가격: " + total);
			
		} while (answer.equals("Y") || answer.equals("y") );
	}
}
