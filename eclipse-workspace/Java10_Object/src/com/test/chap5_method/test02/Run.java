package com.test.chap5_method.test02;

public class Run {
	public static void main(String[] args) {
//		NonStaticMethodTest test = new NonStaticMethodTest();
//		//�Ű������� ��ȯ���� ���� �޼ҵ�
//		test.method1();
//		//�Ű������� ���� ��ȯ���� �ִ� �޼ҵ�
//		//��ȯ���� �ִ� ��� (return) �� ��� ������ Ÿ���� ���� ���� �� �ش� ���� �޼ҵ带 ȣ�����ش�.
//		String res = test.method2();
//		System.out.println(res);
//		
//		
//		//��¹� ��ȣ�ȿ� ȣ�⵵ ����
//		System.out.println(test.method2());
//		
//		//�Ű������� �ְ� ��ȯ���� ���� �޼ҵ� ȣ��
//		test.method(10, 20);
//		
//		//�Ű������� ��ȯ�� ��� �ִ� �޼ҵ�
//		int res1 = test.method4(10, 20);
		
		//static �޼ҵ� ȣ�� �ÿ��� ��ü�� ���� ���� �ʴ´�
		StaticMethodTest.staticMethod1();
		System.out.println("10�� 20�� ��: " + StaticMethodTest.staticMethod2());
		StaticMethodTest.staticmethod3("ȫ�浿");
		
		System.out.println(StaticMethodTest.staticmethod4("�̼���"));
	}
}
