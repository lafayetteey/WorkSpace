package com.gui.part02_layout;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelLayoutTest extends JFrame {
	public PanelLayoutTest() {
		super("panelLayoutTest");
		this.setBounds(200, 300 , 600, 400);
		this.setLayout(null); // null로 넣을 시 기본값 borderLayout
		
		//System.out.println(this.getLayout()); 
		
		JLabel ID = new JLabel("ID : ");
		ID.setLocation(50, 100 );
		ID.setSize(150,50);
		
		
		JTextField text = new JTextField(20);
		text.setLocation(110 , 100);
		text.setSize(200 ,50);
		
		JButton button = new JButton("추가");
		button.setLocation(350 , 100);
		button.setSize(100 , 50);
		//panel에 추가
		JPanel panel = new JPanel();
		panel.setSize(500 , 500);
		
		panel.setLayout(null); //기본값 FlowLayout
		
		panel.add(ID);
		panel.add(text);
		panel.add(button);
		panel.setBackground(Color.PINK);
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
	}
}
