package com.uni.model.vo;

public class Run {

	public static void main(String[] args) {
		Student[] iarr = {
				new Student("ȫ�浿" , 15 , 171 , 81 , "201101" , "����"),
				new Student("�ѻ��" , 13 , 183 , 72 , "201102" , "����"),
				new Student("�Ӱ���" , 16 , 175 , 65 , "201103" , "����"),
		};
		for(int i=0; i<iarr.length; i++) {
			System.out.println(iarr[i].prnInfo());
		}
 	}

}
