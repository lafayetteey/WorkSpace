package com.inherit.part01_inherit.model.vo;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		//��ü ������ ���ÿ� ������ �Ű��� �ʱ�ȭ
		Television tv = new Television("�Ｚ" , "03", "T123" , "�ＺTV " , 500000 , new Date() , 46);
		
		System.out.println(tv.prnInfo());
		System.out.println();
		
		Desktop d = new Desktop("�Ｚ" ,"77" , "S-0123" , "���������̼�" , 
				1000000, new Date() , "intel" , 500 , 8 , "windows7" , false) ;
		
		System.out.println(d.prnInfo());
		System.out.println();
		
		SmartPhone s = new SmartPhone("����" , "12" , "I-333", "������8�÷���" , 960000,
				new Date(), "IOS" , 256 , 6 , "����" , "KT");
		System.out.println(s.prnInfo());
		
		System.out.println(s.getBrand());
	}

}
