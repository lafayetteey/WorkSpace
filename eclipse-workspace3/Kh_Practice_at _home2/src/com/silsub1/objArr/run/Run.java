package com.silsub1.objArr.run;

import com.silsub1.objArr.mode.vo.Student;

public class Run {
	public static void main(String args[] ) {
		Student[] iarr = {
				new Student (3, 2 , 24 , "ȫ�浿"),
				new Student (2 , 3 , 15 ,"�����"),
				new Student (1, 3, 35 , "Ȳ�μ�")
		};
		for(int i=0; i<iarr.length; i++) {
			System.out.println(iarr[i].Information());
		}
		
	}
}
