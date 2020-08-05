package com.test01;

public class OverlapIfExample {

	public static void main(String[] args) {
		String id = "egoing";
		String passWord = "blue";

		if(id.equals("egoing") ) { 
			if(passWord.equals("blue") ) { 
				System.out.println("login succeced");
			} else {
				System.out.println("login failed");
			}
			
		} else {
			System.out.println("login failed");
		}
	}

}
