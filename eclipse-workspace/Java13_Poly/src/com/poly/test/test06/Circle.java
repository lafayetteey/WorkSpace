package com.poly.test.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("�������� �Է����ּ��� : ");
		int r = sc.nextInt();
		
		double res = r * r * Math.PI;
		
		//�Ǽ� ���� �޾Ƽ� ���ڿ��� ����(String.format)
		setRes(String.format("%f", res));
	}
	@Override
	public void print() {
		System.out.print("���� ");
		super.print();
	}

}
