package com.practice2;

import java.util.Scanner;

public class If {
//	1. ���� �ΰ��� �Է¹޾�, �μ��� ��������� ó���ؼ� ����ϼ���
//	��, �� �� ��� �ݵ�� 1~100������ ���̾����
//	�Է¹��� �ΰ��� ���� �� �ϳ��� ������ ������ ������
//	"���� 1���� 100���̾�� �մϴ�" ��� ���
	public void IfExam() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է�: ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� �Է�: ");
		int b = sc.nextInt();
		
		if(a<100 && 1 < a && b <100 && 1< b) {
			System.out.println("���ϱ� ��: " + (a + b));
			System.out.println("���� ��: " + (a - b));
			System.out.println("���ϱ� ��: " + (a * b));
			System.out.println("������ ��: " + (a / b));
			System.out.println("������ ��: " + (a % b));
		}else { 
			System.out.println("1~100������ �������� ��ȿ�մϴ�.");
		}
	}
	 //������ �ϳ� �Է� �޾� ����� ������ ������ ����� ���
	//90�� �̻��� A��� 
	//90�� �̸� 80�� �̻� B���  
	//80�� �̸� 70�� �̻� C��� 
	//70�� �̸� 60�� �̻��� D ���
	//60�� �̸��� F���
	public void IfExam01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int score = sc.nextInt();
		char ch = ' ';
		
		
		if(score >= 90) {
			ch = 'A';
		} else if (score <90 && score >80) { 
			ch = 'B';
		} else if (score <80 && score > 70) {
			ch = 'C';
		} else if (score < 70 && score > 60) { 
			ch = 'D';
		} else {
			ch = 'F';
		}
		System.out.printf("����� ������ %d �̰�, ����� %c �Դϴ�." , score , ch);
	}
}
