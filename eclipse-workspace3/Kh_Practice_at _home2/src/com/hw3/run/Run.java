package com.hw3.run;

import com.hw3.controller.SetDate;

public class Run {

	public static void main(String[] args) {
		SetDate sd = new SetDate();
		
		System.out.println(sd.todayPrint());
		System.out.println(sd.setDay());
	}

}
