package com.silsub4.run;

import com.silsub4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student st = new Student();
		
		
		st.setGrade(3);
		st.setClassroom(2);
		st.setName("ȫ�浿");
		st.setHeight(188.8);
		st.setGender('M');
		
		System.out.println(st.information());
	}

}
