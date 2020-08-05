package com.test.chap03_stringTokenizer.run;

import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		String str = "김승진 , 남 , 서울 , 관악구 , 신림동 거주";
		
		StringTokenizer st = new StringTokenizer(str , ",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}
}
