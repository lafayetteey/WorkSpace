package com.test.chap01_encapsulation;


public class Score {
	//field
	private String name;
	private int kor =90;
	private int eng = 84;
	private int mat = 97;


	public Score() {
	}
	
	//총합을 구하여 출력하는 메소드
	public void sum() {
		System.out.println("총합: " + (kor+eng+mat));
	}
	//평균을 구하여 출력하는 메소드
	public void avg1() {

		System.out.println("평균: " + (kor + eng + mat) /3.0);
	}
	//제일높은 점수를 받은 과목을 찾는 메소드
	public void maxPoint() {
		
		if(kor>eng && kor >mat) {
			System.out.println("국어가 제일 높은 점수");
		} else if(eng>kor && eng > mat) {
			System.out.println("영어가 제일 높은 점수");
		} else {
			System.out.println("수학이 제일 높은 점수");
		}
		
	}
	//제일 낮은 점수를 받은 과목을 찾는 메소드
	public void minPoint() {
		if(kor<eng && kor < mat) {
			System.out.println("국어가 제일 낮은 점수");
		} else if(eng < kor && eng < mat) {
			System.out.println("영어가 제일 낮은 점수");
		} else {
			System.out.println("수학이 제일 낮은 점수");
		}
		
	}
	//필드값을 확인할수있는 information() 메소드
	public void information() {
		System.out.println("name " + name + " kor " + kor + " eng " + eng + " mat " + mat);
	}
}
