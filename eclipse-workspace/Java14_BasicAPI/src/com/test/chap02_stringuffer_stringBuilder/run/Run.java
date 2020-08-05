package com.test.chap02_stringuffer_stringBuilder.run;

public class Run {
	/*
	 * StringBuffer , StringBuilder의 특징 - mutable(가변)클래스, 변경과 저장을 위한 메모리공간(버퍼)을 내부에
	 * 지닌다. - 버퍼의 초기값 16개의 문자를 저장 가능하다. 16을 넘어서게 되면 자동으로 증가
	 */

	public static void main(String[] args) {
		// Run.method1();
		// Run.method2();
		Run.method3();
	}

	public static void method1() {
		StringBuilder sb = new StringBuilder("내일 휴일임");
		System.out.println(sb.length()); // 6
		System.out.println(sb.capacity()); // 16 + 6

		StringBuilder sb1 = new StringBuilder(21); // 21개의 문자 저장
		System.out.println(sb1.capacity());

		System.out.println(sb);
	}

	public static void method2() {
		String str = "반가워! ";
		System.out.println("str 기존 : " + str + ", 주소 : " + str.hashCode());

		str += " 나는 String 이라고 해";
		System.out.println("str 추가 후 : " + str + ", 주소 : " + str.hashCode());

		StringBuffer sbf = new StringBuffer("안녕! ");
		System.out.println("sbf 기존: " + sbf + ", 주소 : " + sbf.hashCode());

		sbf.append("난 StringBuffer라고 해");
		System.out.println("sbf 추가 후 :" + sbf + ", 주소 : " + sbf.hashCode());

		StringBuilder sb1 = new StringBuilder("안녕~ ");
		System.out.println(sb1 + "의 주소 : " + sb1.hashCode());
		sb1.append("난 StringBuilder야");
		System.out.println(sb1 + " 의 변경 후 주소 : " + sb1.hashCode());
	}

	public static void method3() {
		//StringBuffer sbf = new StringBuffer("저는 ");
		StringBuilder sb = new StringBuilder("난 ");
		//append 문자열 추가
//		sb.append("잠이 와요");
//		sb.append("~~!");
		sb.append("배가 불러요").append("~!!");
		
		
		
		System.out.println(sb);
		
		//insert (문자열 넣을 인덱스번호 , "문자열")
		sb.insert(1, " 점심을 먹어서 ");
		System.out.println(sb);
		
		//delete //2부터 시작으로 9이전(8)까지 삭제
		sb.delete(2,  9);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
	}
}
