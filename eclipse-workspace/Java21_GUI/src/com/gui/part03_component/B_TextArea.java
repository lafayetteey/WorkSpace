package com.gui.part03_component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class B_TextArea {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		//입력용 텍스트 필드
		JTextField tf = new JTextField(30);
		//출력용 텍스트 영역
		JTextArea ta = new JTextArea(10, 20);
		
		tf.addActionListener(new ActionListener( ) {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text + "\n");
				
				//엔터키 입력 후 텍스트 초기화
				tf.setText(" ");
			}
			
		});
		
		
		
		mf.add(tf , "North");
		mf.add(ta , "Center");
		
		//컨테이너 크기를 구성요소들의 크기로 자동 설정
		mf.pack();
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	
	
		
		
	}
}
