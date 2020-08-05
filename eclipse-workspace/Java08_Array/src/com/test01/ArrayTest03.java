package com.test01;

public class ArrayTest03 {

	public static void main(String[] args) {
		ArrayTest03 test = new ArrayTest03();

		// test.shallowCopy();
		// test.deepCopy();
		//test.deepCopy2();
		test.deepCopy03();
	}

	public void shallowCopy() {
		// 얕은 복사
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = originArr;

		String str = " ";
		for (int i = 0; i < originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1. originArr : " + str);

		str = " ";

		for (int i = 0; i < copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2. copyArr : " + str);

		// 원본 배열 변경
		originArr[0] = 99;

		str = " ";

		for (int i = 0; i < originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1. originArr : " + str);
		System.out.println("2. copyArr : " + str);

		System.out.println("originArr의 hashcode: " + originArr.hashCode());
		System.out.println("copyArr의 hashcode: " + copyArr.hashCode());
	}

	public void deepCopy() {
		// 1. 깊은 복사는 동일한 새로운 배열을 하나 생성 하고 값을 복사
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[5];

		// for문을 이용하여 1:1 복사
		for (int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		// 원본 배열값 출력
		String str = " ";
		for (int i = 0; i < originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1. originArr : " + str);

		// 복사 배열값 출력
		str = " ";

		for (int i = 0; i < copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2. copyArr : " + str);

		// 원본 배열의 0번 인덱스 값을 99로 변경
		originArr[0] = 99;
		// 원본 배열값 출력
		str = " ";
		for (int i = 0; i < originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1. originArr : " + str);

		// 복사 배열값 출력
		str = " ";

		for (int i = 0; i < copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2. copyArr : " + str);
		System.out.println("originArr의 hashcode: " + originArr.hashCode());
		System.out.println("copyArr의 hashcode: " + copyArr.hashCode());

	}

	public void deepCopy2() {
		// 2.arraycopy() 메소드를 이용한 복사
		// java.lang.System
		int originArr[] = { 1, 2, 3, 4, 5 };
		int copyArr[] = new int[10];

		// System.arraycopy 로 깊은 복사
		// src : 원본배열 / srcPos : 원본배열 복사시작 위치
		// dest : 복사배열 /destPos: 붙여넣기할 시작 위치
		// lenght : 복사 될 길이
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);

		// 원본 배열값 출력
		String str = " ";
		for (int i = 0; i < originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1. originArr : " + str);

		// 복사 배열값 출력
		str = " ";

		for (int i = 0; i < copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2. copyArr : " + str);

	}

	public void deepCopy03() {
		// clone()을 이용한 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		
		System.out.println("준비된 복사본 배열의 주소: " + copyArr.hashCode());
		copyArr=originArr.clone();
		System.out.println("준비된 복사본 배열의 주소: " + copyArr.hashCode());
		System.out.println("originArr 의 hashcode : " + originArr.hashCode());
	}
}
