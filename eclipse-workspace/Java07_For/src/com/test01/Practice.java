package com.test01;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
	//	Practice.gugudan();
		Practice.gugudan2();
	}
	//������ �ϳ� �Է� �޾� �� ���� ��� �϶��� �׼��� �������� ���;
	//����� �ƴϸ� "�ݵ�� 1~9������ ����� �Է�!! �̶�� ���
	public static void gugudan() {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		num = sc.nextInt();
		if(num>0 && num <= 9) {
			for(int i=1; i <10; i++) {
				System.out.println(num * i);
			}
		} else {
			System.out.println();
		}
	}
	
	public static void gugudan2() {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i*j);
			}
			System.out.println();
		}
	}
}
