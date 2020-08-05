package com.gui.part02_layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	
	public BorderLayoutTest() {
		super("BorderLayoutTest");
		this.setBounds(300 , 200 , 600 ,400);
		
		this.setLayout(new BorderLayout());
		
		this.add(new JButton("북") , "North");
		this.add(new JButton("남") , "South");
		this.add(new JButton("동") , "East");
		this.add(new JButton("서") , "West");
		this.add(new JButton("중앙"), "Center");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
