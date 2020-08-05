package com.silsub2.student.model.vo;

public class Students {
	private int grade;
	private int classRm;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public Students() {		
	}
	public Students(int grade , int classRm , String name, int kor , int eng , int mat) {
		this.grade = grade;
		this.classRm = classRm;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRm() {
		return classRm;
	}
	public void setClassRm(int classRm) {
		this.classRm = classRm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public String prnInfo() {
		return grade + "�г� " + classRm + "�� " + name + "�� ���� ������ " + kor + ", ���� ������ " + eng + ", ���� ������ " + mat + " �Դϴ�.";
	}
}
