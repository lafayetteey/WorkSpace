package com.silsub1.objArr.run;

import com.silsub1.objArr.model.vo.Student;

public class Run {
	public static void main(String args[]) {
		Student iarr[] = {
				new Student(3 , 2 , 24, "�����"),
				new Student(2, 3 , 26 , "Ȳ�μ�"),
				new Student(1 ,2 , 17 , " ���·�")
		};
		for(int i =0; i<iarr.length; i++) {
			System.out.println(iarr[i].prnInfo());
		}
	}
}
