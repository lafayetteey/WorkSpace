package com.hw1.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestWork {
	
	public TestWork() {
		
	}
	
	public void afterToken(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println("��ū ó�� �� ����: " + sb);
		System.out.println("��ū ó�� �� ���� :" + sb.capacity());
		System.out.println("��ū ó�� �� ���� : " + str.replaceAll(" ", ""));
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("��ū ó�� �� ����: " + st.countTokens());
		System.out.print("��� �빮�ڷ� ��ȯ : " );
		while(st.hasMoreTokens()) {
		System.out.print(st.nextToken().toUpperCase());
		}
		System.out.println();
		System.out.println();
	}
	public void findChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str = sc.next();
		String str1 = str.substring(0, 1).toUpperCase() + str.substring(1);
		System.out.println(str1);
		System.out.print("ã�� ���ڸ� �ϳ� �Է��ϼ���: ");
		char ch = sc.next().charAt(0);
		int count= 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("a ���ڰ� ���� �� ���� : " + count);
		
			
	
		}

	public void afterToken2(String str) {
		
	}
	public void findChar2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: " );
		String str = sc.next();
		System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
		System.out.print("ã�� ���� �ϳ��� �Է��ϼ���: ");
		char ch = sc.next().charAt(0);
		int count = 0;
	
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				count++;
			}	
		}
		System.out.println("a ���ڰ� �� ���� : " + count);
	}
}
