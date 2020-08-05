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
				throw new CharCheckException("체크할 문자열 안에 공백을 포함 할 수 없습니다.");
			}
		}
		new ConsoleIO().charOutput(s, count);
	}
	
}
