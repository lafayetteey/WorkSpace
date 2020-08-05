package com.test01;

public class ArrayTest02 {
	public static void main(String[] args) {
		//1. a~z 까지 저장을 한 일차원 배열 출력
		
		char[] ch = new char[26];
		for(int i =0; i<ch.length; i++) {
			//ch변수에 a~z까지 저장
			//a를 int 유니코드로 변환 후 다시 char 값으로 강제타입변환
			ch[i] = (char) ((int) ('a' +i));
		}
		
		
		//prn(ch);
		
		//2. 1번에서 만든 배열을 거꾸로 출력
		//3. 1번에서 만든 배열을 대문자로 바꾸어 출력
		upper(ch);
	}
	
	private static void upper(char[] ch) {
		char[] up = new char[26];
		for(int i =0 ; i<ch.length; i ++) {
		//아스키 코드 참조
		//대문자와 소문자의 차이 수 만큼 ch[i]에서 빼준다.
		//(int) 변환 필수.
		ch[i] = Character.toUpperCase(ch[i]);
		//ch[i] = (char)((int) ch[i]- 35);
		}
		prn(ch);
	}

	private static void reverse(char[] ch) {
		char[] re = new char[26];
		int temp = 0;
		//인덱스는 0 부터 시작하기 때문에 -1을 해줘야 한다.
		//ex) 26인덱스면 끝 인덱스가 25임
		for(int i = ch.length -1; i>=0; i--) {
			re[temp] = ch[i];
			temp++;					
		}
		prn(re);
	}

	public static void prn(char[] ch) {
		for(int i =0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");
			if(i%6==5) {
				System.out.println();
			}
		}
		System.out.println();
		
	}
	
}
