package com.silsub1.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.silsub1.controller.CharacterProcess;
import com.silsub1.controller.NumberProcess;
import com.silsub1.exception.CharCheckException;
import com.silsub1.exception.NumberRangeException;

public class ConsoleIO {
	public void charInput() throws CharCheckException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		try {
			String s = bf.readLine();
			new CharacterProcess().countAlpha(s);
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
	public void charOutput(String s, int count) throws CharCheckException {
		System.out.println("문자열 :" + s + " 갯수 :" + count);
	}

	public void numberInput() throws NumberRangeException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;
		System.out.print("정수 1 입력 : ");
		try {
			 a = bf.read();
			 b = bf.read();
		} catch (IOException e) {	e.printStackTrace(); e.getMessage();
		} finally {
			new NumberProcess().checkDouble(a, b);
		}
	}
	
	
	
	public void numberOutput(boolean isTrue) {
		
	}
}
