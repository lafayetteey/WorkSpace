package khacademy_0327;

import java.util.Scanner;

public class Example {
	public void example01() {
		//���� 1: Ű����� ���� �ΰ��� �Է¹޾�(scanner) �� ���� ��, ��,��,������,������ �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int a = sc.nextInt();
		System.out.print("�ι�° ����: ");
		int b = sc.nextInt();
		
		//int ���� �ڵ���ȯ�� ���� ���� ( ) �� �����ش�.
		System.out.println("���ϱ� ��: " + (a + b));
		System.out.println("���� ��: " + (a - b));
		System.out.println("���ϱ� ��: " + (a * b));
		System.out.println("������ ��: " + (a / b));
		System.out.println("������ ��: " + (a % b));
	}	
	 public void example02() {
		 //���� 2: Ű����� ����, ���� ���� �Ǽ������� �Է¹޾� �簢���� ������ �ѷ��� ����Ͽ� ���
		 Scanner sc = new Scanner(System.in);
		 System.out.print("����: ");
		 double a = sc.nextDouble();
		 System.out.print("����: ");
		 double b = sc.nextDouble();
		 
		 System.out.println("���� : " + (a + b));
		 System.out.println("�ѷ�: " + (a + b)  *  2);
	 }
	 
	 public void example03() {
		 //����3: ����ڿ� ���� Ű����� �Է¹޾� �� �ڸ��� ���ڸ� ����
		 Scanner sc = new Scanner(System.in);
		 System.out.print("���ڿ��� �Է��ϼ���: ");
		 String str = sc.nextLine();
		 
		 //������ �迭�� ���ڿ��� ���� charAt();
		 System.out.println("ù��° ����: " + str.charAt(0));
		 System.out.println("�ι�° ����: " + str.charAt(1));
		 System.out.println("����° ����: "  + str.charAt(2));
	 }
}