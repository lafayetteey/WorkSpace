package com.test02;

public class Score {
	public double getAvg(int kor, int eng , int math) {
		double avg = (kor + eng + math) / 3.0;
		return avg;
	}
	
	public String getGrade(double avg) {
		String grade;
		
		//100/10�� 10 �� ���� ������ 10���� ������ case�� ����
		switch((int)avg/10) {
		case 10 :
		case 9 :
			grade = "A";
			break;
		case 8 : 
		case 7 :
			grade = "B";
			break;
		default : 
			grade = "F";
		}
		 
		return grade;
	}
}
