package com.test02;

public class Student {

	public static void main(String[] args) {
		String name = "�����";
		int korea = 90;
		int eng = 90;
		int math = 100;
		
		Score sc = new Score();
		
		//ScoreŬ���� �޼ҵ忡�� ����� ���� Ÿ���� double avg�� ���� �ʱ�ȭ �� �� ��¤�
		double avg = sc.getAvg(korea, eng, math);
		//System.out.println(avg);
		
		String str = sc.getGrade(avg);
		System.out.println(name + "���� ����� " + str + "�Դϴ�.");
	}

}
