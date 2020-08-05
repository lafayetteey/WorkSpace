package com.gui.part02_layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {
	public FlowLayoutTest() {
		super("FlowLayoutTest");
		this.setBounds(300 , 200 , 600 ,400);
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.add(new JButton("1번"));
		this.add(new JButton("2번"));
		this.add(new JButton("3번"));
		this.add(new JButton("4번"));
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
