package com.test.chap04_wrapperClass.run;

public class Run {

	public static void main(String[] args) {
		//Wrapper : 기본 자료형을 객체화 시켜준다.
		//Boxing :  기본자료형 ----> Wrapper 클래스 객체
		// UnBoxing :  Wrapper 클래스 객체 ---> 기본자료형
		
		//Boxing 
		Integer i = new Integer(20);
		Integer i2 = new Integer(20);
		Double d = new Double(10.0);
		
		System.out.println(i.equals(i2));
		// 0--> 같을때 , 양수면 i 가 큰수일때 , 음수면 i2 가 큰수 일때
		System.out.println(i.compareTo(i2));
		
		//AutoBoxing 
		Short i3 = 10;
		Integer i4 = 5;
		//Integer 14 = new Integer(5);
		
		//UnBoxing 
		//Wrapper 클래스 ----> 기본자료형
		int pi  = i.intValue();
		double pd = d.doubleValue();
		//AutoUnboxing
		int a = i;
		int b = i2;
		System.out.println(a+b);
		
		
		abox(a+b);
		//int --> (autoBoxing) >> Integer >> (다형성) Object
 	}

	public static void abox(Object obj) {
		//System.out.println((int)obj);
		System.out.println((Integer)obj );
	}

}
