package khacademy_0327_exam_02;

import java.util.Scanner;

public class CastingSample {
	
	//- 키보드로 문자하나를 입력받아, 그 문자의 유니코드를 출력되게 함
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		char ch = sc.next().charAt(0);
		System.out.println("A is uniCode: " + (int) ch);
	}
	
	//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 계산해서 출력함
	
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		double a = sc.nextDouble();
		System.out.print("영어: ");
		double b = sc.nextDouble();
		System.out.print("수학: " );
		double c = sc.nextDouble();
		
		System.out.println("총점: " +(int) (a + b + c ) );
		System.out.println("평균 점수: " + (int) (a + b + c) / 3 );
		
	}
}
