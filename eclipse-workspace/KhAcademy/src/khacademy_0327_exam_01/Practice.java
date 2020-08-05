package khacademy_0327_exam_01;

import java.util.Scanner;

public class Practice {
	//문제 1: 키보드로 정수 두개를 입력받아 두 수의 합, 차,곱,나누기,나머지 몫 출력
	public void integer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수의 값을 입력하세요:  ");
		int a = sc.nextInt();
		System.out.print("두번째 정수의 값을 입력하세요: " );
		int b = sc.nextInt();
		
		//문자열과 같이 출력하면 int 값이 문자열로 자동 형 변환 되므로 ( ) 로 감싸줌
		System.out.println("더하기 값: " + (a + b));
		System.out.println("빼기 갑: " + (a - b));
		System.out.println("곱하기 값: " + (a * b));
		System.out.println("나누기 값: " + (a / b));
		System.out.println("나머지 값: "  + ( a % b));		
		
		System.out.println("-----------------------");
	}
	//문제 2: 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력
	public void double1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이: ");
		double d1 = sc.nextDouble();
		System.out.print("세로 길이: ");
		double d2 = sc.nextDouble();
		
		System.out.println("사각형의 면적: " + (d1 * d2));
		System.out.println("사각형의 둘레: " + (d1 + d2) *2) ;
		
		System.out.println("-----------------------");
	}
	
	//문제3: 영어문자열 값을 키보드로 입력받아 각 자리의 문자를 추출
	public void keyCode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String str = sc.nextLine();
		System.out.println("첫번째 문자: " + str.charAt(0));
		System.out.println("두번째 문자: " + str.charAt(1));
		System.out.println("세번째 문자: " + str.charAt(2));
		
	}
	
}
