package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SetDate {
	public SetDate() {

	}

	public String todayPrint() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH);
		int date = cal.get(cal.DATE);
		int hour = cal.get(cal.HOUR);
		int min = cal.get(cal.MINUTE);
		int sec = cal.get(cal.SECOND);
		return year + "년 " + month + "월 " + date + "일 " + hour + "시 " + min + "분 " + sec + "초";
	}

	public String setDay() {
		Calendar cal = Calendar.getInstance();
		cal.set(2011, 3 - 1, 21);
		String year = Integer.valueOf(cal.get(1)).toString();
		String month = Integer.valueOf(cal.get(Calendar.MONTH)).toString();
		String day = Integer.valueOf(cal.get(Calendar.DAY_OF_MONTH)).toString();
		String dow = Integer.valueOf(cal.get(Calendar.DAY_OF_WEEK)).toString();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		// sdf.set
		return sdf.format(cal.getTime());

	}

	public String todayPrint2() {
		Calendar ca = Calendar.getInstance();

		int year = ca.get(ca.YEAR);
		int month = ca.get(ca.MONTH);
		int date = ca.get(ca.DATE);
		int hour = ca.get(ca.HOUR);
		int min = ca.get(ca.MINUTE);
		int sec = ca.get(ca.SECOND);

		return year + "년 " + month + "월 " + date + "일 " + hour + "시 " + min + "분 " + sec + "초";
	}

	public String setDay2() {
		Calendar ca = Calendar.getInstance();
		ca.set(2011, 3 - 1, 21);
		String year = Integer.valueOf(ca.get(1)).toString();
		String month = Integer.valueOf(ca.get(ca.MONTH)).toString();
		String day = Integer.valueOf(ca.get(ca.DAY_OF_MONTH)).toString();
		String dow = Integer.valueOf(ca.get(ca.DAY_OF_WEEK)).toString();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		
		return sdf.format(ca.getTime());
		

	}
}
