package com.test.oi.part04_objectStream;

import java.io.Serializable;

public class Member implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double point;
	
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private int age;
	private char gender;
	
	
	//생성자(기본, 매개변수). getter , setter 
	//hashcode &equals & toString 오버라이드
	
	public Member() {	
	}	
	
	public Member(String userId, String userPwd, String userName, String email, int age, char gender) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.gender = gender;
		
		//
	}

	@Override
	public String toString() {
		return userId + ", " + userPwd + ", " + userName + ", " + email + ", " + age + ", " + gender;
	}
	 
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPwd == null) ? 0 : userPwd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPwd == null) {
			if (other.userPwd != null)
				return false;
		} else if (!userPwd.equals(other.userPwd))
			return false;
		return true;
	}
	
	
	
	
}
