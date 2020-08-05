package com.gui.part02_layout;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class E_PanelLayout extends JFrame {
	public E_PanelLayout() {
		super("PanelLayout");
		this.setVisible(true);
		this.setBounds(200, 300 , 600 ,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		//현재 레이아웃 출력
		System.out.println(this.getLayout());
		
		JLabel lb = new JLabel("이름 : ");
		lb.setLocation(50,  100);
		lb.setSize(150, 50);
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110 , 100);
		tf.setSize(200 , 50 );
		
		
		JButton jb = new JButton("추가");
		jb.setLocation(350, 100);
		jb.setSize(100 , 50);
		
		//panel에 추가 
		JPanel panel = new JPanel();
		panel.setSize(500 , 500);
		
		//패널에 레이아웃을 설정하지 않으면 기본이 FlowLayout의 center를 가지게 된다.
		panel.setLayout(null);
		
		panel.add(lb);
		panel.add(tf);
		panel.add(jb);
		panel.setBackground(Color.pink);
		panel.setVisible(true);
		
		this.add(panel);
		
	
		
		
		
	}
}
