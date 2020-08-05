package com.silsub2.student.controller;

import java.util.Scanner;

import com.silsub2.student.model.vo.Students;

public class TestStudentArray {

	public static void main(String[] args) {
		Students[] st = new Students[10];
		int count = 1;
		Scanner sc = new Scanner(System.in);
		String answer = " ";
		
			while (st.length >= count) {
				System.out.print("첫번째 학생 : ");
				st[0] = new Students(sc.nextInt(), sc.nextInt(), sc.next(),
						sc.nextInt(), sc.nextInt(), sc.nextInt());
				System.out.print("continue? ( y || n) ");
				answer = sc.next();
				if (answer.equals("y") || answer.equals("Y")) {
					System.out.print("두번째 학생 : ");
					st[1] = new Students(sc.nextInt(), sc.nextInt(), sc.next(),
							sc.nextInt(), sc.nextInt(), sc.nextInt());
				} else {
					break;
				}
				System.out.print("continue? ( y || n) ");
				answer = sc.next();
				if (answer.equals("y") || answer.equals("Y")) {
					System.out.print("세번째 학생 : ");
					st[2] = new Students(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
					
					break;
				}
				count++;
			}
			System.out.println("---------------------------------");
			
			double avg =0;
			
			for(int i=0; i<3; i++) {
				avg = st[i].getKor() + st[i].getEng() + st[i].getMat() / 3.0;
			}
			System.out.println("점수 평균 : " + avg);
			
			System.out.println("---------------------------------");
			for(int i=0; i<3; i++) {
				System.out.println(st[i].prnInfo());
			}
			
		}
	
}
	

