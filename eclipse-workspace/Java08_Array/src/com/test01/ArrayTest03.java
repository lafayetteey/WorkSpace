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
		// ���� ����
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

		// ���� �迭 ����
		originArr[0] = 99;

		str = " ";

		for (int i = 0; i < originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1. originArr : " + str);
		System.out.println("2. copyArr : " + str);

		System.out.println("originArr�� hashcode: " + originArr.hashCode());
		System.out.println("copyArr�� hashcode: " + copyArr.hashCode());
	}

	public void deepCopy() {
		// 1. ���� ����� ������ ���ο� �迭�� �ϳ� ���� �ϰ� ���� ����
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[5];

		// for���� �̿��Ͽ� 1:1 ����
		for (int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		// ���� �迭�� ���
		String str = " ";
		for (int i = 0; i < originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1. originArr : " + str);

		// ���� �迭�� ���
		str = " ";

		for (int i = 0; i < copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2. copyArr : " + str);

		// ���� �迭�� 0�� �ε��� ���� 99�� ����
		originArr[0] = 99;
		// ���� �迭�� ���
		str = " ";
		for (int i = 0; i < originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1. originArr : " + str);

		// ���� �迭�� ���
		str = " ";

		for (int i = 0; i < copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2. copyArr : " + str);
		System.out.println("originArr�� hashcode: " + originArr.hashCode());
		System.out.println("copyArr�� hashcode: " + copyArr.hashCode());

	}

	public void deepCopy2() {
		// 2.arraycopy() �޼ҵ带 �̿��� ����
		// java.lang.System
		int originArr[] = { 1, 2, 3, 4, 5 };
		int copyArr[] = new int[10];

		// System.arraycopy �� ���� ����
		// src : �����迭 / srcPos : �����迭 ������� ��ġ
		// dest : ����迭 /destPos: �ٿ��ֱ��� ���� ��ġ
		// lenght : ���� �� ����
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);

		// ���� �迭�� ���
		String str = " ";
		for (int i = 0; i < originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1. originArr : " + str);

		// ���� �迭�� ���
		str = " ";

		for (int i = 0; i < copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2. copyArr : " + str);

	}

	public void deepCopy03() {
		// clone()�� �̿��� ����
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		
		System.out.println("�غ�� ���纻 �迭�� �ּ�: " + copyArr.hashCode());
		copyArr=originArr.clone();
		System.out.println("�غ�� ���纻 �迭�� �ּ�: " + copyArr.hashCode());
		System.out.println("originArr �� hashcode : " + originArr.hashCode());
	}
}
