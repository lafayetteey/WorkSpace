package com.test.chap5_method.test01;

public class OverloadingTest {
	//���ϰ��� �ִ� �޼ҵ� �����ε�
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
// �Ű��������� ��������� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ� �Ѵ�.
//	public int test(int b , int a) {
//		return 0;
//	}
	public int test(String s , int a) {
		return 0;
	}
	public String test(int a , int b , String s) {
		return null;
	}
	//����Ÿ���� �ٸ��ٰ� �ؼ� ������ ���� �ʴ´�
//	public int test(int a , int b , String s) {		
//	}
	//���������ڰ� �ٸ��ٰ� �ؼ� �����ε��� ���� �ʴ´�
//	private String test(int a , int b, String s) {
////		return null;
//	}
	
	
	
	
}
