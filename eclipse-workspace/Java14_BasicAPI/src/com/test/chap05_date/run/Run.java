
package com.test.chap05_date.run;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Run {
	public static void main(String args[]) {
		//Date
		//Date originTime = new Date(0L);
//		Date originTime = new Date(1000L);
//		System.out.println(originTime);
		
		String originTime = new Date(0L).toGMTString();
		//������ ������� �׸���ġ ǥ�ؽ÷� ������ �ϴ� �޼ҵ�
		System.out.println(originTime);
		
		Date today = new Date();
		System.out.println(today);

		
		//���ϴ� ��������
		SimpleDateFormat ft = new SimpleDateFormat("yyyy - MM - dd");
		System.out.println(ft.format(today));
		
		
		System.out.println("----Ķ����----");
		//��ü ���� �Ұ�
		Calendar calendar = Calendar.getInstance();
		//����ð�
		calendar.set(2020, 4-1,13);
		
		
		int year = calendar.get(1);
		int month = calendar.get(calendar.MONTH);
		int date = calendar.get(calendar.DATE);
		int hour = calendar.get(calendar.HOUR);
		int min = calendar.get(calendar.MINUTE);
		int sec = calendar.get(calendar.SECOND);
		int mSec = calendar.get(calendar.MILLISECOND);
		
		System.out.println(year +"�� " + month + "�� " + date + "��");
		System.out.println(calendar);
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf1.format(calendar.getTime()));
		System.out.println(sdf1.format(today));
		
		
		Calendar cal = (Calendar) calendar.clone();
		cal.add(calendar.YEAR, -10);
		cal.add(calendar.MONTH, -2);
		cal.add(calendar.DATE, 10);
		System.out.println(cal.getTime());
		
		//Ÿ����
		TimeZone tz = TimeZone.getTimeZone("Etc/greenwich");
		sdf1.setTimeZone(tz);
		System.out.println(sdf1.format(calendar.getTime()));
		
		for(String name : TimeZone.getAvailableIDs()) {
			System.out.println(name);
		}
		
		//
		System.out.println("------�׷�����------");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		gc.set(2018, 9-1 , 22);
		System.out.println(gc.getTime());
		
		
		
		
		
		
	}
}
