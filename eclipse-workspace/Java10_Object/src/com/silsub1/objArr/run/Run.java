package com.silsub1.objArr.run;

import java.util.Scanner;

import com.silsub1.objArr.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//�迭 ��ü ����
		//Ŭ������[] ������ = new Ŭ������[]
		//����� �ʱ�ȭ�� ���ÿ�
		//Ŭ������[] ������ = { new Ŭ������(  ) };
		
		Student[] st = { 
				new Student(1 , 2, 23 , "�����"),
				new Student(3 , 1 , 31 , "ȫ�浿"),
				new Student (2 , 3 , 15 , "�Ӳ���"),
				new Student (2 , 1 , 11 , "�̼���"),
				new Student (3 , 2 , 37 , "�ϸ���")
				};
		System.out.println(st[0].information());
		System.out.println(st[1].information());
		System.out.println(st[2].information());
		System.out.println(st[3].information());
		System.out.println(st[4].information());
		
		System.out.println();
		
		
		
		System.out.println("�л��� : " + st.length);
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i].information());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� �̸� �˻�: ");
		String str = sc.next();
		for(int i=0; i<st.length; i++) {
			if(st[i].getName().equals(str)) {
				System.out.println(st[i].information());
			}
		}
		
		
		
	}

}
