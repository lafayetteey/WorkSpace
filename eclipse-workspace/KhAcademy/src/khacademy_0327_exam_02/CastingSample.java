package khacademy_0327_exam_02;

import java.util.Scanner;

public class CastingSample {
	
	//- Ű����� �����ϳ��� �Է¹޾�, �� ������ �����ڵ带 ��µǰ� ��
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: ");
		char ch = sc.next().charAt(0);
		System.out.println("A is uniCode: " + (int) ch);
	}
	
	//�Ǽ������� ����, ����, ���� �� ������ ������ �Է¹޾� ������ ����� ����ؼ� �����
	
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		double a = sc.nextDouble();
		System.out.print("����: ");
		double b = sc.nextDouble();
		System.out.print("����: " );
		double c = sc.nextDouble();
		
		System.out.println("����: " +(int) (a + b + c ) );
		System.out.println("��� ����: " + (int) (a + b + c) / 3 );
		
	}
}
