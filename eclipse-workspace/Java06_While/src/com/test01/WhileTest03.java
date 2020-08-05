package com.test01;

public class WhileTest03 {

	public static void main(String[] args) {
	//WhileTest03.prn01();
	//WhileTest03.prn02();
	//WhileTest03.prn03();
		WhileTest03.prn04();
	}
	public static void prn01() {
		//1. 1~100까지의 숫자를 역순으로 출력
		int i = 100;
		
		while(i>0) {
			System.out.println(i + "번째 출력");
			i--;
		}	
	}
	
	public static void prn02( ) {
		//2. 1~100까지의 숫자 중, 2의 배수만 출력
		int a = 1;
		
		while(a <= 100) {
			if(a%2==0) {
				System.out.println(a);
			}
			a++;
		}
		
	}
	public static void prn03() {
		//3. 1~100까지의 숫자 중, 7의 배수의 갯수와 총 합을 출력
		int sum = 0;
		int count =0;
		int b  = 1;
		
		while(b<=100) {
			if(b%7 ==0) {
				System.out.println("7의 배수: " + b)	;	
				System.out.println();
				//7의 배수 합계를 저장 ( if문에서 7의 배수 조건이 시작되었으므로 if문에서 출력해줘야함)
				sum += b;
				//7의 배수를 하나 찾을때마다 count 에 저장
				count++;
				System.out.println("7의 배수 총 갯수 : "  + count);
				System.out.println();
				System.out.println("7의 배수 총 합: " + sum);
				System.out.println();
			}
			b++;			
		}		
	}
	
	public static void prn04() {
		int sum =0;
		int count = 0;
		int i = 1;
		
		while(i<=100) {
			if(i%3==0) {
				System.out.println("3의 배수: " + i);
				//if반복문이 한번 실행될때마다 count 변수에 반복 횟수 저장 (반복횟수 = 3의 배수의 갯수)
				count++;
				sum += i;
				System.out.println("3의 배수 갯수: " + count);
				System.out.println("3의 배수의 합: " + sum);
			}
			
			i++;
		}
	}
}
