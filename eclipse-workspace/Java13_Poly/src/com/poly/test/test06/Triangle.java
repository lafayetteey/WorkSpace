package com.poly.test.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {
	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�غ� �Է�: ");
		int x = sc.nextInt();
		System.out.print("���� �Է�: ");
		int y = sc.nextInt();
		
		double result = (double) x * y / 2;
		
		setRes(String.format("�ﰢ���� %f", result));
	}

}
