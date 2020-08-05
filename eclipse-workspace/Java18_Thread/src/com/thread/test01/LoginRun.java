package com.thread.test01;

import javax.swing.JOptionPane;

public class LoginRun {
	public void LoginTry() {
		Login login = new Login("user" , 1234);
		
		
		
		if(login.getId().equals("user")) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
		}
	}
}
