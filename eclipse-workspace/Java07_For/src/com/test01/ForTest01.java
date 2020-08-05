package com.test01;

import java.util.Scanner;

public class ForTest01 {
	public static void main(String[] args) {
		//	ForTest01.testFor();
		//	ForTest01.testFor2();
		//ForTest01.testFor2_2();
		//	ForTest01.testFor2_3();
		//ForTest01.testFor3();
		//ForTest01.testFor4();
		ForTest01 test = new ForTest01();
		test.testFor05();
		
	}
	public static void testFor() {
		//0~10 출력'
		 for(int i =0 ;i<=10; i++) {
			 System.out.println(i + " 번째 반복");
		 }
	}
	public static void testFor2() {
		//1~100 까지 역순 출력
		for(int i =100; i>0; i--) {
			//10으로 나누었을때 나머지가 0이라면 줄바꿈
			if(i%10 ==0) {
				System.out.println();
			}
			System.out.print(" " + i );
			
		}
	}
	
	public static void testFor2_2() {
		//증감식 (2 씩 증가)
		for(int i=0; i<100; i++) {
			if(i%2==0) {
				System.out.print(" " + i);
			}
		}
		for(int i= 1; i<10; i+=2) {
			System.out.println( i + " 번째 출력");
		}	
		//초기식과 증감식은 1개 이상 기입가능
		for(int i=0,j=10;i<10 && j >0; i++, j--) {
			 System.out.println(i + " 번째 i 출력");
			 System.out.println(j+ " 번째 j 출력");
		}
		
		System.out.println();
		
		//int 가 아닌 char 초기값 설정
		for( char ch = 'a' ; ch <='z' ; ch++ ) {
			System.out.println(ch);
		}
	}
	
	public static void testFor2_3() {
		/*
		 * int  i = 1;
		
		// 조건식이 없다면 무한 반복된다.
		while(i<10) {
			System.out.println(i +" 번째 반복문 수행");
			i++; //while의 증감식은 while 문이 끝나는 시점에 적는다.
		}
	}
	*/
		int i =1;
		for(  ;   ; ) {
			System.out.print(i + " " );
			i++;
			if(i == 10) {
				break;
			}
		}
	
	}
	
	public static void testFor3() {
		//정수를 하나 입력 받아 그 수가 양수 일때만 그수의 구구단을 출력;
		//양수가 아니면 "반드시 1~9사이의 양수를 입력!! 이라고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요: ");
		int num = sc.nextInt();
		if(num>0 && num <=9) {
			for(int i = 1; i<10; i++) {
				System.out.println(num + " * " + i + "= " + (num * i));
			}
		} else {
			System.out.println("반드시 1~9까지의 양수 입력!!");
		}
	}
	
	public static void testFor4() {
		//1~100사이 임의의 난수까지 정수들의 합계를 구하여 출력
		//Math.random() = return double
		//정수로 구하기 위해 +1을 해준다.
		int random = (int) ( Math.random() * 100 ) +1;
		int sum = 0;
		
		for(int i=0; i<=random; i++) {
			sum += i;
		}
		System.out.println("1부터 " +"random : " +  random + " 까지의 정수들의 합계: " + sum);
		
		
	}
	public void testFor05() {
		//정수 두개 입력 후
		//작은수 ~ 큰수 까지의 합
		//변수 3개 , 입력받을 변수 2개 총합 5개의 int 변수 필요
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int min = 0;
		int max = 0;
		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		if(num1>num2) {
			max = num1;
			min = num2;
			for(int i = min ; i <= max; i++) {
				sum += i;
			}
		}	else {
			max = num2;
			min = num1;
			for(int i = min ; i <= max; i++) {
				sum += i;
			}
		}
		System.out.println(min + " 에서" + max + " 까지의 정수들의 합: " + sum);

		
		
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
