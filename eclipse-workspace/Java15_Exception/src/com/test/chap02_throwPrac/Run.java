package com.test.chap02_throwPrac;

import java.io.IOException;

public class Run {
	public static void main(String args[])  {
		try {
			methodA();
		} catch (IOException e) {
			System.out.println("���ܹ߻�");
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}
	public static void methodA() throws IOException {
		methodB();
	}
	public static void methodB() throws IOException {
		methodC();
	}
	public static void methodC () throws IOException {
		throw new IOException();
	}
	
}
