package khacademy_0327_exam_03;

import java.util.Scanner;

public class Example {
	///문제 1: 키보드로 정수 두개를 입력받아 두 수의 합, 차,곱,나누기,나머지 몫 출력
	public void Integer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수: ");
		int b = sc.nextInt();
		
		System.out.println("더하기 값: " + (a + b));
		System.out.println("빼기 값: " + (a - b));
		System.out.println("곱하기 값: " + (a * b));
		System.out.println("나누기 값: " + (a / b));
		System.out.println("나머지 값: " + (a % b));
	}
	//문제 2: 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력
	public void double01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로의 값: ");
		double a = sc.nextDouble();
		System.out.print("세로의 값: ");
		double b = sc.nextDouble();
		
		System.out.println("사각형의 면적: " + (a * b));
		System.out.println("사각형의 둘레 : " + (a + b) * 2);		
	}
	//문제3: 영어문자열 값을 키보드로 입력받아 각 자리의 문자를 추출
	public void keyCode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		System.out.println("첫번째 문자열: " + str.charAt(0));
		System.out.println("두번째 문자열: " + str.charAt(1));
		System.out.println("세번째 문자열: " + str.charAt(2));
		
	}
	
	
	
	
	
}
