package khacademy_0327_exam_04;

import java.util.Scanner;

public class CastingSample {

		//Ű����� �����ϳ��� �Է¹޾�, �� ������ �����ڵ带 ��µǰ� ��
		public void printUniCode() {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է�: ");
			char ch = sc.next().charAt(0);
			System.out.println("A is uniCode: " + (int) ch);			
		}
		
		//�Ǽ������� ����, ����, ���� �� ������ ������ �Է¹޾� ������ ����� ����ؼ� �����
		public void calculatorScore() {
			Scanner sc = new Scanner(System.in);
			System.out.print("����: ");
			double d1 = sc.nextDouble();
			System.out.print("����: ");
			double d2 = sc.nextDouble();
			System.out.print("����: ");
			double d3 = sc.nextDouble();
			
			System.out.println("����: " + (int) (d1 + d2 + d3) );
			System.out.println("���: " + (int) (d1 + d2 + d3) / 3);
		}
}
