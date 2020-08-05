package com.test02.dto;
//dto : 데이터 전송 객체 
public class MyTest {
	private int mno;
	private String mname;
	private String nickname;
	
	public MyTest() {
		super();
	}
	public MyTest(int mno, String mname, String nickname) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.nickname = nickname;
	}
	public MyTest(int mno) {
		this.mno = mno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "번호 : " + mno + ", 이름  : " + mname + ", 닉네임 : " + nickname;
	}
	
}