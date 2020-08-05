package com.hw1.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestWork {
	
	public TestWork() {
		
	}
	
	public void afterToken(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println("토큰 처리 전 글자: " + sb);
		System.out.println("토큰 처리 전 갯수 :" + sb.capacity());
		System.out.println("토큰 처리 후 글자 : " + str.replaceAll(" ", ""));
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("토큰 처리 후 갯수: " + st.countTokens());
		System.out.print("모두 대문자로 변환 : " );
		while(st.hasMoreTokens()) {
		System.out.print(st.nextToken().toUpperCase());
		}
		System.out.println();
		System.out.println();
	}
	public void findChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String str = sc.next();
		String str1 = str.substring(0, 1).toUpperCase() + str.substring(1);
		System.out.println(str1);
		System.out.print("찾을 문자를 하나 입력하세요: ");
		char ch = sc.next().charAt(0);
		int count= 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("a 문자가 포함 된 갯수 : " + count);
		
			
	
		}

	public void afterToken2(String str) {
		
	}
	public void findChar2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: " );
		String str = sc.next();
		System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
		System.out.print("찾을 문자 하나를 입력하세요: ");
		char ch = sc.next().charAt(0);
		int count = 0;
	
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				count++;
			}	
		}
		System.out.println("a 문자가 들어간 갯수 : " + count);
	}
}
