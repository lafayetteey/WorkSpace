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
		//배열 선언 방법
		//자료형[] 변수명;
		//자료형 변수명[];
		//선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는것.
		//int[] iarr;
		//char carr[];
		
		//할당은 new 연산자를 이용하여 heap영역에 공간을 만드는것.
		//iarr = new int[5];
		//carr = new char[3];
		
		//선언과 할당
		int iarr[] = new int[5];
		char[] carr = new char[10];
		
		
		System.out.println("iarr : " + iarr) ;
		System.out.println("carr: " + carr);
		
		//hashcode : 객체를 인식할 수 있는 코드
		//실제 주소값은 아니지만 주소값이라 생각해도 상관없다.
		//실제 주소를 찾기위한 key 역할
		System.out.println("iarr의 hashcode: " + iarr.hashCode());
		System.out.println("carr의 hashcode: " + carr.hashCode());
		
		
		//배열의 길이
		//String.lenght()  ----- 배열.lenght 의 차이점 : String의 lenght는 메소드 , 배열의 lenght는 필드
 		System.out.println("iarr의 길이: " + iarr.length);
		System.out.println("carr 의 길이: " + carr.length);
		
		
		//스캐너로 입력받은 정수로 배열 길이 지정
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : " );
		int size = sc.nextInt();
		
		//입력받은 정수가 저장되어 있는 size변수를 배열에 저장
		double[] darr = new double[size];
		//int[] iarr2 = new int[sc.nextInt()];
		
		System.out.println("darr의 길이: " + darr.length);
		System.out.println("darr 의 hashcode " + darr.hashCode());
		
		//배열을 덮어씌워 재 할당 한게 아니라 
		//new 연산자로 새로운 배열을 만든거뿐이다.
		darr = new double[30];
		System.out.println("darr의 길이: " + darr.length);
		System.out.println("바꾼 후의 darr's hashcode " + darr.hashCode());
		
		//삭제
		//한번 할당 된 배열은 삭제 불가 하나 null을 대입하여 비슷하게 변경 가능하다
		darr = null;
		System.out.println("null값을 대입한 후의 darr : " + darr.length);
		
		
		//초기화
		
		
		
		
		
		
		
		
		
			
		}

	public void testArray3() {
		int[] iarr = new int[5];
		
		for(int i =0; i<iarr.length; i++) {
			System.out.println("iarr[" + i + "] 의 값: " + iarr[i]);
		}
		
		//int[] iarr2 = {11,22,33,44,55,66,77,88};
		int[] iarr2 = new int[] {11,22,33,44,55,66,77,88};
		System.out.println("iarr 의 길이" + iarr2.length);
		
		String[] sarr = {"apple", "banana", "orange"};
		for(int i=0; i<sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		
	}
}
