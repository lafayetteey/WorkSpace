package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SetDate {
	public SetDate() {
		
	}
	public String todayPrint() {
		Calendar c = Calendar.getInstance();
		int year = c.get(c.YEAR);
		int month = c.get(c.MONTH);
		int date = c.get(c.DATE);
		int hour = c.get(c.HOUR);
		int min = c.get(c.MINUTE);
		int sec = c.get(c.SECOND);
		
		return year + "년 " + month + "월 " + date + "일 " + hour +"시 " + min + "분 " + sec + "초";
			
	}

	public String setDay() {
		Calendar cal = Calendar.getInstance();
		cal.set(2011, 3-1, 21);
		
		String year = Integer.valueOf(cal.YEAR).toString();
		String month = Integer.valueOf(cal.MONTH).toString();
		String date = Integer.valueOf(cal.DATE).toString();
		String dow = Integer.valueOf(cal.DAY_OF_WEEK).toString();
				
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		return sdf.format(cal.getTime());
	}
}
