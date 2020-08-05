package com.silsub1.objArr.run;

import com.silsub1.objArr.model.vo.Student;

public class Run {
	public static void main(String args[]) {
		Student iarr[] = {
				new Student(3 , 2 , 24, "±è½ÂÁø"),
				new Student(2, 3 , 26 , "È²ÀÎ¼±"),
				new Student(1 ,2 , 17 , " ±èÅÂ·æ")
		};
		for(int i =0; i<iarr.length; i++) {
			System.out.println(iarr[i].prnInfo());
		}
	}
}
