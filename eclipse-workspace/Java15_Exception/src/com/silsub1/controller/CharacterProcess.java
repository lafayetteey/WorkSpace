package com.silsub1.controller;

import com.silsub1.exception.CharCheckException;
import com.silsub1.view.ConsoleIO;

public class CharacterProcess {
	public void countAlpha(String s) throws CharCheckException{
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) > 'A' && s.charAt(i)<'z') {
				count++;
			} else {
				throw new CharCheckException("üũ�� ���ڿ� �ȿ� ������ ���� �� �� �����ϴ�.");
			}
		}
		new ConsoleIO().charOutput(s, count);
	}
	
}
