package com.test.chap04_wrapperClass.run;

public class Run {

	public static void main(String[] args) {
		//Wrapper : �⺻ �ڷ����� ��üȭ �����ش�.
		//Boxing :  �⺻�ڷ��� ----> Wrapper Ŭ���� ��ü
		// UnBoxing :  Wrapper Ŭ���� ��ü ---> �⺻�ڷ���
		
		//Boxing 
		Integer i = new Integer(20);
		Integer i2 = new Integer(20);
		Double d = new Double(10.0);
		
		System.out.println(i.equals(i2));
		// 0--> ������ , ����� i �� ū���϶� , ������ i2 �� ū�� �϶�
		System.out.println(i.compareTo(i2));
		
		//AutoBoxing 
		Short i3 = 10;
		Integer i4 = 5;
		//Integer 14 = new Integer(5);
		
		//UnBoxing 
		//Wrapper Ŭ���� ----> �⺻�ڷ���
		int pi  = i.intValue();
		double pd = d.doubleValue();
		//AutoUnboxing
		int a = i;
		int b = i2;
		System.out.println(a+b);
		
		
		abox(a+b);
		//int --> (autoBoxing) >> Integer >> (������) Object
 	}

	public static void abox(Object obj) {
		//System.out.println((int)obj);
		System.out.println((Integer)obj );
	}

}
