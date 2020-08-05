package com.silsub1.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.silsub1.controller.CharProcess;
import com.silsub1.exception.CharCheckExceptione;

public class Console {
	public void charInput() throws CharCheckExceptione {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		try {
			String s = bf.readLine();
			new CharProcess().countAlpha(s);
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
	public void charOutput(String s , int count) {
		System.out.println("문자열 : " + s + "갯수 " + count
				
				);
	}
}
