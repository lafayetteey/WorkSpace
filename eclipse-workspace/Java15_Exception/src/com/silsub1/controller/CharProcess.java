package com.silsub1.controller;

import com.silsub1.exception.CharCheckExceptione;
import com.silsub1.view.Console;

public class CharProcess {
	public CharProcess() {
		
	}
	public void countAlpha(String s) throws CharCheckExceptione {
		int count = 0;
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'z' ) {
				count++;
			} else {
				throw new CharCheckExceptione("체크할 문자열 안에 공백을 포함 할 수 없습니다.");
			}		
		}
		new Console().charOutput(s, count);
	}
}
