package com.gui.part01_container;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class JFrameTest2 {
	//프레임 생성하는 방법 2
	//JFrame 클래스 객체를 생성하는방법
	public void showMainFrame() {
		//JFrame 객체 생성
//		JFrame mainFrame = new JFrame();
//		mainFrame.setTitle("main Program");
		//타이틀명 바로 세팅
		JFrame mainFrame = new JFrame("myFrame2");
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		//Java.awt.Rectangle 객체를 활용한 사이즈 설정
		Rectangle r = new Rectangle(300, 200 , 800 , 500);
		//Rectangle 객체로 설정할 값을 setBounds 로 설정해준다
		mainFrame.setBounds(r);
		
	}
	
	
	
	
	
	
}
