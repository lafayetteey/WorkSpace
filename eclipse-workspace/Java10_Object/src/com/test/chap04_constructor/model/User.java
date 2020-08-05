package com.test.chap04_constructor.model;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date EnrollDate;
	
	//생성자 constructor
	//1. 객체를 생성해주기위한 목적으로 사용
	//2. 매개변수로 전달받은 값으로 필드를 초기화할 목적
	
	//생성자 사용 시 주의사항
	//1. 반드시 클래스명과 이름이 동일해야한다(대/소문자 구분)
	//2. 리턴값이 존재하지 않는다.
	
	//기본 생성자 -> 필드의 초기화 역할은 수행하지 못하고 객체 생성할때만 사용
	public User() {
		
	}
	
	//매개변수가 있는 생성자
	//같은 이름의 생성자 혹은 메소드를 사용하려고 하는 경우 오버로딩을 사용해야한다
	//매개변수의 타입 또는 갯수가 달라야 한다.
	public User(String userId , String userPwd , String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		
		//this. : 메소드 내에 숨겨진 채 존재하는 레퍼런스 변수(할당된 객체 자신을 의미)
			
	}
	
	public User(String userId ,String userPwd , String userName , Date EnrollDate) {
		//this() : 중복되는 동일한 초기화 하는 내용의 생성자가
		//존재하는 경우 this()를 사용할 수 있다.
		//this() 는 반드시 맨 윗줄에 있어야한다.
  		this (userId, userPwd , userName);
 		
 		
		this.EnrollDate = EnrollDate;
//		this.userId = userId;
//		this.userName= userName;
//		this.userPwd = userPwd;
		

	}
	
	//setter의 경우 객체가 생성되면 언제든지 데이터 변경이 가능하다.
	//getter setter 작성
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;	
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getEnrollDate() {
		return EnrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.EnrollDate = enrollDate;
	}
	
	//출력용 메소드
	public void info() {
		System.out.println(userId +", " + userPwd + ", " + userName+", " + EnrollDate);
		
	}
}

