package com.test.chap04_constructor.model;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date EnrollDate;
	
	//������ constructor
	//1. ��ü�� �������ֱ����� �������� ���
	//2. �Ű������� ���޹��� ������ �ʵ带 �ʱ�ȭ�� ����
	
	//������ ��� �� ���ǻ���
	//1. �ݵ�� Ŭ������� �̸��� �����ؾ��Ѵ�(��/�ҹ��� ����)
	//2. ���ϰ��� �������� �ʴ´�.
	
	//�⺻ ������ -> �ʵ��� �ʱ�ȭ ������ �������� ���ϰ� ��ü �����Ҷ��� ���
	public User() {
		
	}
	
	//�Ű������� �ִ� ������
	//���� �̸��� ������ Ȥ�� �޼ҵ带 ����Ϸ��� �ϴ� ��� �����ε��� ����ؾ��Ѵ�
	//�Ű������� Ÿ�� �Ǵ� ������ �޶�� �Ѵ�.
	public User(String userId , String userPwd , String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		
		//this. : �޼ҵ� ���� ������ ä �����ϴ� ���۷��� ����(�Ҵ�� ��ü �ڽ��� �ǹ�)
			
	}
	
	public User(String userId ,String userPwd , String userName , Date EnrollDate) {
		//this() : �ߺ��Ǵ� ������ �ʱ�ȭ �ϴ� ������ �����ڰ�
		//�����ϴ� ��� this()�� ����� �� �ִ�.
		//this() �� �ݵ�� �� ���ٿ� �־���Ѵ�.
  		this (userId, userPwd , userName);
 		
 		
		this.EnrollDate = EnrollDate;
//		this.userId = userId;
//		this.userName= userName;
//		this.userPwd = userPwd;
		

	}
	
	//setter�� ��� ��ü�� �����Ǹ� �������� ������ ������ �����ϴ�.
	//getter setter �ۼ�
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
	
	//��¿� �޼ҵ�
	public void info() {
		System.out.println(userId +", " + userPwd + ", " + userName+", " + EnrollDate);
		
	}
}

