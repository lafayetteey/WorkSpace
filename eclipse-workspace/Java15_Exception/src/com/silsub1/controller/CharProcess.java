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
				throw new CharCheckExceptione("üũ�� ���ڿ� �ȿ� ������ ���� �� �� �����ϴ�.");
			}		
		}
		new Console().charOutput(s, count);
	}
}
