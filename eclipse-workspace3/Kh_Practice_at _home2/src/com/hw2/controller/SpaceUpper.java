package com.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	public SpaceUpper() {

	}

	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문을 입력하세요(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			for(int i =0; i<token.length(); i++) {
				if(i==0) {
					System.out.print(token.toUpperCase().charAt(i));
				} else {
					System.out.print(token.charAt(i));
				}
			}
			System.out.print(" ");
		}
	}

	public void spaceToUpper2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문 입력(띄어쓰기 포함) : ");
		String input = sc.nextLine();
		System.out.println(input);
		StringTokenizer st = new StringTokenizer(input);
		StringBuilder sb = new StringBuilder();
		String val = " ";
		while(st.hasMoreTokens()) {
			val = st.nextToken().concat(" ");
			val = val.substring(0, 1).toUpperCase() + val.substring(1, val.length());
			System.out.print(val);
		}
	}
}
