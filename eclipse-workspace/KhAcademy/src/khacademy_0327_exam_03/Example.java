package khacademy_0327_exam_03;

import java.util.Scanner;

public class Example {
	///���� 1: Ű����� ���� �ΰ��� �Է¹޾� �� ���� ��, ��,��,������,������ �� ���
	public void Integer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int a = sc.nextInt();
		System.out.print("�ι�° ����: ");
		int b = sc.nextInt();
		
		System.out.println("���ϱ� ��: " + (a + b));
		System.out.println("���� ��: " + (a - b));
		System.out.println("���ϱ� ��: " + (a * b));
		System.out.println("������ ��: " + (a / b));
		System.out.println("������ ��: " + (a % b));
	}
	//���� 2: Ű����� ����, ���� ���� �Ǽ������� �Է¹޾� �簢���� ������ �ѷ��� ����Ͽ� ���
	public void double01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ��: ");
		double a = sc.nextDouble();
		System.out.print("������ ��: ");
		double b = sc.nextDouble();
		
		System.out.println("�簢���� ����: " + (a * b));
		System.out.println("�簢���� �ѷ� : " + (a + b) * 2);		
	}
	//����3: ����ڿ� ���� Ű����� �Է¹޾� �� �ڸ��� ���ڸ� ����
	public void keyCode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str = sc.nextLine();
		System.out.println("ù��° ���ڿ�: " + str.charAt(0));
		System.out.println("�ι�° ���ڿ�: " + str.charAt(1));
		System.out.println("����° ���ڿ�: " + str.charAt(2));
		
	}
	
	
	
	
	
}
