package khacademy_0327_exam_04;

import java.util.Scanner;

public class CastingSample {

		//키보드로 문자하나를 입력받아, 그 문자의 유니코드를 출력되게 함
		public void printUniCode() {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자 입력: ");
			char ch = sc.next().charAt(0);
			System.out.println("A is uniCode: " + (int) ch);			
		}
		
		//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 계산해서 출력함
		public void calculatorScore() {
			Scanner sc = new Scanner(System.in);
			System.out.print("국어: ");
			double d1 = sc.nextDouble();
			System.out.print("영어: ");
			double d2 = sc.nextDouble();
			System.out.print("수학: ");
			double d3 = sc.nextDouble();
			
			System.out.println("총점: " + (int) (d1 + d2 + d3) );
			System.out.println("평균: " + (int) (d1 + d2 + d3) / 3);
		}
}
