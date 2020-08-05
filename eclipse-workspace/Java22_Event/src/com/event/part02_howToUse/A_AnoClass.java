package com.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_AnoClass {

	public static void main(String[] args) {
		/*
		 익명 클래스(Anonymous Class)
		 이름이 없는 클래스
		 클래스 선언과 객체의 생성을 동시에 하므로 한번만 사용가능.,
		 오직 하나의 객체만 생성하여 사용하는 일회용 클래스
		 */
		
		JFrame mf = new JFrame("익명 클래스");
		
		mf.setSize(300 , 250);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("Click the Button");
		JLabel label = new JLabel("Button hasn't Clicked yet....");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("finally......");
			}		
		});
		
		panel.add(button);
		panel.add(label);
		
		mf.add(panel);
		
		
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
		
		
		
	}

}
