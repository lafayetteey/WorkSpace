package com.poly.test.test07;

public class Profile {
	private String name;
	private String phone;
	
	public Profile() {
		
	}
	public Profile(String name , String phone) {
		super(); //������Ʈ Ŭ���� ���
		this.name =name;
		this.phone = phone;
	}
	public void printProfile() {
		System.out.println("�̸� : " +name );
		System.out.println("��ȭ��ȣ: " + phone);
	}
	
	
}
