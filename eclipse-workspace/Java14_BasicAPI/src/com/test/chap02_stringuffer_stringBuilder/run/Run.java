package com.test.chap02_stringuffer_stringBuilder.run;

public class Run {
	/*
	 * StringBuffer , StringBuilder�� Ư¡ - mutable(����)Ŭ����, ����� ������ ���� �޸𸮰���(����)�� ���ο�
	 * ���Ѵ�. - ������ �ʱⰪ 16���� ���ڸ� ���� �����ϴ�. 16�� �Ѿ�� �Ǹ� �ڵ����� ����
	 */

	public static void main(String[] args) {
		// Run.method1();
		// Run.method2();
		Run.method3();
	}

	public static void method1() {
		StringBuilder sb = new StringBuilder("���� ������");
		System.out.println(sb.length()); // 6
		System.out.println(sb.capacity()); // 16 + 6

		StringBuilder sb1 = new StringBuilder(21); // 21���� ���� ����
		System.out.println(sb1.capacity());

		System.out.println(sb);
	}

	public static void method2() {
		String str = "�ݰ���! ";
		System.out.println("str ���� : " + str + ", �ּ� : " + str.hashCode());

		str += " ���� String �̶�� ��";
		System.out.println("str �߰� �� : " + str + ", �ּ� : " + str.hashCode());

		StringBuffer sbf = new StringBuffer("�ȳ�! ");
		System.out.println("sbf ����: " + sbf + ", �ּ� : " + sbf.hashCode());

		sbf.append("�� StringBuffer��� ��");
		System.out.println("sbf �߰� �� :" + sbf + ", �ּ� : " + sbf.hashCode());

		StringBuilder sb1 = new StringBuilder("�ȳ�~ ");
		System.out.println(sb1 + "�� �ּ� : " + sb1.hashCode());
		sb1.append("�� StringBuilder��");
		System.out.println(sb1 + " �� ���� �� �ּ� : " + sb1.hashCode());
	}

	public static void method3() {
		//StringBuffer sbf = new StringBuffer("���� ");
		StringBuilder sb = new StringBuilder("�� ");
		//append ���ڿ� �߰�
//		sb.append("���� �Ϳ�");
//		sb.append("~~!");
		sb.append("�谡 �ҷ���").append("~!!");
		
		
		
		System.out.println(sb);
		
		//insert (���ڿ� ���� �ε�����ȣ , "���ڿ�")
		sb.insert(1, " ������ �Ծ ");
		System.out.println(sb);
		
		//delete //2���� �������� 9����(8)���� ����
		sb.delete(2,  9);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
	}
}
