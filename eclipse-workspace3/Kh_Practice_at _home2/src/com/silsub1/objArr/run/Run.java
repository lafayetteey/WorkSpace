package com.silsub1.objArr.run;

import com.silsub1.objArr.mode.vo.Student;

public class Run {
	public static void main(String args[] ) {
		Student[] iarr = {
				new Student (3, 2 , 24 , "È«±æµ¿"),
				new Student (2 , 3 , 15 ,"±è½ÂÁø"),
				new Student (1, 3, 35 , "È²ÀÎ¼±")
		};
		for(int i=0; i<iarr.length; i++) {
			System.out.println(iarr[i].Information());
		}
		
	}
}
