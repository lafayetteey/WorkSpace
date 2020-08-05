package com.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	public SpaceUpper() {
		
	}
	
	public void spaceUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어를 입력하시오(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(str);
		String upper = " ";
		while(st.hasMoreTokens()) {
			upper = st.nextToken().concat(" ");
			
			StringBuilder sb = new StringBuilder();
			upper = upper.substring(0 ,1).toUpperCase() + upper.substring(1, upper.length() );
			System.out.print(upper);
 		}
	}

	public void spaceUpper2() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("영어를 입력하시오(띄어쓰기 포함) : " );
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str , " " );
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			for(int i =0; i<token.length(); i++) {
				if(i==0) {
					sb.append(token.toUpperCase().charAt(i));
				} else {
					sb.append(token.charAt(i));
				}
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}

	public void spaceUpper3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어를 입력하세요(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			for(int i =0; i<token.length(); i++) {
				if(i==0) {
					sb.append(token.toUpperCase().charAt(i));
				} else {
					sb.append(token.charAt(i));
				}
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}
	
	
}
