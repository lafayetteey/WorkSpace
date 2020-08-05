package com.test01;

import java.util.Scanner;

public class ArrayTest01 {
	public void testArray() {
		
		int []arr = new int[5];

		for(int i =1; i<arr.length; i++) {
			arr[i] += 10*i;
			System.out.println("arr[" + i + "]: " + arr[i]);

		}
				
			
		}
	
	public void testArray2() {
		//�迭 ���� ���
		//�ڷ���[] ������;
		//�ڷ��� ������[];
		//������ stack�� �迭�� �ּҸ� ������ �� �ִ� ������ ����°�.
		//int[] iarr;
		//char carr[];
		
		//�Ҵ��� new �����ڸ� �̿��Ͽ� heap������ ������ ����°�.
		//iarr = new int[5];
		//carr = new char[3];
		
		//����� �Ҵ�
		int iarr[] = new int[5];
		char[] carr = new char[10];
		
		
		System.out.println("iarr : " + iarr) ;
		System.out.println("carr: " + carr);
		
		//hashcode : ��ü�� �ν��� �� �ִ� �ڵ�
		//���� �ּҰ��� �ƴ����� �ּҰ��̶� �����ص� �������.
		//���� �ּҸ� ã������ key ����
		System.out.println("iarr�� hashcode: " + iarr.hashCode());
		System.out.println("carr�� hashcode: " + carr.hashCode());
		
		
		//�迭�� ����
		//String.lenght()  ----- �迭.lenght �� ������ : String�� lenght�� �޼ҵ� , �迭�� lenght�� �ʵ�
 		System.out.println("iarr�� ����: " + iarr.length);
		System.out.println("carr �� ����: " + carr.length);
		
		
		//��ĳ�ʷ� �Է¹��� ������ �迭 ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : " );
		int size = sc.nextInt();
		
		//�Է¹��� ������ ����Ǿ� �ִ� size������ �迭�� ����
		double[] darr = new double[size];
		//int[] iarr2 = new int[sc.nextInt()];
		
		System.out.println("darr�� ����: " + darr.length);
		System.out.println("darr �� hashcode " + darr.hashCode());
		
		//�迭�� ����� �� �Ҵ� �Ѱ� �ƴ϶� 
		//new �����ڷ� ���ο� �迭�� ����Ż��̴�.
		darr = new double[30];
		System.out.println("darr�� ����: " + darr.length);
		System.out.println("�ٲ� ���� darr's hashcode " + darr.hashCode());
		
		//����
		//�ѹ� �Ҵ� �� �迭�� ���� �Ұ� �ϳ� null�� �����Ͽ� ����ϰ� ���� �����ϴ�
		darr = null;
		System.out.println("null���� ������ ���� darr : " + darr.length);
		
		
		//�ʱ�ȭ
		
		
		
		
		
		
		
		
		
			
		}

	public void testArray3() {
		int[] iarr = new int[5];
		
		for(int i =0; i<iarr.length; i++) {
			System.out.println("iarr[" + i + "] �� ��: " + iarr[i]);
		}
		
		//int[] iarr2 = {11,22,33,44,55,66,77,88};
		int[] iarr2 = new int[] {11,22,33,44,55,66,77,88};
		System.out.println("iarr �� ����" + iarr2.length);
		
		String[] sarr = {"apple", "banana", "orange"};
		for(int i=0; i<sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		
	}
}
