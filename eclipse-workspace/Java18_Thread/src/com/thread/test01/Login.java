package com.thread.test01;

public class Login {
	private String id;
	private int pw;
	
	public Login() {
		
	}

	public Login(String id, int pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}
	
}
