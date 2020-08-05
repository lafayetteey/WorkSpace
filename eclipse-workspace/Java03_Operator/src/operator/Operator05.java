package operator;

import java.util.Scanner;

public class Operator05 {

	public static void main(String[] args) {
		//and 와 or 연산자
		//&&(그리고, ~면서) A && B : 두개의 값 모두 true 일 경우에만 true 리턴 
		//|| (또는, ~거나) A || B  : 두개의 값 모두 false일 경우에만 false 리턴
		new Operator05().opTest1();
		
	}
	public void opTest1() {
		Scanner sc = new Scanner(System.in);
		
		//1 ~ 100 사이의 숫자인지 확인
		// 1 <= 변수 && 변수 <= 100;
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		System.out.println("1 부터 100 사이인지 확인: " + (1 <= num && num <= 100) );
		
		//영어 대문자 : 'A' <= 문자변수 && 문자변수 <= 'Z';
		System.out.print("문자 하나 입력: " );
		char ch =  sc.next().charAt(0);
		System.out.println("대문자? : " + ( 'A' <= ch && ch <= 'Z' ) );
	
		// ||  : 여러값을 제시하고 그 중 하나라도 맞는게 있는지 물어볼때 사용한다.
		// 여러값 중 하나라도 true 값이면 true를 리턴
		// 입력한 문자가 대소문자 상관없이 'y' 'Y' 인지 물어볼때
		// 문자변수 == 'y' || 문자변수 == 'Y';
		System.out.print("계속 하시려면 y 혹은 Y를 입력하세요: ");
		char ch1 = sc.next().charAt(0);
		System.out.println("영문자 y or Y 인지 확인: " + (ch1 == 'y' || ch1 == 'Y') );
				
	}
	

}
