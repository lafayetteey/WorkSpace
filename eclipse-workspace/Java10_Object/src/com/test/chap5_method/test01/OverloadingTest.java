package com.test.chap5_method.test01;

public class OverloadingTest {
	//리턴값이 있는 메소드 오버로딩
	public int test( ) {
		return 0;
	}
	public int test(int a) {
		return 0;
	}
	
	public int test(int a , int b) {
		return 0;
	}
	public int test(int a , String s)  {
		return 0;
	}
// 매개변수명은 상관없지만 자료형의 갯수와 순서가 다르게 작성되야 한다.
//	public int test(int b , int a) {
//		return 0;
//	}
	public int test(String s , int a) {
		return 0;
	}
	public String test(int a , int b , String s) {
		return null;
	}
	//리턴타입이 다르다고 해서 실행이 되진 않는다
//	public int test(int a , int b , String s) {		
//	}
	//접근제한자가 다르다고 해서 오버로딩이 되진 않는다
//	private String test(int a , int b, String s) {
////		return null;
//	}
	
	
	
	
}
