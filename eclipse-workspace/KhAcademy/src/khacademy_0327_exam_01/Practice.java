package khacademy_0327_exam_01;

import java.util.Scanner;

public class Practice {
	//���� 1: Ű����� ���� �ΰ��� �Է¹޾� �� ���� ��, ��,��,������,������ �� ���
	public void integer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ ���� �Է��ϼ���:  ");
		int a = sc.nextInt();
		System.out.print("�ι�° ������ ���� �Է��ϼ���: " );
		int b = sc.nextInt();
		
		//���ڿ��� ���� ����ϸ� int ���� ���ڿ��� �ڵ� �� ��ȯ �ǹǷ� ( ) �� ������
		System.out.println("���ϱ� ��: " + (a + b));
		System.out.println("���� ��: " + (a - b));
		System.out.println("���ϱ� ��: " + (a * b));
		System.out.println("������ ��: " + (a / b));
		System.out.println("������ ��: "  + ( a % b));		
		
		System.out.println("-----------------------");
	}
	//���� 2: Ű����� ����, ���� ���� �Ǽ������� �Է¹޾� �簢���� ������ �ѷ��� ����Ͽ� ���
	public void double1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����: ");
		double d1 = sc.nextDouble();
		System.out.print("���� ����: ");
		double d2 = sc.nextDouble();
		
		System.out.println("�簢���� ����: " + (d1 * d2));
		System.out.println("�簢���� �ѷ�: " + (d1 + d2) *2) ;
		
		System.out.println("-----------------------");
	}
	
	//����3: ����ڿ� ���� Ű����� �Է¹޾� �� �ڸ��� ���ڸ� ����
	public void keyCode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���: ");
		String str = sc.nextLine();
		System.out.println("ù��° ����: " + str.charAt(0));
		System.out.println("�ι�° ����: " + str.charAt(1));
		System.out.println("����° ����: " + str.charAt(2));
		
	}
	
}
