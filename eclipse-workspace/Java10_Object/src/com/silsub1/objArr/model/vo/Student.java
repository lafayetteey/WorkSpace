package com.silsub1.objArr.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private int number;
	private String name;

	public Student() {

	}

	public Student(int grade, int classroom, int number, String name) {
		this.classroom = classroom;
		this.grade = grade;
		this.number = number;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String information() {
		return grade + " , " + classroom + " , " + number + " , " + name;				}

}
