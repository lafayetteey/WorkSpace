package com.silsub1.controller;

import com.silsub1.exception.NumberRangeException;
import com.silsub1.view.ConsoleIO;

public class NumberProcess {
	public NumberProcess() {

	}

	public boolean checkDouble(int a, int b) throws NumberRangeException {
		if (a >= 1 && a <= 100) {
			} else if (b >= 1 && b <= 100) {
				if (a % 2 == b) {
					new ConsoleIO().numberOutput(true);
			}
		} else {
			throw new NumberRangeException("1~100사이의 값이 아닙니다.");
		}
		return true;
	}
}
